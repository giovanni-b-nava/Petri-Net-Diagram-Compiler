// $ANTLR 3.4 C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g 2016-03-30 15:14:29
 
  package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class languageLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public languageLexer() {} 
    public languageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public languageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g"; }

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:55:12: ( 'A' | 'a' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:56:12: ( 'B' | 'b' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:57:12: ( 'C' | 'c' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:58:12: ( 'D' | 'd' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:59:12: ( 'E' | 'e' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:60:12: ( 'F' | 'f' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:61:12: ( 'G' | 'g' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:62:12: ( 'H' | 'h' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:63:12: ( 'I' | 'i' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:64:12: ( 'J' | 'j' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:65:12: ( 'K' | 'k' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:66:12: ( 'L' | 'l' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:67:12: ( 'M' | 'm' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:68:12: ( 'N' | 'n' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:69:12: ( 'O' | 'o' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:70:12: ( 'P' | 'p' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:71:12: ( 'Q' | 'q' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:72:12: ( 'R' | 'r' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:73:12: ( 'S' | 's' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:74:12: ( 'T' | 't' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:75:12: ( 'U' | 'u' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:76:12: ( 'V' | 'v' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:77:12: ( 'W' | 'w' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:78:12: ( 'X' | 'x' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:79:12: ( 'Y' | 'y' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:80:12: ( 'Z' | 'z' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "TOKENS"
    public final void mTOKENS() throws RecognitionException {
        try {
            int _type = TOKENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:177:7: ( ( OPEN_P ( MINUS | PLUS )? ( NUM_INT )+ CLOSE_P ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:178:7: ( OPEN_P ( MINUS | PLUS )? ( NUM_INT )+ CLOSE_P )
            {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:178:7: ( OPEN_P ( MINUS | PLUS )? ( NUM_INT )+ CLOSE_P )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:178:9: OPEN_P ( MINUS | PLUS )? ( NUM_INT )+ CLOSE_P
            {
            mOPEN_P(); 


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:180:7: ( MINUS | PLUS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:182:7: ( NUM_INT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:182:9: NUM_INT
            	    {
            	    mNUM_INT(); 


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


            mCLOSE_P(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TOKENS"

    // $ANTLR start "DRAW_START"
    public final void mDRAW_START() throws RecognitionException {
        try {
            int _type = DRAW_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:318:11: ( D R A W UNDERSCORE S T A R T )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:318:13: D R A W UNDERSCORE S T A R T
            {
            mD(); 


            mR(); 


            mA(); 


            mW(); 


            mUNDERSCORE(); 


            mS(); 


            mT(); 


            mA(); 


            mR(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRAW_START"

    // $ANTLR start "DRAW_ARROW"
    public final void mDRAW_ARROW() throws RecognitionException {
        try {
            int _type = DRAW_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:322:11: ( D R A W UNDERSCORE A R R O W )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:322:13: D R A W UNDERSCORE A R R O W
            {
            mD(); 


            mR(); 


            mA(); 


            mW(); 


            mUNDERSCORE(); 


            mA(); 


            mR(); 


            mR(); 


            mO(); 


            mW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRAW_ARROW"

    // $ANTLR start "DRAW_CURVED_ARROW"
    public final void mDRAW_CURVED_ARROW() throws RecognitionException {
        try {
            int _type = DRAW_CURVED_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:326:18: ( D R A W UNDERSCORE C U R V E D UNDERSCORE A R R O W )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:326:21: D R A W UNDERSCORE C U R V E D UNDERSCORE A R R O W
            {
            mD(); 


            mR(); 


            mA(); 


            mW(); 


            mUNDERSCORE(); 


            mC(); 


            mU(); 


            mR(); 


            mV(); 


            mE(); 


            mD(); 


            mUNDERSCORE(); 


            mA(); 


            mR(); 


            mR(); 


            mO(); 


            mW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRAW_CURVED_ARROW"

    // $ANTLR start "DRAW_STATE"
    public final void mDRAW_STATE() throws RecognitionException {
        try {
            int _type = DRAW_STATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:330:11: ( D R A W UNDERSCORE S T A T E )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:330:14: D R A W UNDERSCORE S T A T E
            {
            mD(); 


            mR(); 


            mA(); 


            mW(); 


            mUNDERSCORE(); 


            mS(); 


            mT(); 


            mA(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRAW_STATE"

    // $ANTLR start "DRAW_TRANSITION"
    public final void mDRAW_TRANSITION() throws RecognitionException {
        try {
            int _type = DRAW_TRANSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:334:16: ( D R A W UNDERSCORE T R A N S I T I O N )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:334:19: D R A W UNDERSCORE T R A N S I T I O N
            {
            mD(); 


            mR(); 


            mA(); 


            mW(); 


            mUNDERSCORE(); 


            mT(); 


            mR(); 


            mA(); 


            mN(); 


            mS(); 


            mI(); 


            mT(); 


            mI(); 


            mO(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRAW_TRANSITION"

    // $ANTLR start "LEFT_OF"
    public final void mLEFT_OF() throws RecognitionException {
        try {
            int _type = LEFT_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:338:8: ( L E F T UNDERSCORE O F )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:338:10: L E F T UNDERSCORE O F
            {
            mL(); 


            mE(); 


            mF(); 


            mT(); 


            mUNDERSCORE(); 


            mO(); 


            mF(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_OF"

    // $ANTLR start "RIGHT_OF"
    public final void mRIGHT_OF() throws RecognitionException {
        try {
            int _type = RIGHT_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:342:9: ( R I G H T UNDERSCORE O F )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:342:11: R I G H T UNDERSCORE O F
            {
            mR(); 


            mI(); 


            mG(); 


            mH(); 


            mT(); 


            mUNDERSCORE(); 


            mO(); 


            mF(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_OF"

    // $ANTLR start "ABOVE_OF"
    public final void mABOVE_OF() throws RecognitionException {
        try {
            int _type = ABOVE_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:346:9: ( A B O V E UNDERSCORE O F )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:346:11: A B O V E UNDERSCORE O F
            {
            mA(); 


            mB(); 


            mO(); 


            mV(); 


            mE(); 


            mUNDERSCORE(); 


            mO(); 


            mF(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABOVE_OF"

    // $ANTLR start "BELOW_OF"
    public final void mBELOW_OF() throws RecognitionException {
        try {
            int _type = BELOW_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:350:9: ( B E L O W UNDERSCORE O F )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:350:11: B E L O W UNDERSCORE O F
            {
            mB(); 


            mE(); 


            mL(); 


            mO(); 


            mW(); 


            mUNDERSCORE(); 


            mO(); 


            mF(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BELOW_OF"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:354:5: ( L E F T )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:354:7: L E F T
            {
            mL(); 


            mE(); 


            mF(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:358:6: ( R I G H T )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:358:8: R I G H T
            {
            mR(); 


            mI(); 


            mG(); 


            mH(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "ABOVE"
    public final void mABOVE() throws RecognitionException {
        try {
            int _type = ABOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:362:6: ( A B O V E )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:362:8: A B O V E
            {
            mA(); 


            mB(); 


            mO(); 


            mV(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABOVE"

    // $ANTLR start "BELOW"
    public final void mBELOW() throws RecognitionException {
        try {
            int _type = BELOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:366:6: ( B E L O W )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:366:8: B E L O W
            {
            mB(); 


            mE(); 


            mL(); 


            mO(); 


            mW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BELOW"

    // $ANTLR start "OVER"
    public final void mOVER() throws RecognitionException {
        try {
            int _type = OVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:370:5: ( O V E R )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:370:7: O V E R
            {
            mO(); 


            mV(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OVER"

    // $ANTLR start "UNDER"
    public final void mUNDER() throws RecognitionException {
        try {
            int _type = UNDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:374:6: ( U N D E R )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:374:8: U N D E R
            {
            mU(); 


            mN(); 


            mD(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:379:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:387:14: ( '@' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:387:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "DOUBLE_QUOTE"
    public final void mDOUBLE_QUOTE() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:388:14: ( '\"' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:388:16: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_QUOTE"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:389:14: ( '%' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:389:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "AMP"
    public final void mAMP() throws RecognitionException {
        try {
            int _type = AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:390:14: ( '&' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:390:16: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMP"

    // $ANTLR start "SINGLE_QUOTE"
    public final void mSINGLE_QUOTE() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:391:14: ( '\\'' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:391:16: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_QUOTE"

    // $ANTLR start "OPEN_P"
    public final void mOPEN_P() throws RecognitionException {
        try {
            int _type = OPEN_P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:392:14: ( '(' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:392:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_P"

    // $ANTLR start "CLOSE_P"
    public final void mCLOSE_P() throws RecognitionException {
        try {
            int _type = CLOSE_P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:393:14: ( ')' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:393:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_P"

    // $ANTLR start "OPEN_SB"
    public final void mOPEN_SB() throws RecognitionException {
        try {
            int _type = OPEN_SB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:394:14: ( '[' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:394:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_SB"

    // $ANTLR start "OPEN_GRAPH"
    public final void mOPEN_GRAPH() throws RecognitionException {
        try {
            int _type = OPEN_GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:395:14: ( '{' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:395:16: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_GRAPH"

    // $ANTLR start "CLOSE_GRAPH"
    public final void mCLOSE_GRAPH() throws RecognitionException {
        try {
            int _type = CLOSE_GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:396:14: ( '}' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:396:16: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_GRAPH"

    // $ANTLR start "CLOSE_SB"
    public final void mCLOSE_SB() throws RecognitionException {
        try {
            int _type = CLOSE_SB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:397:14: ( ']' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:397:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_SB"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:398:14: ( '*' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:398:16: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:399:14: ( '+' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:399:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:400:14: ( '-' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:400:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:401:14: ( '.' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:401:16: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:402:14: ( ',' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:402:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COL"
    public final void mCOL() throws RecognitionException {
        try {
            int _type = COL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:403:14: ( ':' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:403:16: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COL"

    // $ANTLR start "SEMICOL"
    public final void mSEMICOL() throws RecognitionException {
        try {
            int _type = SEMICOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:404:14: ( ';' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:404:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOL"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:405:14: ( '/' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:405:16: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "BACK_SLASH"
    public final void mBACK_SLASH() throws RecognitionException {
        try {
            int _type = BACK_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:406:14: ( '\\\\' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:406:16: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACK_SLASH"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:407:14: ( '=' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:407:16: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:408:14: ( '<>' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:408:16: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "LESS_THAN"
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:409:14: ( '<' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:409:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN"

    // $ANTLR start "GREATER_THAN"
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:410:14: ( '>' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:410:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_THAN"

    // $ANTLR start "LESS_EQ"
    public final void mLESS_EQ() throws RecognitionException {
        try {
            int _type = LESS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:411:14: ( '<=' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:411:16: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_EQ"

    // $ANTLR start "GREATER_EQ"
    public final void mGREATER_EQ() throws RecognitionException {
        try {
            int _type = GREATER_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:412:14: ( '>=' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:412:16: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_EQ"

    // $ANTLR start "QUEST"
    public final void mQUEST() throws RecognitionException {
        try {
            int _type = QUEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:413:14: ( '?' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:413:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUEST"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:414:14: ( '_' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:414:16: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "VERT_BAR"
    public final void mVERT_BAR() throws RecognitionException {
        try {
            int _type = VERT_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:415:14: ( '|' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:415:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERT_BAR"

    // $ANTLR start "APICS"
    public final void mAPICS() throws RecognitionException {
        try {
            int _type = APICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:416:14: ( '^' )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:416:16: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "APICS"

    // $ANTLR start "NUM_INT"
    public final void mNUM_INT() throws RecognitionException {
        try {
            int _type = NUM_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:421:8: ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:421:10: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:421:15: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:421:15: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:421:16: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:421:26: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_INT"

    // $ANTLR start "NUM_FLOAT"
    public final void mNUM_FLOAT() throws RecognitionException {
        try {
            int _type = NUM_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:11: ( NUM_INT | ( NUM_INT DOT ( NUM_INT )+ ) | ( DOT ( NUM_INT )+ ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:13: NUM_INT
                    {
                    mNUM_INT(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:23: ( NUM_INT DOT ( NUM_INT )+ )
                    {
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:23: ( NUM_INT DOT ( NUM_INT )+ )
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:24: NUM_INT DOT ( NUM_INT )+
                    {
                    mNUM_INT(); 


                    mDOT(); 


                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:36: ( NUM_INT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:36: NUM_INT
                    	    {
                    	    mNUM_INT(); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:49: ( DOT ( NUM_INT )+ )
                    {
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:49: ( DOT ( NUM_INT )+ )
                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:51: DOT ( NUM_INT )+
                    {
                    mDOT(); 


                    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:55: ( NUM_INT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:423:55: NUM_INT
                    	    {
                    	    mNUM_INT(); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_FLOAT"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:427:5: ( LETTER ( LETTER | NUM_INT | UNDERSCORE )* )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:428:7: LETTER ( LETTER | NUM_INT | UNDERSCORE )*
            {
            mLETTER(); 


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:428:14: ( LETTER | NUM_INT | UNDERSCORE )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt8=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt8=2;
                    }
                    break;
                case '_':
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:428:15: LETTER
            	    {
            	    mLETTER(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:428:24: NUM_INT
            	    {
            	    mNUM_INT(); 


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:428:34: UNDERSCORE
            	    {
            	    mUNDERSCORE(); 


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "LABEL"
    public final void mLABEL() throws RecognitionException {
        try {
            int _type = LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:432:6: ( ( DOUBLE_QUOTE ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB | OPEN_P | CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH | MINUS | PLUS | OPEN_GRAPH | CLOSE_GRAPH | ' ' )+ DOUBLE_QUOTE ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:433:7: ( DOUBLE_QUOTE ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB | OPEN_P | CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH | MINUS | PLUS | OPEN_GRAPH | CLOSE_GRAPH | ' ' )+ DOUBLE_QUOTE )
            {
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:433:7: ( DOUBLE_QUOTE ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB | OPEN_P | CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH | MINUS | PLUS | OPEN_GRAPH | CLOSE_GRAPH | ' ' )+ DOUBLE_QUOTE )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:433:9: DOUBLE_QUOTE ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB | OPEN_P | CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH | MINUS | PLUS | OPEN_GRAPH | CLOSE_GRAPH | ' ' )+ DOUBLE_QUOTE
            {
            mDOUBLE_QUOTE(); 


            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:434:7: ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB | OPEN_P | CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH | MINUS | PLUS | OPEN_GRAPH | CLOSE_GRAPH | ' ' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=16;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt9=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt9=2;
                    }
                    break;
                case '_':
                    {
                    alt9=3;
                    }
                    break;
                case '[':
                    {
                    alt9=4;
                    }
                    break;
                case '(':
                    {
                    alt9=5;
                    }
                    break;
                case ')':
                    {
                    alt9=6;
                    }
                    break;
                case ']':
                    {
                    alt9=7;
                    }
                    break;
                case '^':
                    {
                    alt9=8;
                    }
                    break;
                case '*':
                    {
                    alt9=9;
                    }
                    break;
                case '/':
                    {
                    alt9=10;
                    }
                    break;
                case '-':
                    {
                    alt9=11;
                    }
                    break;
                case '+':
                    {
                    alt9=12;
                    }
                    break;
                case '{':
                    {
                    alt9=13;
                    }
                    break;
                case '}':
                    {
                    alt9=14;
                    }
                    break;
                case ' ':
                    {
                    alt9=15;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:434:9: LETTER
            	    {
            	    mLETTER(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:435:9: NUM_INT
            	    {
            	    mNUM_INT(); 


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:436:9: UNDERSCORE
            	    {
            	    mUNDERSCORE(); 


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:437:9: OPEN_SB
            	    {
            	    mOPEN_SB(); 


            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:438:9: OPEN_P
            	    {
            	    mOPEN_P(); 


            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:439:9: CLOSE_P
            	    {
            	    mCLOSE_P(); 


            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:440:9: CLOSE_SB
            	    {
            	    mCLOSE_SB(); 


            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:441:9: APICS
            	    {
            	    mAPICS(); 


            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:442:9: ASTERISK
            	    {
            	    mASTERISK(); 


            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:443:9: SLASH
            	    {
            	    mSLASH(); 


            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:444:9: MINUS
            	    {
            	    mMINUS(); 


            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:445:9: PLUS
            	    {
            	    mPLUS(); 


            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:446:9: OPEN_GRAPH
            	    {
            	    mOPEN_GRAPH(); 


            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:447:9: CLOSE_GRAPH
            	    {
            	    mCLOSE_GRAPH(); 


            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:448:9: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            mDOUBLE_QUOTE(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LABEL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:456:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:456:7: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }



                    _channel=HIDDEN;
                  

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SCAN_ERROR"
    public final void mSCAN_ERROR() throws RecognitionException {
        try {
            int _type = SCAN_ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:469:3: ( . )
            // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:470:5: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCAN_ERROR"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:8: ( TOKENS | DRAW_START | DRAW_ARROW | DRAW_CURVED_ARROW | DRAW_STATE | DRAW_TRANSITION | LEFT_OF | RIGHT_OF | ABOVE_OF | BELOW_OF | LEFT | RIGHT | ABOVE | BELOW | OVER | UNDER | AT | DOUBLE_QUOTE | PERCENT | AMP | SINGLE_QUOTE | OPEN_P | CLOSE_P | OPEN_SB | OPEN_GRAPH | CLOSE_GRAPH | CLOSE_SB | ASTERISK | PLUS | MINUS | DOT | COMMA | COL | SEMICOL | SLASH | BACK_SLASH | EQ | NOT_EQ | LESS_THAN | GREATER_THAN | LESS_EQ | GREATER_EQ | QUEST | UNDERSCORE | VERT_BAR | APICS | NUM_INT | NUM_FLOAT | NAME | LABEL | WS | SCAN_ERROR )
        int alt10=52;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:10: TOKENS
                {
                mTOKENS(); 


                }
                break;
            case 2 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:17: DRAW_START
                {
                mDRAW_START(); 


                }
                break;
            case 3 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:28: DRAW_ARROW
                {
                mDRAW_ARROW(); 


                }
                break;
            case 4 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:39: DRAW_CURVED_ARROW
                {
                mDRAW_CURVED_ARROW(); 


                }
                break;
            case 5 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:57: DRAW_STATE
                {
                mDRAW_STATE(); 


                }
                break;
            case 6 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:68: DRAW_TRANSITION
                {
                mDRAW_TRANSITION(); 


                }
                break;
            case 7 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:84: LEFT_OF
                {
                mLEFT_OF(); 


                }
                break;
            case 8 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:92: RIGHT_OF
                {
                mRIGHT_OF(); 


                }
                break;
            case 9 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:101: ABOVE_OF
                {
                mABOVE_OF(); 


                }
                break;
            case 10 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:110: BELOW_OF
                {
                mBELOW_OF(); 


                }
                break;
            case 11 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:119: LEFT
                {
                mLEFT(); 


                }
                break;
            case 12 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:124: RIGHT
                {
                mRIGHT(); 


                }
                break;
            case 13 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:130: ABOVE
                {
                mABOVE(); 


                }
                break;
            case 14 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:136: BELOW
                {
                mBELOW(); 


                }
                break;
            case 15 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:142: OVER
                {
                mOVER(); 


                }
                break;
            case 16 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:147: UNDER
                {
                mUNDER(); 


                }
                break;
            case 17 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:153: AT
                {
                mAT(); 


                }
                break;
            case 18 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:156: DOUBLE_QUOTE
                {
                mDOUBLE_QUOTE(); 


                }
                break;
            case 19 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:169: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 20 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:177: AMP
                {
                mAMP(); 


                }
                break;
            case 21 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:181: SINGLE_QUOTE
                {
                mSINGLE_QUOTE(); 


                }
                break;
            case 22 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:194: OPEN_P
                {
                mOPEN_P(); 


                }
                break;
            case 23 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:201: CLOSE_P
                {
                mCLOSE_P(); 


                }
                break;
            case 24 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:209: OPEN_SB
                {
                mOPEN_SB(); 


                }
                break;
            case 25 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:217: OPEN_GRAPH
                {
                mOPEN_GRAPH(); 


                }
                break;
            case 26 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:228: CLOSE_GRAPH
                {
                mCLOSE_GRAPH(); 


                }
                break;
            case 27 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:240: CLOSE_SB
                {
                mCLOSE_SB(); 


                }
                break;
            case 28 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:249: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 29 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:258: PLUS
                {
                mPLUS(); 


                }
                break;
            case 30 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:263: MINUS
                {
                mMINUS(); 


                }
                break;
            case 31 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:269: DOT
                {
                mDOT(); 


                }
                break;
            case 32 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:273: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 33 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:279: COL
                {
                mCOL(); 


                }
                break;
            case 34 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:283: SEMICOL
                {
                mSEMICOL(); 


                }
                break;
            case 35 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:291: SLASH
                {
                mSLASH(); 


                }
                break;
            case 36 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:297: BACK_SLASH
                {
                mBACK_SLASH(); 


                }
                break;
            case 37 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:308: EQ
                {
                mEQ(); 


                }
                break;
            case 38 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:311: NOT_EQ
                {
                mNOT_EQ(); 


                }
                break;
            case 39 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:318: LESS_THAN
                {
                mLESS_THAN(); 


                }
                break;
            case 40 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:328: GREATER_THAN
                {
                mGREATER_THAN(); 


                }
                break;
            case 41 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:341: LESS_EQ
                {
                mLESS_EQ(); 


                }
                break;
            case 42 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:349: GREATER_EQ
                {
                mGREATER_EQ(); 


                }
                break;
            case 43 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:360: QUEST
                {
                mQUEST(); 


                }
                break;
            case 44 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:366: UNDERSCORE
                {
                mUNDERSCORE(); 


                }
                break;
            case 45 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:377: VERT_BAR
                {
                mVERT_BAR(); 


                }
                break;
            case 46 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:386: APICS
                {
                mAPICS(); 


                }
                break;
            case 47 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:392: NUM_INT
                {
                mNUM_INT(); 


                }
                break;
            case 48 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:400: NUM_FLOAT
                {
                mNUM_FLOAT(); 


                }
                break;
            case 49 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:410: NAME
                {
                mNAME(); 


                }
                break;
            case 50 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:415: LABEL
                {
                mLABEL(); 


                }
                break;
            case 51 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:421: WS
                {
                mWS(); 


                }
                break;
            case 52 :
                // C:\\Users\\Giovanni\\Documents\\Workspaces\\Unibg\\ANTLR Linguaggi e compilatori\\Petri_Net_Diagram\\src\\language.g:1:424: SCAN_ERROR
                {
                mSCAN_ERROR(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA7_eotS =
        "\1\uffff\2\4\3\uffff\1\4";
    static final String DFA7_eofS =
        "\7\uffff";
    static final String DFA7_minS =
        "\3\56\3\uffff\1\56";
    static final String DFA7_maxS =
        "\1\71\1\56\1\71\3\uffff\1\71";
    static final String DFA7_acceptS =
        "\3\uffff\1\3\1\1\1\2\1\uffff";
    static final String DFA7_specialS =
        "\7\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\5",
            "\1\5\1\uffff\12\6",
            "",
            "",
            "",
            "\1\5\1\uffff\12\6"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "423:1: NUM_FLOAT : ( NUM_INT | ( NUM_INT DOT ( NUM_INT )+ ) | ( DOT ( NUM_INT )+ ) );";
        }
    }
    static final String DFA10_eotS =
        "\1\uffff\1\50\7\52\1\uffff\1\63\13\uffff\1\100\6\uffff\1\112\1\114"+
        "\4\uffff\2\121\6\uffff\7\52\40\uffff\1\121\1\uffff\10\52\1\143\3"+
        "\52\1\150\2\52\1\uffff\1\52\1\157\1\161\1\163\1\uffff\1\165\5\52"+
        "\1\uffff\1\52\1\uffff\1\52\1\uffff\1\52\1\uffff\4\52\1\u0082\7\52"+
        "\1\uffff\1\u008b\1\u008c\1\u008d\5\52\3\uffff\1\u0093\1\u0094\1"+
        "\u0095\2\52\3\uffff\11\52\1\u00a1\1\52\1\uffff\1\u00a3\1\uffff";
    static final String DFA10_eofS =
        "\u00a4\uffff";
    static final String DFA10_minS =
        "\1\0\1\53\1\122\1\105\1\111\1\102\1\105\1\126\1\116\1\uffff\1\40"+
        "\13\uffff\1\60\6\uffff\2\75\4\uffff\2\56\6\uffff\1\101\1\106\1\107"+
        "\1\117\1\114\1\105\1\104\40\uffff\1\56\1\uffff\1\127\1\124\1\110"+
        "\1\126\1\117\1\122\1\105\1\137\1\60\1\124\1\105\1\127\1\60\1\122"+
        "\1\101\1\uffff\1\117\3\60\1\uffff\1\60\1\124\1\122\1\125\1\122\1"+
        "\106\1\uffff\1\117\1\uffff\1\117\1\uffff\1\117\1\uffff\1\101\2\122"+
        "\1\101\1\60\3\106\1\122\1\117\1\126\1\116\1\uffff\3\60\1\124\1\105"+
        "\1\127\1\105\1\123\3\uffff\3\60\1\104\1\111\3\uffff\1\137\1\124"+
        "\1\101\1\111\1\122\1\117\1\122\1\116\1\117\1\60\1\127\1\uffff\1"+
        "\60\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\71\1\162\1\145\1\151\1\142\1\145\1\166\1\156\1\uffff"+
        "\1\175\13\uffff\1\71\6\uffff\1\76\1\75\4\uffff\1\56\1\71\6\uffff"+
        "\1\141\1\146\1\147\1\157\1\154\1\145\1\144\40\uffff\1\71\1\uffff"+
        "\1\167\1\164\1\150\1\166\1\157\1\162\1\145\1\137\1\172\1\164\1\145"+
        "\1\167\1\172\1\162\1\164\1\uffff\1\157\3\172\1\uffff\1\172\1\164"+
        "\1\162\1\165\1\162\1\146\1\uffff\1\157\1\uffff\1\157\1\uffff\1\157"+
        "\1\uffff\1\141\2\162\1\141\1\172\3\146\1\164\1\157\1\166\1\156\1"+
        "\uffff\3\172\1\164\1\145\1\167\1\145\1\163\3\uffff\3\172\1\144\1"+
        "\151\3\uffff\1\137\1\164\1\141\1\151\1\162\1\157\1\162\1\156\1\157"+
        "\1\172\1\167\1\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\11\uffff\1\21\1\uffff\1\23\1\24\1\25\1\27\1\30\1\31\1\32\1\33\1"+
        "\34\1\35\1\36\1\uffff\1\40\1\41\1\42\1\43\1\44\1\45\2\uffff\1\53"+
        "\1\54\1\55\1\56\2\uffff\1\61\1\63\1\64\1\26\1\1\1\61\7\uffff\1\21"+
        "\1\22\1\62\1\23\1\24\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
        "\1\37\1\60\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\51\1\47\1\52\1\50"+
        "\1\53\1\54\1\55\1\56\1\57\1\uffff\1\63\17\uffff\1\13\4\uffff\1\17"+
        "\6\uffff\1\14\1\uffff\1\15\1\uffff\1\16\1\uffff\1\20\14\uffff\1"+
        "\7\10\uffff\1\10\1\11\1\12\5\uffff\1\2\1\5\1\3\13\uffff\1\6\1\uffff"+
        "\1\4";
    static final String DFA10_specialS =
        "\1\0\u00a3\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\12\2\47\1\13\1\14\1"+
            "\15\1\1\1\16\1\23\1\24\1\27\1\25\1\26\1\32\1\43\11\44\1\30\1"+
            "\31\1\35\1\34\1\36\1\37\1\11\1\5\1\6\1\45\1\2\7\45\1\3\2\45"+
            "\1\7\2\45\1\4\2\45\1\10\5\45\1\17\1\33\1\22\1\42\1\40\1\47\1"+
            "\5\1\6\1\45\1\2\7\45\1\3\2\45\1\7\2\45\1\4\2\45\1\10\5\45\1"+
            "\20\1\41\1\21\uff82\47",
            "\1\51\1\uffff\1\51\2\uffff\12\51",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\1\56\37\uffff\1\56",
            "\1\57\37\uffff\1\57",
            "\1\60\37\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "",
            "\1\64\7\uffff\4\64\1\uffff\1\64\1\uffff\13\64\7\uffff\33\64"+
            "\1\uffff\3\64\1\uffff\33\64\1\uffff\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111\1\110",
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\101\1\uffff\12\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\130\37\uffff\1\130",
            "\1\131\37\uffff\1\131",
            "\1\132\37\uffff\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101\1\uffff\12\122",
            "",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\1\141\37\uffff\1\141",
            "\1\142",
            "\12\52\7\uffff\32\52\4\uffff\1\144\1\uffff\32\52",
            "\1\145\37\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "\1\147\37\uffff\1\147",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\151\37\uffff\1\151",
            "\1\153\1\uffff\1\154\17\uffff\1\152\1\155\14\uffff\1\153\1"+
            "\uffff\1\154\17\uffff\1\152\1\155",
            "",
            "\1\156\37\uffff\1\156",
            "\12\52\7\uffff\32\52\4\uffff\1\160\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\162\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\164\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "",
            "\1\173\37\uffff\1\173",
            "",
            "\1\174\37\uffff\1\174",
            "",
            "\1\175\37\uffff\1\175",
            "",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\37\uffff\1\u0081",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0083\37\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0086\1\uffff\1\u0087\35\uffff\1\u0086\1\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "",
            "",
            "",
            "\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a2\37\uffff\1\u00a2",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TOKENS | DRAW_START | DRAW_ARROW | DRAW_CURVED_ARROW | DRAW_STATE | DRAW_TRANSITION | LEFT_OF | RIGHT_OF | ABOVE_OF | BELOW_OF | LEFT | RIGHT | ABOVE | BELOW | OVER | UNDER | AT | DOUBLE_QUOTE | PERCENT | AMP | SINGLE_QUOTE | OPEN_P | CLOSE_P | OPEN_SB | OPEN_GRAPH | CLOSE_GRAPH | CLOSE_SB | ASTERISK | PLUS | MINUS | DOT | COMMA | COL | SEMICOL | SLASH | BACK_SLASH | EQ | NOT_EQ | LESS_THAN | GREATER_THAN | LESS_EQ | GREATER_EQ | QUEST | UNDERSCORE | VERT_BAR | APICS | NUM_INT | NUM_FLOAT | NAME | LABEL | WS | SCAN_ERROR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='(') ) {s = 1;}

                        else if ( (LA10_0=='D'||LA10_0=='d') ) {s = 2;}

                        else if ( (LA10_0=='L'||LA10_0=='l') ) {s = 3;}

                        else if ( (LA10_0=='R'||LA10_0=='r') ) {s = 4;}

                        else if ( (LA10_0=='A'||LA10_0=='a') ) {s = 5;}

                        else if ( (LA10_0=='B'||LA10_0=='b') ) {s = 6;}

                        else if ( (LA10_0=='O'||LA10_0=='o') ) {s = 7;}

                        else if ( (LA10_0=='U'||LA10_0=='u') ) {s = 8;}

                        else if ( (LA10_0=='@') ) {s = 9;}

                        else if ( (LA10_0=='\"') ) {s = 10;}

                        else if ( (LA10_0=='%') ) {s = 11;}

                        else if ( (LA10_0=='&') ) {s = 12;}

                        else if ( (LA10_0=='\'') ) {s = 13;}

                        else if ( (LA10_0==')') ) {s = 14;}

                        else if ( (LA10_0=='[') ) {s = 15;}

                        else if ( (LA10_0=='{') ) {s = 16;}

                        else if ( (LA10_0=='}') ) {s = 17;}

                        else if ( (LA10_0==']') ) {s = 18;}

                        else if ( (LA10_0=='*') ) {s = 19;}

                        else if ( (LA10_0=='+') ) {s = 20;}

                        else if ( (LA10_0=='-') ) {s = 21;}

                        else if ( (LA10_0=='.') ) {s = 22;}

                        else if ( (LA10_0==',') ) {s = 23;}

                        else if ( (LA10_0==':') ) {s = 24;}

                        else if ( (LA10_0==';') ) {s = 25;}

                        else if ( (LA10_0=='/') ) {s = 26;}

                        else if ( (LA10_0=='\\') ) {s = 27;}

                        else if ( (LA10_0=='=') ) {s = 28;}

                        else if ( (LA10_0=='<') ) {s = 29;}

                        else if ( (LA10_0=='>') ) {s = 30;}

                        else if ( (LA10_0=='?') ) {s = 31;}

                        else if ( (LA10_0=='_') ) {s = 32;}

                        else if ( (LA10_0=='|') ) {s = 33;}

                        else if ( (LA10_0=='^') ) {s = 34;}

                        else if ( (LA10_0=='0') ) {s = 35;}

                        else if ( ((LA10_0 >= '1' && LA10_0 <= '9')) ) {s = 36;}

                        else if ( (LA10_0=='C'||(LA10_0 >= 'E' && LA10_0 <= 'K')||(LA10_0 >= 'M' && LA10_0 <= 'N')||(LA10_0 >= 'P' && LA10_0 <= 'Q')||(LA10_0 >= 'S' && LA10_0 <= 'T')||(LA10_0 >= 'V' && LA10_0 <= 'Z')||LA10_0=='c'||(LA10_0 >= 'e' && LA10_0 <= 'k')||(LA10_0 >= 'm' && LA10_0 <= 'n')||(LA10_0 >= 'p' && LA10_0 <= 'q')||(LA10_0 >= 's' && LA10_0 <= 't')||(LA10_0 >= 'v' && LA10_0 <= 'z')) ) {s = 37;}

                        else if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 38;}

                        else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\b')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\u001F')||LA10_0=='!'||(LA10_0 >= '#' && LA10_0 <= '$')||LA10_0=='`'||(LA10_0 >= '~' && LA10_0 <= '\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}