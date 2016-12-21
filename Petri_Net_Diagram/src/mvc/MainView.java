package mvc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;

public class MainView extends JFrame implements Observer
{

	private static final long serialVersionUID = 1L;

	// UI
	private JPanel contentPane;
	private JLabel labelInput;
	private JScrollPane scrollPaneInput;
	private JTextArea textAreaUserInput;
	private JLabel labelOutput;
	private JScrollPane scrollPaneOutput;
	private JTextArea textAreaCompilerOutput;
	private JButton buttonInfo;
	private JButton buttonLoadFromFile;
	private JButton buttonCompile;
	private JButton buttonMakePDF;
	
	// MODEL
	private Model model;

	public MainView(Model model)
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainView.class.getResource("/images/logo.jpg")));
		setResizable(false);
		// Init the UI
		initUI();

		this.model = model;

		// View as observer of model
		model.addObserver(this);

		// Init view like model
		initViewLikeModel();
	}

	//*******************************************

	// CONTROLLER'S ACCESS TO VIEW
	public String getUserInput()
	{
		return textAreaUserInput.getText();
	}
	
	public void appendUserInput(String line)
	{
		textAreaUserInput.append(line);
		
		textAreaUserInput.setCaretPosition(textAreaUserInput.getDocument().getLength());
	}
	
	public void clearUserInput()
	{
		textAreaUserInput.setText("");
	}
	
	public void addInfoListener(ActionListener listener)
	{
		buttonInfo.addActionListener(listener);
	}
	
	public void addDocumentListener(DocumentListener listener)
	{
		textAreaUserInput.getDocument().addDocumentListener(listener);
	}
	
	public void addLoadFromFileListener(ActionListener listener)
	{
		buttonLoadFromFile.addActionListener(listener);
	}

	public void addCompileListener(ActionListener listener)
	{
		buttonCompile.addActionListener(listener);
	}

	public void addMakeLaTeXlistener(ActionListener listener)
	{
		buttonMakePDF.addActionListener(listener);
	}
	
	//*******************************************

	private void initUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		labelInput = new JLabel("Input area");
		labelInput.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelInput.setBounds(15, 18, 146, 20);
		contentPane.add(labelInput);

		scrollPaneInput = new JScrollPane();
		scrollPaneInput.setBounds(15, 54, 748, 200);
		contentPane.add(scrollPaneInput);

		textAreaUserInput = new JTextArea();
		scrollPaneInput.setViewportView(textAreaUserInput);

		labelOutput = new JLabel("Console");
		labelOutput.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelOutput.setBounds(15, 270, 176, 20);
		contentPane.add(labelOutput);

		scrollPaneOutput = new JScrollPane();
		scrollPaneOutput.setBounds(15, 306, 748, 215);
		contentPane.add(scrollPaneOutput);

		textAreaCompilerOutput = new JTextArea();
		textAreaCompilerOutput.setForeground(Color.BLACK);
		scrollPaneOutput.setViewportView(textAreaCompilerOutput);

		buttonCompile = new JButton("COMPILE");
		buttonCompile.setBounds(414, 266, 167, 29);
		contentPane.add(buttonCompile);
		
		buttonMakePDF = new JButton("DRAW INTO PDF");
		buttonMakePDF.setBounds(596, 266, 167, 29);
		contentPane.add(buttonMakePDF);
		
		buttonLoadFromFile = new JButton("Load from file");
		buttonLoadFromFile.setBounds(414, 14, 167, 29);
		contentPane.add(buttonLoadFromFile);
		
		buttonInfo = new JButton("About Software");
		buttonInfo.setBounds(596, 14, 167, 29);
		contentPane.add(buttonInfo);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}

	private void initViewLikeModel()
	{
		textAreaUserInput.setText(String.valueOf(model.getUserInput()));
		textAreaCompilerOutput.setText(String.valueOf(model.getCompilerOutput()));
		
		buttonCompile.setEnabled(model.isEnableCompile());
		buttonMakePDF.setEnabled(model.isEnableMakePDF());
	}

	private void updateCompilerOutput(boolean errorUpdate)
	{
		if (errorUpdate)
			textAreaCompilerOutput.setForeground(Color.RED);	
		else
			textAreaCompilerOutput.setForeground(Color.BLACK);

		textAreaCompilerOutput.setText("");
		textAreaCompilerOutput.setText(String.valueOf(model.getCompilerOutput()));
	}
	
	private void enableCompileButton()
	{
		buttonCompile.setEnabled(model.isEnableCompile());
	}
	
	private void enableMakePDFButton()
	{
		buttonMakePDF.setEnabled(model.isEnableMakePDF());
	}

	// Update the view with the notify send by model
	@Override
	public void update(Observable o, Object arg)
	{
		MyNotify notify = (MyNotify) arg;

		switch (notify.getNotifyID())
		{
		case MyNotify.ENABLE_COMPILE:
			enableCompileButton();
			break;
		case MyNotify.ENABLE_MAKE_PDF:
			enableMakePDFButton();
			break;
		case MyNotify.SYNTAX_ERRORS:
		case MyNotify.SEMANTIC_ERRORS:
		case MyNotify.GENERIC_ERROR:
		case MyNotify.FILE_ERROR:
			updateCompilerOutput(true);
			break;
		case MyNotify.COMPILE_SUCCESFULL:
		case MyNotify.LATEX_SUCCESFULL:
			updateCompilerOutput(false);
		}

		textAreaCompilerOutput.setCaretPosition(textAreaCompilerOutput.getDocument().getLength());
	}
}
