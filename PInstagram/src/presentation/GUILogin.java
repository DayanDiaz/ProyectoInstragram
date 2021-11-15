package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import utils.RouteImages;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class GUILogin extends JFrame {

	//BACKGROUND
	private JLabel lBackGround;
	
	//COMPONENTS
	private JPanel pLogin;
	private JPanel pRegister;
	
	private JLabel lInstagram;
	private JLabel lPassWord;
	private JLabel lHaveNotAccount;
	private JLabel lRegister;
	
	private JPlaceholderTextField tfCel;
	private JPlaceholderTextField tfPassWord;
	
	private JButton bLogin;
	private JPasswordField pfPassWord;

	public GUILogin() {
		
		//ADD
		getContentPane().add(getPLogin());
		getContentPane().add(getPRegister());
		
		getContentPane().add(getLBackGround());
		
		init ();
	}
	
	private void init() {
		setTitle("Inicia Sesión");
		setSize(407, 425);	
		getContentPane().setLayout(null);	
		setVisible(true);
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
			pLogin.setBounds(10, 11, 371, 282);
			pLogin.setLayout(null);
			pLogin.add(getLInstagram());
			pLogin.add(getLPassWord());
			pLogin.add(getTfCel());
			//pLogin.add(getTfPassWord());
			pLogin.add(getBLogin());
			pLogin.add(getPfPassWord());
		}
		return pLogin;
	}
	
	public JPanel getPRegister() {
		if (pRegister == null) {
			pRegister = new JPanel();
			pRegister.setOpaque(false);
			pRegister.setBounds(10, 304, 371, 68);
			pRegister.setLayout(null);
			pRegister.add(getLRegister());
			pRegister.add(getLHaveNotAccount());
		}
		return pRegister;
	}
	
	public JLabel getLInstagram() {
		if (lInstagram == null) {
			lInstagram = new JLabel("");	
			ImageIcon image = new ImageIcon(RouteImages.INSTAGRAM);		
			lInstagram.setIcon(new ImageIcon(image.getImage().getScaledInstance(200, 50, Image.SCALE_DEFAULT)));
			lInstagram.setBounds(60, 11, 249, 72);
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
			lRegister.setForeground(SystemColor.textHighlight);
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
			tfCel = new JPlaceholderTextField(" Tel\u00E9fono, usuario o correo electr\u00F3nico");
			tfCel.setHorizontalAlignment(SwingConstants.LEFT);
			tfCel.setForeground(Color.LIGHT_GRAY);
			tfCel.setFont(new Font("Dialog", Font.PLAIN, 12));
			//tfCel.setText(" Tel\u00E9fono, usuario o correo electr\u00F3nico");
			tfCel.setBounds(40, 95, 294, 38);
			tfCel.setColumns(10);
		}
		return tfCel;
	}
	
	public JTextField getTfPassWord() {
		if (tfPassWord == null) {
			tfPassWord = new JPlaceholderTextField(" Contrase\u00F1a");
			//tfPassWord.setText(" Contrase\u00F1a");
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
	public JPasswordField getPfPassWord() {
		if (pfPassWord == null) {
			pfPassWord = new JPasswordField();
			pfPassWord.setBounds(40, 144, 294, 38);
		}
		return pfPassWord;
	}
}
