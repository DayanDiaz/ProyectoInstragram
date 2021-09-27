package presentation;


import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Inicio extends JFrame {

	public Inicio() {
		
		
		
		
		initialization();
	}
	
	public void initialization() {
		setTitle("Inicio");
		getContentPane().setLayout(null);
		setSize(300,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
