// $ANTLR 3.4 C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g 2016-03-30 15:14:28

  package myCompiler;
  
  import mvc.*;
  import myComponents.*;
  import org.antlr.runtime.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class languageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ABOVE", "ABOVE_OF", "AMP", "APICS", "ASTERISK", "AT", "B", "BACK_SLASH", "BELOW", "BELOW_OF", "C", "CLOSE_GRAPH", "CLOSE_P", "CLOSE_SB", "COL", "COMMA", "D", "DOT", "DOUBLE_QUOTE", "DRAW_ARROW", "DRAW_CURVED_ARROW", "DRAW_START", "DRAW_STATE", "DRAW_TRANSITION", "E", "EQ", "F", "G", "GREATER_EQ", "GREATER_THAN", "H", "I", "J", "K", "L", "LABEL", "LEFT", "LEFT_OF", "LESS_EQ", "LESS_THAN", "LETTER", "M", "MINUS", "N", "NAME", "NOT_EQ", "NUM_FLOAT", "NUM_INT", "O", "OPEN_GRAPH", "OPEN_P", "OPEN_SB", "OVER", "P", "PERCENT", "PLUS", "Q", "QUEST", "R", "RIGHT", "RIGHT_OF", "S", "SCAN_ERROR", "SEMICOL", "SINGLE_QUOTE", "SLASH", "T", "TOKENS", "U", "UNDER", "UNDERSCORE", "V", "VERT_BAR", "W", "WS", "X", "Y", "Z"
    };

    public static final int EOF=-1;
    public static final int A=4;
    public static final int ABOVE=5;
    public static final int ABOVE_OF=6;
    public static final int AMP=7;
    public static final int APICS=8;
    public static final int ASTERISK=9;
    public static final int AT=10;
    public static final int B=11;
    public static final int BACK_SLASH=12;
    public static final int BELOW=13;
    public static final int BELOW_OF=14;
    public static final int C=15;
    public static final int CLOSE_GRAPH=16;
    public static final int CLOSE_P=17;
    public static final int CLOSE_SB=18;
    public static final int COL=19;
    public static final int COMMA=20;
    public static final int D=21;
    public static final int DOT=22;
    public static final int DOUBLE_QUOTE=23;
    public static final int DRAW_ARROW=24;
    public static final int DRAW_CURVED_ARROW=25;
    public static final int DRAW_START=26;
    public static final int DRAW_STATE=27;
    public static final int DRAW_TRANSITION=28;
    public static final int E=29;
    public static final int EQ=30;
    public static final int F=31;
    public static final int G=32;
    public static final int GREATER_EQ=33;
    public static final int GREATER_THAN=34;
    public static final int H=35;
    public static final int I=36;
    public static final int J=37;
    public static final int K=38;
    public static final int L=39;
    public static final int LABEL=40;
    public static final int LEFT=41;
    public static final int LEFT_OF=42;
    public static final int LESS_EQ=43;
    public static final int LESS_THAN=44;
    public static final int LETTER=45;
    public static final int M=46;
    public static final int MINUS=47;
    public static final int N=48;
    public static final int NAME=49;
    public static final int NOT_EQ=50;
    public static final int NUM_FLOAT=51;
    public static final int NUM_INT=52;
    public static final int O=53;
    public static final int OPEN_GRAPH=54;
    public static final int OPEN_P=55;
    public static final int OPEN_SB=56;
    public static final int OVER=57;
    public static final int P=58;
    public static final int PERCENT=59;
    public static final int PLUS=60;
    public static final int Q=61;
    public static final int QUEST=62;
    public static final int R=63;
    public static final int RIGHT=64;
    public static final int RIGHT_OF=65;
    public static final int S=66;
    public static final int SCAN_ERROR=67;
    public static final int SEMICOL=68;
    public static final int SINGLE_QUOTE=69;
    public static final int SLASH=70;
    public static final int T=71;
    public static final int TOKENS=72;
    public static final int U=73;
    public static final int UNDER=74;
    public static final int UNDERSCORE=75;
    public static final int V=76;
    public static final int VERT_BAR=77;
    public static final int W=78;
    public static final int WS=79;
    public static final int X=80;
    public static final int Y=81;
    public static final int Z=82;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public languageParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public languageParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return languageParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g"; }


      public ParserEnvironment env;

      void init()
      { 
        env = new ParserEnvironment();
      }
     
      // Override of ANTLR syntax error messages 
      public void displayRecognitionError(String[] tokenNames,RecognitionException e)
      {
            String errorHeader = getErrorHeader(e);
            String errorMessage = getErrorMessage(e, tokenNames);
            String errorClass = e.getClass().toString();
            errorClass = errorClass.substring(errorClass.indexOf(" ")+1, errorClass.length());
            
            String syntaxError = "Exception " + errorClass + ": Unresolved compilation problem:" + "\n"
                  + "Syntax error, " + Model.replaceSymbol(errorMessage) + "\n"
                  + "at " + errorHeader;
            
            env.syntaxError.add(syntaxError);   
       }
      



    // $ANTLR start "petri_net"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:83:1: petri_net : start ( state )+ ( transition )+ connector ;
    public final void petri_net() throws RecognitionException {

          // Init the environment
          init();

        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:89:3: ( start ( state )+ ( transition )+ connector )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:90:3: start ( state )+ ( transition )+ connector
            {
            pushFollow(FOLLOW_start_in_petri_net375);
            start();

            state._fsp--;


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:91:3: ( state )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DRAW_STATE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:91:3: state
            	    {
            	    pushFollow(FOLLOW_state_in_petri_net384);
            	    state();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:92:3: ( transition )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DRAW_TRANSITION) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:92:3: transition
            	    {
            	    pushFollow(FOLLOW_transition_in_petri_net390);
            	    transition();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            pushFollow(FOLLOW_connector_in_petri_net396);
            connector();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "petri_net"



    // $ANTLR start "start"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:100:1: start : DRAW_START na= NAME (lb= LABEL )? (tok= TOKENS )? SEMICOL ;
    public final void start() throws RecognitionException {
        Token na=null;
        Token lb=null;
        Token tok=null;

        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:100:6: ( DRAW_START na= NAME (lb= LABEL )? (tok= TOKENS )? SEMICOL )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:100:8: DRAW_START na= NAME (lb= LABEL )? (tok= TOKENS )? SEMICOL
            {
            match(input,DRAW_START,FOLLOW_DRAW_START_in_start444); 

            na=(Token)match(input,NAME,FOLLOW_NAME_in_start455); 

            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:102:10: (lb= LABEL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LABEL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:102:10: lb= LABEL
                    {
                    lb=(Token)match(input,LABEL,FOLLOW_LABEL_in_start466); 

                    }
                    break;

            }


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:103:11: (tok= TOKENS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TOKENS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:103:11: tok= TOKENS
                    {
                    tok=(Token)match(input,TOKENS,FOLLOW_TOKENS_in_start478); 

                    }
                    break;

            }


            match(input,SEMICOL,FOLLOW_SEMICOL_in_start488); 


                      // Create a start component and insert into petriNet
                      String name = na.getText();
                      String label = "";
                      String tokens = "";
                      
                      if (lb != null)
                        label = Model.cutDoubleQuote(lb.getText());
                        
                      if(tok != null)
                        tokens = Model.cutParenthesis(tok.getText());  
                      
                      Start start = new Start(name, label, tokens);
                      
                      env.petriNet.add(start);
                      env.stateNames.add(name);
                   

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "number"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:127:1: number returns [String n] : (m= MINUS |p= PLUS )? (i= NUM_INT |f= NUM_FLOAT ) ;
    public final String number() throws RecognitionException {
        String n = null;


        Token m=null;
        Token p=null;
        Token i=null;
        Token f=null;

        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:128:7: ( (m= MINUS |p= PLUS )? (i= NUM_INT |f= NUM_FLOAT ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:129:7: (m= MINUS |p= PLUS )? (i= NUM_INT |f= NUM_FLOAT )
            {
            n = "";

            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:130:7: (m= MINUS |p= PLUS )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==MINUS) ) {
                alt5=1;
            }
            else if ( (LA5_0==PLUS) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:131:9: m= MINUS
                    {
                    m=(Token)match(input,MINUS,FOLLOW_MINUS_in_number558); 

                     if (m != null) n = n.concat(m.getText());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:133:9: p= PLUS
                    {
                    p=(Token)match(input,PLUS,FOLLOW_PLUS_in_number582); 

                     if (p != null) n = n.concat(p.getText());

                    }
                    break;

            }


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:135:7: (i= NUM_INT |f= NUM_FLOAT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NUM_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==NUM_FLOAT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:136:9: i= NUM_INT
                    {
                    i=(Token)match(input,NUM_INT,FOLLOW_NUM_INT_in_number613); 

                     n = n.concat(i.getText());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:138:9: f= NUM_FLOAT
                    {
                    f=(Token)match(input,NUM_FLOAT,FOLLOW_NUM_FLOAT_in_number638); 

                     n = n.concat(f.getText());

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "number"



    // $ANTLR start "state"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:144:1: state : DRAW_STATE po= position naref= NAME nam= NAME (lab= LABEL )? (tok= TOKENS )? SEMICOL ;
    public final void state() throws RecognitionException {
        Token naref=null;
        Token nam=null;
        Token lab=null;
        Token tok=null;
        String po =null;


        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:144:6: ( DRAW_STATE po= position naref= NAME nam= NAME (lab= LABEL )? (tok= TOKENS )? SEMICOL )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:145:7: DRAW_STATE po= position naref= NAME nam= NAME (lab= LABEL )? (tok= TOKENS )? SEMICOL
            {
            match(input,DRAW_STATE,FOLLOW_DRAW_STATE_in_state672); 

            pushFollow(FOLLOW_position_in_state683);
            po=position();

            state._fsp--;


            naref=(Token)match(input,NAME,FOLLOW_NAME_in_state693); 

            nam=(Token)match(input,NAME,FOLLOW_NAME_in_state703); 

            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:149:10: (lab= LABEL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LABEL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:149:10: lab= LABEL
                    {
                    lab=(Token)match(input,LABEL,FOLLOW_LABEL_in_state713); 

                    }
                    break;

            }


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:150:10: (tok= TOKENS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==TOKENS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:150:10: tok= TOKENS
                    {
                    tok=(Token)match(input,TOKENS,FOLLOW_TOKENS_in_state724); 

                    }
                    break;

            }


            match(input,SEMICOL,FOLLOW_SEMICOL_in_state733); 


                    // Create a state component and insert into petriNet
                    String position = po;
                    String nameRef = naref.getText();
                    
                    String name = nam.getText();
                    String label = "";
                    String tokens = "";
                      
                    if (lab != null)
                      label = Model.cutDoubleQuote(lab.getText());
                    
                    if(tok != null)
                      tokens = Model.cutParenthesis(tok.getText());
                    
                    Component state = new State(position, nameRef, name, label, tokens);
                    
                    env.petriNet.add(state);
                    env.stateNames.add(name);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "state"



    // $ANTLR start "position"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:188:1: position returns [String s] : (l= LEFT_OF |r= RIGHT_OF |a= ABOVE_OF |b= BELOW_OF ) ;
    public final String position() throws RecognitionException {
        String s = null;


        Token l=null;
        Token r=null;
        Token a=null;
        Token b=null;

        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:189:9: ( (l= LEFT_OF |r= RIGHT_OF |a= ABOVE_OF |b= BELOW_OF ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:190:9: (l= LEFT_OF |r= RIGHT_OF |a= ABOVE_OF |b= BELOW_OF )
            {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:190:9: (l= LEFT_OF |r= RIGHT_OF |a= ABOVE_OF |b= BELOW_OF )
            int alt9=4;
            switch ( input.LA(1) ) {
            case LEFT_OF:
                {
                alt9=1;
                }
                break;
            case RIGHT_OF:
                {
                alt9=2;
                }
                break;
            case ABOVE_OF:
                {
                alt9=3;
                }
                break;
            case BELOW_OF:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:191:11: l= LEFT_OF
                    {
                    l=(Token)match(input,LEFT_OF,FOLLOW_LEFT_OF_in_position877); 

                    s = l.getText();

                    }
                    break;
                case 2 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:193:11: r= RIGHT_OF
                    {
                    r=(Token)match(input,RIGHT_OF,FOLLOW_RIGHT_OF_in_position905); 

                    s = r.getText();

                    }
                    break;
                case 3 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:195:11: a= ABOVE_OF
                    {
                    a=(Token)match(input,ABOVE_OF,FOLLOW_ABOVE_OF_in_position933); 

                    s = a.getText();

                    }
                    break;
                case 4 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:197:11: b= BELOW_OF
                    {
                    b=(Token)match(input,BELOW_OF,FOLLOW_BELOW_OF_in_position961); 

                    s = b.getText();

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "position"



    // $ANTLR start "transition"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:203:1: transition : DRAW_TRANSITION pos= position narefe= NAME names= NAME (lbl= LABEL )? SEMICOL ;
    public final void transition() throws RecognitionException {
        Token narefe=null;
        Token names=null;
        Token lbl=null;
        String pos =null;


        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:203:11: ( DRAW_TRANSITION pos= position narefe= NAME names= NAME (lbl= LABEL )? SEMICOL )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:204:5: DRAW_TRANSITION pos= position narefe= NAME names= NAME (lbl= LABEL )? SEMICOL
            {
            match(input,DRAW_TRANSITION,FOLLOW_DRAW_TRANSITION_in_transition995); 

            pushFollow(FOLLOW_position_in_transition1004);
            pos=position();

            state._fsp--;


            narefe=(Token)match(input,NAME,FOLLOW_NAME_in_transition1012); 

            names=(Token)match(input,NAME,FOLLOW_NAME_in_transition1020); 

            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:208:8: (lbl= LABEL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LABEL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:208:8: lbl= LABEL
                    {
                    lbl=(Token)match(input,LABEL,FOLLOW_LABEL_in_transition1028); 

                    }
                    break;

            }


            match(input,SEMICOL,FOLLOW_SEMICOL_in_transition1035); 


                  // Create a transition and insert it into petriNet
                  String position = pos;
                  String nameRef = narefe.getText();
                 
                  String name = names.getText();
                  String label = "";
                      
                    if (lbl != null)
                      label = Model.cutDoubleQuote(lbl.getText());
                  
                  Component transition = new Transition(position, nameRef, name, label);
                  
                  env.petriNet.add(transition);
                  env.transitionNames.add(name);

                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "transition"



    // $ANTLR start "connector"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:232:1: connector : arrow ( arrow )+ ;
    public final void connector() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:232:10: ( arrow ( arrow )+ )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:233:12: arrow ( arrow )+
            {
            pushFollow(FOLLOW_arrow_in_connector1070);
            arrow();

            state._fsp--;


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:234:12: ( arrow )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= DRAW_ARROW && LA11_0 <= DRAW_CURVED_ARROW)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:234:13: arrow
            	    {
            	    pushFollow(FOLLOW_arrow_in_connector1085);
            	    arrow();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "connector"



    // $ANTLR start "arrow"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:239:1: arrow : ( straight_arrow | curved_arrow ) ;
    public final void arrow() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:239:6: ( ( straight_arrow | curved_arrow ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:240:7: ( straight_arrow | curved_arrow )
            {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:240:7: ( straight_arrow | curved_arrow )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DRAW_ARROW) ) {
                alt12=1;
            }
            else if ( (LA12_0==DRAW_CURVED_ARROW) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:241:9: straight_arrow
                    {
                    pushFollow(FOLLOW_straight_arrow_in_arrow1125);
                    straight_arrow();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:241:26: curved_arrow
                    {
                    pushFollow(FOLLOW_curved_arrow_in_arrow1129);
                    curved_arrow();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arrow"



    // $ANTLR start "straight_arrow"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:247:1: straight_arrow : DRAW_ARROW or= NAME des= NAME SEMICOL ;
    public final void straight_arrow() throws RecognitionException {
        Token or=null;
        Token des=null;

        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:247:15: ( DRAW_ARROW or= NAME des= NAME SEMICOL )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:248:15: DRAW_ARROW or= NAME des= NAME SEMICOL
            {
            match(input,DRAW_ARROW,FOLLOW_DRAW_ARROW_in_straight_arrow1167); 

            or=(Token)match(input,NAME,FOLLOW_NAME_in_straight_arrow1185); 

            des=(Token)match(input,NAME,FOLLOW_NAME_in_straight_arrow1203); 

            match(input,SEMICOL,FOLLOW_SEMICOL_in_straight_arrow1219); 


                            // Create a straightArrow component and insert into petriNet
                            Connector straightArrow = new StraightArrow(or.getText(),des.getText());
                            env.petriNet.add(straightArrow);
                            env.referenceNames.add(or.getText());
                            env.referenceNames.add(des.getText());
                          

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "straight_arrow"



    // $ANTLR start "curved_arrow"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:263:1: curved_arrow : DRAW_CURVED_ARROW ori= NAME dest= NAME be= bend SEMICOL ;
    public final void curved_arrow() throws RecognitionException {
        Token ori=null;
        Token dest=null;
        String be =null;


        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:263:13: ( DRAW_CURVED_ARROW ori= NAME dest= NAME be= bend SEMICOL )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:264:14: DRAW_CURVED_ARROW ori= NAME dest= NAME be= bend SEMICOL
            {
            match(input,DRAW_CURVED_ARROW,FOLLOW_DRAW_CURVED_ARROW_in_curved_arrow1280); 

            ori=(Token)match(input,NAME,FOLLOW_NAME_in_curved_arrow1297); 

            dest=(Token)match(input,NAME,FOLLOW_NAME_in_curved_arrow1314); 

            pushFollow(FOLLOW_bend_in_curved_arrow1333);
            be=bend();

            state._fsp--;


            match(input,SEMICOL,FOLLOW_SEMICOL_in_curved_arrow1351); 


                            // Create a curvedArrow component and insert into petriNet
                            String bend = "";
                      
            				        if (be != null)
            				          bend = Model.cutParenthesis(be);
            				        Connector curvedArrow = new CurvedArrow(ori.getText(),dest.getText(), bend);
            				        env.petriNet.add(curvedArrow);
            				        env.referenceNames.add(ori.getText());
                            env.referenceNames.add(dest.getText());
                         

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "curved_arrow"



    // $ANTLR start "bend"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:284:1: bend returns [String bend] : (op= OPEN_P ex= exit_from_element cp= CLOSE_P ) ;
    public final String bend() throws RecognitionException {
        String bend = null;


        Token op=null;
        Token cp=null;
        String ex =null;


        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:284:28: ( (op= OPEN_P ex= exit_from_element cp= CLOSE_P ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:285:7: (op= OPEN_P ex= exit_from_element cp= CLOSE_P )
            {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:285:7: (op= OPEN_P ex= exit_from_element cp= CLOSE_P )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:286:9: op= OPEN_P ex= exit_from_element cp= CLOSE_P
            {
            op=(Token)match(input,OPEN_P,FOLLOW_OPEN_P_in_bend1414); 

            pushFollow(FOLLOW_exit_from_element_in_bend1428);
            ex=exit_from_element();

            state._fsp--;


            cp=(Token)match(input,CLOSE_P,FOLLOW_CLOSE_P_in_bend1443); 

            bend = "";
                     bend += op.getText() + ex + cp.getText(); 
                    

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return bend;
    }
    // $ANTLR end "bend"



    // $ANTLR start "exit_from_element"
    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:297:1: exit_from_element returns [String exit] : (l= LEFT |r= RIGHT ) ;
    public final String exit_from_element() throws RecognitionException {
        String exit = null;


        Token l=null;
        Token r=null;

        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:297:41: ( (l= LEFT |r= RIGHT ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:298:11: (l= LEFT |r= RIGHT )
            {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:298:11: (l= LEFT |r= RIGHT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LEFT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RIGHT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:299:13: l= LEFT
                    {
                    l=(Token)match(input,LEFT,FOLLOW_LEFT_in_exit_from_element1509); 


                                  exit = l.getText();
                                

                    }
                    break;
                case 2 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:304:13: r= RIGHT
                    {
                    r=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_exit_from_element1554); 


                                  exit = r.getText();
                                

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return exit;
    }
    // $ANTLR end "exit_from_element"

    // Delegated rules


 

    public static final BitSet FOLLOW_start_in_petri_net375 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_state_in_petri_net384 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_transition_in_petri_net390 = new BitSet(new long[]{0x0000000013000000L});
    public static final BitSet FOLLOW_connector_in_petri_net396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_START_in_start444 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_start455 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_LABEL_in_start466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_TOKENS_in_start478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOL_in_start488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number558 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_PLUS_in_number582 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_NUM_INT_in_number613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_FLOAT_in_number638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_STATE_in_state672 = new BitSet(new long[]{0x0000040000004040L,0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_state683 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_state693 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_state703 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_LABEL_in_state713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_TOKENS_in_state724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOL_in_state733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_OF_in_position877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_OF_in_position905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABOVE_OF_in_position933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BELOW_OF_in_position961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_TRANSITION_in_transition995 = new BitSet(new long[]{0x0000040000004040L,0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_transition1004 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_transition1012 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_transition1020 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LABEL_in_transition1028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOL_in_transition1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrow_in_connector1070 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_arrow_in_connector1085 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_straight_arrow_in_arrow1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_curved_arrow_in_arrow1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_ARROW_in_straight_arrow1167 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_straight_arrow1185 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_straight_arrow1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOL_in_straight_arrow1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_CURVED_ARROW_in_curved_arrow1280 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_curved_arrow1297 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NAME_in_curved_arrow1314 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_bend_in_curved_arrow1333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOL_in_curved_arrow1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_P_in_bend1414 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_exit_from_element_in_bend1428 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_P_in_bend1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_exit_from_element1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_exit_from_element1554 = new BitSet(new long[]{0x0000000000000002L});

}