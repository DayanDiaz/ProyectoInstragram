package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;


@SuppressWarnings("serial")
public class GUIHome extends JFrame {
	private JPanel pPublications;
	private JButton bStarted;
	private JButton bSearch;
	private JButton bProfile;
	private JButton bAdd;
	private JButton bNewStory;
	private JPanel panel;
	private JLabel lLogo;
	private JButton bMessage;
	
	public GUIHome() {
		getContentPane().setBackground(Color.WHITE);
		
		getContentPane().setLayout(null);
		getContentPane().add(getPPublications());
		getContentPane().add(getBStarted());
		getContentPane().add(getBSearch());
		getContentPane().add(getBProfile());
		getContentPane().add(getBAdd());
		getContentPane().add(getPanel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getBMessage());
		
		
		initialization();
	}
	
	public void initialization() {
		setTitle("Home");
		setSize(498,690);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JPanel getPPublications() {
		if (pPublications == null) {
			pPublications = new JPanel();
			pPublications.setBounds(0, 134, 482, 459);
		}
		return pPublications;
	}
	public JButton getBStarted() {
		if (bStarted == null) {
			bStarted = new JButton("");
			//bStarted.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\Universidad de CostaRica\\2021\\Segundo Semestre\\Base de datos\\ProyectoInstagram\\PInstagram\\images\\home.png"));
			
			bStarted.setBounds(10, 604, 98, 47);
			
			ImageIcon image = new ImageIcon("images\\home.png");
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(34,
					34, Image.SCALE_DEFAULT));
			
			bStarted.setIcon(icon);
			
			bStarted.setOpaque(false);
			bStarted.setContentAreaFilled(false);
			bStarted.setBorderPainted(false);
			
		}
		return bStarted;
	}
	public JButton getBSearch() {
		if (bSearch == null) {
			bSearch = new JButton("");
			//bSearch.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\Universidad de CostaRica\\2021\\Segundo Semestre\\Base de datos\\ProyectoInstagram\\PInstagram\\images\\search.jpg"));
			bSearch.setBounds(141, 604, 98, 47);
			
			ImageIcon image = new ImageIcon("images\\search.jpg");
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(34,
					34, Image.SCALE_DEFAULT));
			
			bSearch.setIcon(icon);
			
			bSearch.setOpaque(false);
			bSearch.setContentAreaFilled(false);
			bSearch.setBorderPainted(false);
			
			
		}
		return bSearch;
	}
	public JButton getBProfile() {
		if (bProfile == null) {
			bProfile = new JButton("");
			//bProfile.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\Universidad de CostaRica\\2021\\Segundo Semestre\\Base de datos\\ProyectoInstagram\\PInstagram\\images\\profile.png"));
			bProfile.setBounds(384, 604, 98, 47);
			
			ImageIcon image = new ImageIcon("images\\profile.png");
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(34,
					34, Image.SCALE_DEFAULT));
			
			bProfile.setIcon(icon);
			
			bProfile.setOpaque(false);
			bProfile.setContentAreaFilled(false);
			bProfile.setBorderPainted(false);
		}
		return bProfile;
	}
	public JButton getBAdd() {
		if (bAdd == null) {
			bAdd = new JButton("");
			//bAdd.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\Universidad de CostaRica\\2021\\Segundo Semestre\\Base de datos\\ProyectoInstagram\\PInstagram\\images\\add.png"));
			bAdd.setBounds(249, 604, 98, 47);
			
			
			ImageIcon image = new ImageIcon("images\\add.png");
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(34,
					34, Image.SCALE_DEFAULT));
			
			bAdd.setIcon(icon);
			
			bAdd.setOpaque(false);
			bAdd.setContentAreaFilled(false);
			bAdd.setBorderPainted(false);
		}
		return bAdd;
	}
	public JButton getBNewStory() {
		if (bNewStory == null) {
			bNewStory = new JButton("");
			bNewStory.setBounds(0, 0, 82, 85);
		}
		return bNewStory;
	}
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(0, 44, 482, 85);
			panel.setLayout(null);
			panel.add(getBNewStory());
		}
		return panel;
	}
	public JLabel getLabel_1() {
		if (lLogo == null) {
			lLogo = new JLabel("Instagram");
			lLogo.setVerticalAlignment(SwingConstants.TOP);
			lLogo.setHorizontalAlignment(SwingConstants.LEFT);
			lLogo.setFont(new Font("Cookie", Font.PLAIN, 30));
			lLogo.setBounds(0, 4, 129, 34);
		}
		return lLogo;
	}
	public JButton getBMessage() {
		if (bMessage == null) {
			bMessage = new JButton("");
			//bMessage.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\Universidad de CostaRica\\2021\\Segundo Semestre\\Base de datos\\ProyectoInstagram\\PInstagram\\images\\message.png"));
			bMessage.setBounds(431, 4, 51, 40);
			

			ImageIcon image = new ImageIcon("images\\message.png");
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(40,
					35, Image.SCALE_DEFAULT));
			
			bMessage.setIcon(icon);
			
			bMessage.setOpaque(false);
			bMessage.setContentAreaFilled(false);
			bMessage.setBorderPainted(false);
		}
		return bMessage;
	}
}
