package latex;

import java.util.ArrayList;

import mvc.Model;
import myComponents.Component;
import myComponents.CurvedArrow;
import myComponents.Start;
import myComponents.State;
import myComponents.StraightArrow;
import myComponents.Transition;

public class LaTeXConverter
{

	// Static string working as style settings for LaTex 
	public final static String preamble = "\\documentclass{article}" + "\n"
			+ "\\usepackage{tikz}" + "\n"
			+ "\\usetikzlibrary{arrows,backgrounds,positioning,fit,petri}" + "\n"
			+ "\\begin{document}" +"\n"
			+ "\\begin{tikzpicture} [" + "\n"
			+ "node distance=2.6cm,on grid,>=stealth'," + "\n"
			+ "bend angle=45," + "\n"
			+ "auto," + "\n"
			+ "every place/.style= {minimum size=12mm,thick,draw=blue!75,fill=blue!20}," + "\n"
			+ "every transition/.style={thick,draw=black!75,fill=black!20}," + "\n"
			+ "every label/.style= {red}" + "\n"
			+ "]" + "\n";

	private Model model;

	public LaTeXConverter(Model model)
	{
		this.model = model;
	}

	// Generates the string with the list of elements to add to the prologue
	private String elementList()
	{
		ArrayList<String> elements = new ArrayList<String>();
		elements.addAll(model.getStateNames());
		elements.addAll(model.getTransitionNames());

		String list = "";
		for(String s : elements) 
		{
			list+="(" + s + ")";
		}

		return list;
	}

	// Format replacement for LaTeX
	private String positionFormat(String input)
	{
		return input.replaceAll("_", "=").toLowerCase();
	}

	// String generator for LaTeX 
	public String makeLatexCode()
	{

		String outputString = preamble;

		for (Component c : model.getPetriNet())
		{
			if (c instanceof Start){
				Start start = (Start) c;
				String name = start.getName();
				String label = start.getLabel();
				String tokens = start.getTokens();

				outputString += "\\node [place, tokens=" + tokens + "] (" + name + ") [label=above:$" + label + "$] {};" + "\n";
			}
			else if (c instanceof State)
			{
				State state = (State) c;
				String nameRef = state.getNameRef();
				String position = positionFormat(state.getPosition());
				String name = state.getName();
				String label = state.getLabel();
				String tokens = state.getTokens();

				outputString += "\\node [place, tokens=" + tokens + "] (" + name + ") [" + position + " " + nameRef + ",label=above:$" + label + "$] {};" + "\n";

			}
			else if (c instanceof Transition)
			{

				Transition transition = (Transition) c;
				String nameRef = transition.getNameRef();
				String position = positionFormat(transition.getPosition());
				String name = transition.getName();
				String label = transition.getLabel();

				outputString += "\\node [transition] (" + name + ") [" + position + " " + nameRef + ",label=above:$" + label + "$] {};" + "\n";

			}
			else if (c instanceof CurvedArrow)
			{
				CurvedArrow curvedArrow = (CurvedArrow) c;
				String nameStart = curvedArrow.getNameStart();
				String nameEnd = curvedArrow.getNameEnd();
				String bend = curvedArrow.getBend();

				outputString += "\\draw [post] (" + nameStart + ") to [bend "+ bend + "] (" + nameEnd + ");" + "\n";

			}
			else if (c instanceof StraightArrow)
			{
				StraightArrow straightArrow = (StraightArrow) c;
				String nameStart = straightArrow.getNameStart();
				String nameEnd = straightArrow.getNameEnd();

				outputString += "\\draw [post] (" + nameStart + ") to (" + nameEnd + ");" + "\n";

			}
		}

		// String that contains the prologue of the LaTeX
		String prologue = "\\begin{scope}[on background layer]" +"\n"
				+ "\\node [fill=yellow!30,rounded corners,fit=" + elementList() + "] {};" +"\n"
				+ "\\end{scope}" + "\n"
				+ "\\end{tikzpicture}" + "\n"
				+ "\\end{document}";

		outputString += prologue;

		return outputString;
	}

}
