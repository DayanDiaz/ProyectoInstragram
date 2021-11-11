package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUIRegister extends JFrame {

	//COMPONENTS	
	private JPanel pLogin;
	private JPanel pRegister;
	
	private JLabel lInstagram;
	private JLabel lMessage1;
	private JLabel lMessage2;
	private JLabel lConditions1;
	private JLabel lConditions2;
	private JLabel lHaveAccount;
	private JLabel lLoginAccess;
	
	private JTextField tfCel;
	private JTextField tfName;
	private JTextField tfUser;
	private JTextField tfPassWord;
	
	private JButton bRegister;
	
	public GUIRegister() {
		
		//ADD
		getContentPane().add(getPLogin());
		getContentPane().add(getPRegister());
		
		init();
	}
	
	private void init() {	
		setSize(350, 586);
		setVisible (true);
		getContentPane().setLayout(null);	
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//METHODS
	public JPanel getPLogin() {
		if (pLogin == null) {
			pLogin = new JPanel();
			pLogin.setBounds(10, 471, 316, 65);
			pLogin.setLayout(null);
			pLogin.add(getLHaveAccount());
			pLogin.add(getLLoginAccess());
		}
		return pLogin;
	}
	
	public JPanel getPRegister() {
		if (pRegister == null) {
			pRegister = new JPanel();
			pRegister.setBounds(10, 11, 316, 449);
			pRegister.setLayout(null);
			pRegister.add(getLInstagram());
			pRegister.add(getLMessage1());
			pRegister.add(getLMessage2());
			pRegister.add(getTfCel());
			pRegister.add(getTfName());
			pRegister.add(getTfUser());
			pRegister.add(getTfPassWord());
			pRegister.add(getBRegister());
			pRegister.add(getLConditions1());
			pRegister.add(getLConditions2());
		}
		return pRegister;
	}
	
	public JLabel getLInstagram() {
		if (lInstagram == null) {
			lInstagram = new JLabel("Instagram");
			lInstagram.setBounds(96, 20, 153, 43);
			lInstagram.setForeground(Color.BLACK);
			lInstagram.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 36));
			lInstagram.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lInstagram;
	}
	
	public JLabel getLMessage1() {
		if (lMessage1 == null) {
			lMessage1 = new JLabel("Reg\u00EDstrate para ver fotos y videos");
			lMessage1.setVerticalAlignment(SwingConstants.CENTER);
			lMessage1.setHorizontalAlignment(SwingConstants.CENTER);
			lMessage1.setForeground(Color.LIGHT_GRAY);
			lMessage1.setFont(new Font("Dialog", Font.BOLD, 16));
			lMessage1.setBounds(32, 74, 268, 38);
		}
		return lMessage1;
	}
	
	public JLabel getLMessage2() {
		if (lMessage2 == null) {
			lMessage2 = new JLabel("de tus amigos.");
			lMessage2.setHorizontalAlignment(SwingConstants.CENTER);
			lMessage2.setForeground(Color.LIGHT_GRAY);
			lMessage2.setFont(new Font("Dialog", Font.BOLD, 16));
			lMessage2.setBounds(32, 104, 268, 28);
		}
		return lMessage2;
	}
	
	
	public JLabel getLConditions1() {
		if (lConditions1 == null) {
			lConditions1 = new JLabel("Al registrate, aceptas nuestras Condiciones, la");
			lConditions1.setHorizontalAlignment(SwingConstants.CENTER);
			lConditions1.setForeground(Color.LIGHT_GRAY);
			lConditions1.setFont(new Font("Dialog", Font.PLAIN, 12));
			lConditions1.setBounds(32, 390, 268, 28);
		}
		return lConditions1;
	}
	
	public JLabel getLConditions2() {
		if (lConditions2 == null) {
			lConditions2 = new JLabel("Pol\u00EDtica de datos y la Pol\u00EDtica de cookies.");
			lConditions2.setHorizontalAlignment(SwingConstants.CENTER);
			lConditions2.setForeground(Color.LIGHT_GRAY);
			lConditions2.setFont(new Font("Dialog", Font.PLAIN, 12));
			lConditions2.setBounds(32, 410, 268, 28);
		}
		return lConditions2;
	}
	
	public JLabel getLHaveAccount() {
		if (lHaveAccount == null) {
			lHaveAccount = new JLabel("\u00BFTienes una cuenta?");
			lHaveAccount.setBounds(58, 16, 129, 28);
			lHaveAccount.setFont(new Font("Dialog", Font.PLAIN, 12));
		}
		return lHaveAccount;
	}
	
	public JLabel getLLoginAccess() {
		if (lLoginAccess == null) {
			lLoginAccess = new JLabel("Inicia sesi\u00F3n");
			lLoginAccess.setBounds(180, 16, 76, 28);
			lLoginAccess.setForeground(new Color(135, 206, 250));
			lLoginAccess.setFont(new Font("Dialog", Font.BOLD, 12));
		}
		return lLoginAccess;
	}
	
	public JTextField getTfCel() {
		if (tfCel == null) {
			tfCel = new JTextField();
			tfCel.setForeground(Color.LIGHT_GRAY);
			tfCel.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfCel.setText(" N\u00FAmero de celular o correo electr\u00F3nico");
			tfCel.setBounds(32, 143, 268, 38);
			tfCel.setColumns(10);
		}
		return tfCel;
	}
	
	public JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setText(" Nombre completo");
			tfName.setForeground(Color.LIGHT_GRAY);
			tfName.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfName.setColumns(10);
			tfName.setBounds(32, 192, 268, 38);
		}
		return tfName;
	}
	
	public JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setText(" Nombre de usuario");
			tfUser.setForeground(Color.LIGHT_GRAY);
			tfUser.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfUser.setColumns(10);
			tfUser.setBounds(32, 241, 268, 38);
		}
		return tfUser;
	}
	
	public JTextField getTfPassWord() {
		if (tfPassWord == null) {
			tfPassWord = new JTextField();
			tfPassWord.setText(" Contrase\u00F1a");
			tfPassWord.setForeground(Color.LIGHT_GRAY);
			tfPassWord.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfPassWord.setColumns(10);
			tfPassWord.setBounds(32, 290, 268, 38);
		}
		return tfPassWord;
	}
	
	public JButton getBRegister() {
		if (bRegister == null) {
			bRegister = new JButton("Reg\u00EDstrate");
			bRegister.setBackground(new Color(173, 216, 230));
			bRegister.setBorderPainted(false);
			bRegister.setForeground(new Color(255, 255, 255));
			bRegister.setFont(new Font("Dialog", Font.BOLD, 12));
			bRegister.setBounds(32, 347, 268, 32);
		}
		return bRegister;
	}
}
