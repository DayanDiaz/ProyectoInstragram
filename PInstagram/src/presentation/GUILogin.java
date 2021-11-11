package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class GUILogin extends JFrame {

	//COMPONENTS
	private JPanel pLogin;
	private JPanel pRegister;
	
	private JLabel lInstagram;
	private JLabel lPassWord;
	private JLabel lHaveNotAccount;
	private JLabel lRegister;
	
	private JTextField tfCel;
	private JTextField tfPassWord;
	
	private JButton bLogin;

	public GUILogin() {
		
		//ADD
		getContentPane().add(getPLogin());
		getContentPane().add(getPRegister());
		
		init ();
	}
	
	private void init() {
		setSize(407, 425);
		setVisible(true);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	//METHODS
	public JPanel getPLogin() {
		if (pLogin == null) {
			pLogin = new JPanel();
			pLogin.setBounds(10, 11, 371, 282);
			pLogin.setLayout(null);
			pLogin.add(getLInstagram());
			pLogin.add(getLPassWord());
			pLogin.add(getTfCel());
			pLogin.add(getTfPassWord());
			pLogin.add(getBLogin());
		}
		return pLogin;
	}
	
	public JPanel getPRegister() {
		if (pRegister == null) {
			pRegister = new JPanel();
			pRegister.setBounds(10, 304, 371, 68);
			pRegister.setLayout(null);
			pRegister.add(getLRegister());
			pRegister.add(getLHaveNotAccount());
		}
		return pRegister;
	}
	
	public JLabel getLInstagram() {
		if (lInstagram == null) {
			lInstagram = new JLabel("Instagram");
			lInstagram.setBounds(116, 11, 153, 43);
			lInstagram.setForeground(Color.BLACK);
			lInstagram.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 36));
			lInstagram.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lInstagram;
	}
	
	public JLabel getLPassWord() {
		if (lPassWord == null) {
			lPassWord = new JLabel("\u00BFOlvidaste tu contra\u00F1esa?");
			lPassWord.setHorizontalAlignment(SwingConstants.CENTER);
			lPassWord.setFont(new Font("Dialog", Font.PLAIN, 12));
			lPassWord.setBounds(104, 250, 153, 21);
		}
		return lPassWord;
	}
	
	public JLabel getLRegister() {
		if (lRegister == null) {
			lRegister = new JLabel("Reg\u00EDstrate");
			lRegister.setForeground(new Color(135, 206, 250));
			lRegister.setFont(new Font("Dialog", Font.BOLD, 12));
			lRegister.setHorizontalAlignment(SwingConstants.LEFT);
			lRegister.setBounds(221, 25, 77, 21);
		}
		return lRegister;
	}
	
	public JLabel getLHaveNotAccount() {
		if (lHaveNotAccount == null) {
			lHaveNotAccount = new JLabel("\u00BFNo tienes una cuenta?");
			lHaveNotAccount.setHorizontalAlignment(SwingConstants.CENTER);
			lHaveNotAccount.setFont(new Font("Dialog", Font.PLAIN, 12));
			lHaveNotAccount.setBounds(76, 25, 153, 21);
		}
		return lHaveNotAccount;
	}	
	
	public JTextField getTfCel() {
		if (tfCel == null) {
			tfCel = new JTextField();
			tfCel.setHorizontalAlignment(SwingConstants.LEFT);
			tfCel.setForeground(Color.LIGHT_GRAY);
			tfCel.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfCel.setText(" Tel\u00E9fono, usuario o correo electr\u00F3nico");
			tfCel.setBounds(40, 95, 294, 38);
			tfCel.setColumns(10);
		}
		return tfCel;
	}
	
	public JTextField getTfPassWord() {
		if (tfPassWord == null) {
			tfPassWord = new JTextField();
			tfPassWord.setText(" Contrase\u00F1a");
			tfPassWord.setForeground(Color.LIGHT_GRAY);
			tfPassWord.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfPassWord.setColumns(10);
			tfPassWord.setBounds(40, 140, 294, 38);
		}
		return tfPassWord;
	}
	
	public JButton getBLogin() {
		if (bLogin == null) {
			bLogin = new JButton("Iniciar sesi\u00F3n");
			bLogin.setBorderPainted(false);
			bLogin.setBackground(new Color(173, 216, 230));
			bLogin.setForeground(new Color(255, 255, 255));
			bLogin.setFont(new Font("Dialog", Font.BOLD, 12));
			bLogin.setBounds(40, 200, 294, 29);
		}
		return bLogin;
	}
}
