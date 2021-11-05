package presentation;


import javax.swing.JFrame;


@SuppressWarnings("serial")
public class GUIChat extends JFrame {


	public GUIChat() {
		
		
		
		
		
		initialization();
	}
	
	public void initialization() {
		setTitle("Chats");
		getContentPane().setLayout(null);
		setSize(300,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
