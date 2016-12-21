package mvc;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;


public class InfoView extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public InfoView()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(InfoView.class.getResource("/images/logo.jpg")));
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 350);
		setTitle("About Petri Net Diagram"); 
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		URL url = InfoView.class.getResource("/images/logo.jpg");
		ImageIcon icon = new ImageIcon(url);

		JLabel labelLogo = new JLabel(icon);
		labelLogo.setBounds(15, 16, 225, 225);
		contentPane.add(labelLogo);

		JTextArea textAreaInfo = new JTextArea();
		textAreaInfo.setLineWrap(true);
		textAreaInfo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textAreaInfo.setBackground(UIManager.getColor("Button.background"));
		textAreaInfo.setEditable(false);
		textAreaInfo.setBounds(255, 16, 344, 214);
		contentPane.add(textAreaInfo);

		textAreaInfo.setText("This software and has been developed as\r\ncompletion of the Language and Compilers\r\ncourse by professor Giuseppe Psaila,\r\nComputer Engineering, University of Bergamo,\r\nItaly.\r\n\r\nAuthors:\r\nAndrea Quattri       and.quattri@gmail.com\r\nAntonio Cosseddu  ant.cosseddu@gmail.com\r\nGiovanni B. Nava   giovanni.b.nava@gmail.com");

		JButton buttonOk = new JButton("OK");
		buttonOk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
			}
		});
		buttonOk.setBounds(484, 265, 115, 29);
		contentPane.add(buttonOk);

		JTextArea textAreaLink = new JTextArea();
		textAreaLink.setText("The source code and the documentation is available online:\r\nhttps://sourceforge.net/projects/petri-net-diagram-compiler/");
		textAreaLink.setLineWrap(true);
		textAreaLink.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textAreaLink.setEditable(false);
		textAreaLink.setBackground(SystemColor.menu);
		textAreaLink.setBounds(25, 257, 454, 44);
		contentPane.add(textAreaLink);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
}
