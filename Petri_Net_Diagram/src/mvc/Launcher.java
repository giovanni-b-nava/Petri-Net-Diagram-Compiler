package mvc;

public class Launcher
{

	public static void main(String[] args)
	{
		Model model = new Model();
		
		MainView view = new MainView(model);
		
		@SuppressWarnings("unused")
		Controller controller = new Controller(model, view);
		
		view.setVisible(true);
	}

}
