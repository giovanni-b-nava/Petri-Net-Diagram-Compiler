package mvc;


import java.util.ArrayList;
import java.util.Observable;

import myComponents.Component;


public class Model extends Observable
{

	private ArrayList<Component> petriNet;
	private ArrayList<String> stateNames;
	private ArrayList<String> transitionNames;
	
	private String userInput;
	private String compilerOutput;
	
	private boolean enableCompile;
	private boolean enableMakePDF;
	
	public Model()
	{
		this.userInput = "";
		this.compilerOutput = "";
		
		this.petriNet = new ArrayList<Component>();
		this.stateNames = new ArrayList<String>();
		this.transitionNames = new ArrayList<String>();
		
		enableCompile = true;
		enableMakePDF = false;
	}
	
	public String getUserInput()
	{
		return userInput;
	}

	public void setUserInput(String userInput)
	{
		this.userInput = userInput;
	}
	
	public String getCompilerOutput()
	{
		return compilerOutput;
	}

	public void setCompilerOutput(int id, String compilerOutput)
	{
		this.compilerOutput = compilerOutput;
		
		sendNotify(id);
	}
	
	public ArrayList<Component> getPetriNet()
	{
		return petriNet;
	}

	public void setPetriNet(ArrayList<Component> petriNet)
	{
		this.petriNet = petriNet;
	}
	
	public ArrayList<String> getStateNames() {
		return stateNames;
	}

	public void setStateNames(ArrayList<String> stateNames) {
		this.stateNames = stateNames;
	}

	public ArrayList<String> getTransitionNames() {
		return transitionNames;
	}

	public void setTransitionNames(ArrayList<String> transitionNames) {
		this.transitionNames = transitionNames;
	}

	public boolean isEnableCompile()
	{
		return enableCompile;
	}

	public void enableCompile(boolean enable)
	{
		this.enableCompile = enable;
		
		sendNotify(MyNotify.ENABLE_COMPILE);
	}
	
	public boolean isEnableMakePDF()
	{
		return enableMakePDF;
	}
	
	public void enableMakePDF(boolean enable)
	{
		this.enableMakePDF = enable;
		
		sendNotify(MyNotify.ENABLE_MAKE_PDF);
	}
	
	// Cuts the double quote of a string
	public static String cutDoubleQuote(String s)
	{
		int length = s.length();
		
		if ((length >= 2) && (s.startsWith("\"")) && (s.endsWith("\"")))
			s = s.substring((s.indexOf('"')+1), (length - 1));
		
		return s;
	} 
	
	// Cuts the parenthesis of a string
	public static String cutParenthesis(String s)
	{
		int length = s.length();
		
		if ((length >= 2) && (s.startsWith("(")) && (s.endsWith(")")))
			s = s.substring((s.indexOf('(') + 1), (length - 1));
		 
		return s;
	}
	
	// Replaces the correct characters in the error messages
	public static String replaceSymbol(String errorMessage)
	{
		if (errorMessage.contains("SEMICOL"))
			return errorMessage.replaceAll("SEMICOL", "';'");
		if (errorMessage.contains("OPEN_P"))
			return errorMessage.replaceAll("OPEN_P", "'('");
		if (errorMessage.contains("CLOSE_P"))
			return errorMessage.replaceAll("CLOSE_P", "')'");
		if (errorMessage.contains("DOUBLE_QUOTE"))
			return errorMessage.replaceAll("DOUBLE_QUOTE", "'\" \"'");
		// Required minimum Petri net
		if (errorMessage.contains("required (...)+"))
			return "Required minimum structure (...)+ of a valid Petri net";
			
		// Other errors
		return errorMessage;
	}
	
	// Notify to observers
	private void sendNotify(int notifyID)
	{
		MyNotify notify = new MyNotify(notifyID); 
		
		setChanged();
		
		notifyObservers(notify);
	}
	
}
