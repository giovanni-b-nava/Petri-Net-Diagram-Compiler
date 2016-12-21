package myCompiler;

import myComponents.Component;
import myComponents.Connector;
import myComponents.CurvedArrow;
import myComponents.Start;
import myComponents.State;
import myComponents.StraightArrow;
import myComponents.Transition;

public class SemanticHandler
{

	ParserEnvironment env;

	// Types of semantic errors
	private String MISSING_REFERENCE = "Missing positioning reference for the item";
	private String NAME_ITEM_DUPLICATED = "Item name is duplicated";
	private String STATE_UNLINKED = "State unlinked";
	private String TRANSITION_UNLINKED = "Transition unlinked";
	private String INVALID_LINK = "Invalid link between two states or transitions";
	private String AUTOREFERENCE = "Invalid autoreference positioning for the item";
	private String INVALID_TOKENS = "The number of tokens must between 0 and 3 for the state";

	// Constructor
	public SemanticHandler(ParserEnvironment env)
	{
		this.env = env;
	}

	// Launches all the semantic controls
	public void checkAllRules()
	{
		checkMissingRefence();
		checkNameItemDuplicated();
		checkStateUnlinked();
		checkTransitionUnlinked();
		checkInvalidStateLink();
		checkAutoreference();
		checkInvalidTokens();
	}

	// Error String Generator
	private String getErrorGenerator(int rowIndex, String errorType)
	{
		String semanticError = "Unresolved compilation problem:" + "\n"
				+ "Semantic error, " + errorType + "\n"
				+ "at line " + (rowIndex+1);
		return semanticError;
	}

	// Check for missing references 
	private void checkMissingRefence()
	{
		for (int i=1; i < env.petriNet.size(); i++)
		{
			Component c = env.petriNet.get(i);

			// Check State component (nameRef) in stateNames AND transitionNames
			if (c instanceof State)
			{
				State state = (State) c;
				String nameRef = state.getNameRef();

				if (!(env.stateNames.contains(nameRef)) && !(env.transitionNames.contains(nameRef)))
					env.semanticError.add(getErrorGenerator(i,MISSING_REFERENCE));
			}
			// Check Transition component (nameRef) in stateNames AND transitionNames
			else if (c instanceof Transition)
			{

				Transition transition = (Transition) c;
				String nameRef = transition.getNameRef();

				if (!(env.stateNames.contains(nameRef)) && !(env.transitionNames.contains(nameRef)))
					env.semanticError.add(getErrorGenerator(i,MISSING_REFERENCE));
			}
			// Check CurvedArrow component (nameStart, nameEnd) in stateNames AND transitionNames
			else if (c instanceof CurvedArrow)
			{
				CurvedArrow curvedArrow = (CurvedArrow) c;
				String nameStart = curvedArrow.getNameStart();
				String nameEnd = curvedArrow.getNameEnd();

				if	((!(env.stateNames.contains(nameStart))&&!(env.transitionNames.contains(nameStart)))
						|| (!(env.stateNames.contains(nameEnd)) &&!(env.transitionNames.contains(nameEnd))))
					env.semanticError.add(getErrorGenerator(i,MISSING_REFERENCE));
			}
			// Check StraightArrow component (nameStart, nameEnd) in stateNames AND transitionNames
			else if (c instanceof StraightArrow)
			{
				StraightArrow straightArrow = (StraightArrow) c;
				String nameStart = straightArrow.getNameStart();
				String nameEnd = straightArrow.getNameEnd();

				if	((!(env.stateNames.contains(nameStart))&&!(env.transitionNames.contains(nameStart)))
						|| (!(env.stateNames.contains(nameEnd)) &&!(env.transitionNames.contains(nameEnd))))
					env.semanticError.add(getErrorGenerator(i,MISSING_REFERENCE));
			}
		}
	}

	// Check for duplicated names
	private void checkNameItemDuplicated()
	{
		for (int i=1; i < env.petriNet.size(); i++)
		{
			Component c = env.petriNet.get(i);
			String name = "";

			if (c instanceof State)
			{
				State state = (State) c;
				name = state.getName();
			}
			else if (c instanceof Transition)
			{
				Transition transition = (Transition) c;
				name = transition.getName();
			}

			// Check all the previous components in the petriNet
			for (int j=0 ; j<i; j++){

				Component c2 = env.petriNet.get(j);
				if (c2 instanceof Start)
				{
					Start start2 = (Start) c2;
					String name2 = start2.getName();
					if (name.equals(name2)){
						env.semanticError.add(getErrorGenerator(i,NAME_ITEM_DUPLICATED));
						break;
					}

				}
				else if (c2 instanceof State){
					State state2 = (State) c2;
					String name2 = state2.getName();
					if(name.equals(name2)){
						env.semanticError.add(getErrorGenerator(i,NAME_ITEM_DUPLICATED));
						break;
					}
				}
				else if(c2 instanceof Transition){
					Transition transition2 = (Transition) c2;
					String name2 = transition2.getName();
					if (name.equals(name2)){
						env.semanticError.add(getErrorGenerator(i,NAME_ITEM_DUPLICATED));
						break;
					}

				}
			}
		}
	}

	// Check for States not connected with the rest of the net 
	private void checkStateUnlinked()
	{
		for (int i=0; i < env.petriNet.size(); i++)
		{
			Component c = env.petriNet.get(i);

			if (c instanceof Start)
			{
				Start start = (Start) c;
				String name = start.getName();

				if (!(env.referenceNames.contains(name)))
					env.semanticError.add(getErrorGenerator(i,STATE_UNLINKED));
			}
			else if (c instanceof State)
			{
				State state = (State) c;
				String name = state.getName();

				if (!(env.referenceNames.contains(name)))
					env.semanticError.add(getErrorGenerator(i,STATE_UNLINKED));
			}

		}
	}

	// Check for Transitions not connected with the rest of the net 
	private void checkTransitionUnlinked()
	{
		for (int i=1; i < env.petriNet.size(); i++)
		{
			Component c = env.petriNet.get(i);

			if (c instanceof Transition)
			{
				Transition state = (Transition) c;
				String name = state.getName();

				if (!(env.referenceNames.contains(name)))
					env.semanticError.add(getErrorGenerator(i,TRANSITION_UNLINKED));
			}
		}
	}

	// Check if a State is connected to an other State or a Transition is connected to an other Transition 
	private void checkInvalidStateLink()
	{
		for (int i=1; i < env.petriNet.size(); i++)
		{
			Component c = env.petriNet.get(i);

			if (c instanceof StraightArrow || c instanceof CurvedArrow)
			{
				Connector arrow = (Connector) c;
				String origin = arrow.getNameStart();
				String destination = arrow.getNameEnd();

				if (((env.stateNames.contains(origin)) && (env.stateNames.contains(destination))) ||
						((env.transitionNames.contains(origin)) && (env.transitionNames.contains(destination))))
					env.semanticError.add(getErrorGenerator(i,INVALID_LINK));
			}
		}

	}

	// Check for autoreference positioning 
	private void checkAutoreference()
	{
		for (int i=1; i < env.petriNet.size(); i++)
		{
			Component c = env.petriNet.get(i);

			if (c instanceof State)
			{
				State state = (State) c;

				if (state.getName().equals(state.getNameRef()))
					env.semanticError.add(getErrorGenerator(i,AUTOREFERENCE));
			}
			else if (c instanceof Transition)
			{
				Transition transition = (Transition) c;

				if (transition.getName().equals(transition.getNameRef()))
					env.semanticError.add(getErrorGenerator(i,AUTOREFERENCE));
			}
		}
	}

	// Check if the number of token is between 0 and 3 for the states
	private void checkInvalidTokens() {

		for (int i=0; i < env.petriNet.size(); i++)
		{
			Component c = env.petriNet.get(i);

			if (c instanceof Start)
			{
				Start start = (Start) c;
				int tokens = 0;
				if(!start.getTokens().equals(""))
					tokens = Integer.parseInt(start.getTokens());

				if (tokens < 0 || tokens > 3)
					env.semanticError.add(getErrorGenerator(i,INVALID_TOKENS));
			}
			else if (c instanceof State)
			{
				State state = (State) c;
				int tokens = Integer.parseInt(state.getTokens());

				if (tokens < 0 || tokens > 3)
					env.semanticError.add(getErrorGenerator(i,INVALID_TOKENS));
			}

		}

	}
}
