package myCompiler;

import java.util.ArrayList;

import myComponents.Component;

public class ParserEnvironment
{
	// List of all the components
	public ArrayList<Component> petriNet;
	public ArrayList<String> stateNames;
	public ArrayList<String> transitionNames;
	// Contains the names of origins and destinations of the connectors 
	public ArrayList<String> referenceNames;

	public ArrayList<String> syntaxError;
	public ArrayList<String> semanticError;

	public ParserEnvironment()
	{
		petriNet = new ArrayList<Component>();
		stateNames = new ArrayList<String>();
		transitionNames = new ArrayList<String>();
		referenceNames = new ArrayList<String>();

		syntaxError = new ArrayList<String>();
		semanticError = new ArrayList<String>();
	}

}
