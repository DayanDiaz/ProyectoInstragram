package presentation;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


@SuppressWarnings("serial")
public class Login extends JFrame {
	private JButton bEnter;
	private JButton bRegister;
	private JPasswordField pfPassword;
	private JTextField tfUser;

	public Login() {
	
		getContentPane().add(getBEnter());
		getContentPane().add(getBRegister());
		getContentPane().add(getTfUser());
		getContentPane().add(getPfPassword());
		
		
		
		initialization();
	}
	
	public void initialization() {
		setTitle("Login");
		getContentPane().setLayout(null);
		setSize(300,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JButton getBEnter() {
		if (bEnter == null) {
			bEnter = new JButton("Entrar");
			bEnter.setBounds(94, 260, 89, 23);
		}
		return bEnter;
	}
	
	public JButton getBRegister() {
		if (bRegister == null) {
			bRegister = new JButton("Registrarse");
			bRegister.setBounds(94, 327, 89, 23);
		}
		return bRegister;
	}
	
	public JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(47, 193, 197, 23);
		}
		return pfPassword;
	}
	
	public JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setBounds(47, 136, 197, 23);
		}
		return tfUser;
	}
}
