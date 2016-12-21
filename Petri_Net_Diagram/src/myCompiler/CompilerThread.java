package myCompiler;

import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import mvc.Model;
import mvc.MyNotify;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class CompilerThread implements Runnable
{

	private Model model;
	private languageParser parser;

	public CompilerThread(Model model)
	{
		this.model = model;
	}

	@Override
	public void run()
	{
		CommonTokenStream token;

		try
		{
			// Default lexer and parser operations
			languageLexer lexer = new languageLexer(new ANTLRReaderStream(new StringReader(model.getUserInput())));
			token = new CommonTokenStream(lexer); 
			parser = new languageParser(token);
			parser.petri_net();

			// Number of syntax errors
			int numSyntaxError = parser.env.syntaxError.size();
			
			String compilerOutput = "";

			// NO syntax errors
			if (numSyntaxError == 0)
			{
				// Create a semanticHandler and check all semantic rules
				SemanticHandler semanticHandler = new SemanticHandler(parser.env);
				semanticHandler.checkAllRules();

				// Number of semantic errors
				int numSemanticError = parser.env.semanticError.size();

				// NO syntax errors AND NO semantic errors
				if (numSemanticError == 0)
				{
					compilerOutput = "Petri Net Diagram Generator 1.0 - "
							+ new SimpleDateFormat("MM-dd-yyy HH:mm:ss").format(Calendar.getInstance().getTime()) + ".\n"
							+ "COMPILE SUCCESSFUL";

					// Update the model
					model.setPetriNet(parser.env.petriNet);
					model.setStateNames(parser.env.stateNames);
					model.setTransitionNames(parser.env.transitionNames);
					model.enableMakePDF(true);
					model.setCompilerOutput(MyNotify.COMPILE_SUCCESFULL , compilerOutput);
					
				}
				// There are semantic errors
				else
				{
					for (int i=0; i<parser.env.semanticError.size(); i++)
					{
						compilerOutput += parser.env.semanticError.get(i) + "\n";
					}
					
					// Update the model
					model.enableMakePDF(false);
					model.setCompilerOutput(MyNotify.SEMANTIC_ERRORS, compilerOutput);
				}
			}
			// There are syntax errors
			else
			{
				for (int i = 0; i < numSyntaxError; i++)
					compilerOutput += parser.env.syntaxError.get(i) + "\n";

				// Update the model
				model.enableMakePDF(false);
				model.setCompilerOutput(MyNotify.SYNTAX_ERRORS, compilerOutput);
			}
			
			model.enableCompile(true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
			// Converts StackTrace to String
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			
			// Update the model
			model.enableCompile(true);
			model.enableMakePDF(false);
			model.setCompilerOutput(MyNotify.GENERIC_ERROR, sw.toString());
		}
	}

}
