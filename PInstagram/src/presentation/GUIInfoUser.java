package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import utils.RouteImages;

@SuppressWarnings("serial")
public class GUIInfoUser extends JFrame {

	//BACKGROUND
	private JLabel lBackGround;
	
	//COMPONENTS	
	private JLabel lInstagram;
	
	private JPlaceholderTextField tfBirthDate;
	private JPlaceholderTextField tfGender;
	
	private JButton bNext;

	public GUIInfoUser() {
		
		//ADD
		getContentPane().add(getLInstagram());
		
		getContentPane().add(getTfBirthDate());
		getContentPane().add(getTfGender());
		
		getContentPane().add(getBNext());
		
		getContentPane().add(getLBackGround());
		
		init ();
	}
	
	private void init() {
		setTitle("Datos Personales");
		setSize(407, 289);
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
			lBackGround.setBounds(0, 0, 391, 265);
		}
		return lBackGround;
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
	
	public JTextField getTfBirthDate() {
		if (tfBirthDate == null) {
			tfBirthDate = new JPlaceholderTextField("Fecha de Nacimiento : año-mes-día");
			tfBirthDate.setHorizontalAlignment(SwingConstants.LEFT);
			tfBirthDate.setForeground(Color.LIGHT_GRAY);
			tfBirthDate.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfBirthDate.setBounds(40, 81, 294, 38);
			tfBirthDate.setColumns(10);
			
		}
		return tfBirthDate;
	}
	
	public JTextField getTfGender() {
		if (tfGender == null) {
			tfGender = new JPlaceholderTextField("Género");
			tfGender.setForeground(Color.LIGHT_GRAY);
			tfGender.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfGender.setColumns(10);
			tfGender.setBounds(40, 130, 294, 38);
		}
		return tfGender;
	}
	
	public JButton getBNext() {
		if (bNext == null) {
			bNext = new JButton("Continuar");
			bNext.setBorderPainted(false);
			bNext.setBackground(new Color(173, 216, 230));
			bNext.setForeground(new Color(255, 255, 255));
			bNext.setFont(new Font("Dialog", Font.BOLD, 12));
			bNext.setBounds(40, 179, 294, 29);
		}
		return bNext;
	}
}
