package mvc;

public class MyNotify
{
	
	public final static int ENABLE_COMPILE 	   = 0;
	public final static int ENABLE_MAKE_PDF    = 1;
	public final static int COMPILE_SUCCESFULL = 2;
	public final static int LATEX_SUCCESFULL   = 3;
	public final static int SYNTAX_ERRORS 	   = 4;
	public final static int SEMANTIC_ERRORS    = 5;
	public final static int GENERIC_ERROR 	   = 6;
	public final static int FILE_ERROR 	   	   = 7;
			
	private int notifyID;

	public MyNotify(int notifyID)
	{
		this.notifyID = notifyID;
	}

	public int getNotifyID()
	{
		return notifyID;
	}

}
