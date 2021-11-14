package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;

import utils.RouteImages;

@SuppressWarnings("serial")
public class GUIRegister extends JFrame {

	//BACKGROUND
	private JLabel lBackGround;
	
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
		
		getContentPane().add(getLBackGround());
		
		init();
	}
	
	private void init() {
		setTitle("Regístrate");
		setSize(350, 586);
		getContentPane().setLayout(null);	
		setVisible (true);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RouteImages.ICON));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//METHODS
	public JLabel getLBackGround() {
		if (lBackGround == null) {
			lBackGround = new JLabel("");
			lBackGround.setIcon(new ImageIcon(RouteImages.IBACKGROUND));
			lBackGround.setBounds(0, 0, 391, 386);
		}
		return lBackGround;
	}
	
	public JPanel getPLogin() {
		if (pLogin == null) {
			pLogin = new JPanel();
			pLogin.setOpaque(false);
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
			pRegister.setOpaque(false);
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
			lInstagram = new JLabel("");	
			ImageIcon image = new ImageIcon(RouteImages.INSTAGRAM);		
			lInstagram.setIcon(new ImageIcon(image.getImage().getScaledInstance(200, 50, Image.SCALE_DEFAULT)));
			lInstagram.setBounds(32, 11, 268, 72);
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
			lMessage1.setForeground(Color.GRAY);
			lMessage1.setFont(new Font("Dialog", Font.BOLD, 16));
			lMessage1.setBounds(32, 74, 268, 38);
		}
		return lMessage1;
	}
	
	public JLabel getLMessage2() {
		if (lMessage2 == null) {
			lMessage2 = new JLabel("de tus amigos.");
			lMessage2.setHorizontalAlignment(SwingConstants.CENTER);
			lMessage2.setForeground(Color.GRAY);
			lMessage2.setFont(new Font("Dialog", Font.BOLD, 16));
			lMessage2.setBounds(32, 104, 268, 28);
		}
		return lMessage2;
	}
	
	
	public JLabel getLConditions1() {
		if (lConditions1 == null) {
			lConditions1 = new JLabel("Al registrate, aceptas nuestras Condiciones, la");
			lConditions1.setHorizontalAlignment(SwingConstants.CENTER);
			lConditions1.setForeground(Color.GRAY);
			lConditions1.setFont(new Font("Dialog", Font.PLAIN, 12));
			lConditions1.setBounds(32, 390, 268, 28);
		}
		return lConditions1;
	}
	
	public JLabel getLConditions2() {
		if (lConditions2 == null) {
			lConditions2 = new JLabel("Pol\u00EDtica de datos y la Pol\u00EDtica de cookies.");
			lConditions2.setHorizontalAlignment(SwingConstants.CENTER);
			lConditions2.setForeground(Color.GRAY);
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
			lLoginAccess.setForeground(SystemColor.textHighlight);
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
