package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;

import utils.RouteImages;

@SuppressWarnings("serial")
public class GUIHome extends JFrame {
	
	//COMPONENTS
	private JPanel pStory;
	private JPanel pPublications;
	private JPanel pOptions;

	private JLabel lInstagram;
	private JLabel lMessage;
	
	private JLabel lNewStory;
	
	private JLabel lHome;
	private JLabel lSearch;
	private JLabel lAdd;
	private JLabel lUser;

	public GUIHome() {
		
		//BACKGROUND
		getContentPane().setBackground(Color.WHITE);
		
		//ADD	
		getContentPane().add(getLInstagram());
		getContentPane().add(getLMessage());
		
		getContentPane().add(getPStory());
		getContentPane().add(getPOptions());
		getContentPane().add(getPPublications());

		init();
	}
	
	public void init() {
		setTitle("Home");
		setSize(355,555);
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RouteImages.ICON));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//METHODS
	public JLabel getLInstagram() {
		if (lInstagram == null) {
			lInstagram = new JLabel("");	
			lInstagram.setVerticalAlignment(SwingConstants.TOP);
			ImageIcon image = new ImageIcon(RouteImages.INSTAGRAM);		
			lInstagram.setIcon(new ImageIcon(image.getImage().getScaledInstance(150, 50, Image.SCALE_DEFAULT)));
			lInstagram.setBounds(5, 4, 268, 72);
			lInstagram.setHorizontalAlignment(SwingConstants.LEFT);	
		}
		return lInstagram;
	}
	
	public JLabel getLMessage() {
		if (lMessage == null) {
			lMessage = new JLabel("");
			lMessage.setHorizontalAlignment(SwingConstants.CENTER);
			ImageIcon image = new ImageIcon(RouteImages.MESSAGE);		
			lMessage.setIcon(new ImageIcon(image.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
			lMessage.setBounds(286, 8, 46, 34);
		}
		return lMessage;
	}
		
	public JLabel getLNewStory() {
		if (lNewStory == null) {
			lNewStory = new JLabel("");
			ImageIcon image = new ImageIcon(RouteImages.NEWSTORY);		
			lNewStory.setIcon(new ImageIcon(image.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
			lNewStory.setBounds(5, 0, 80, 85);
		}
		return lNewStory;
	}
	
	public JLabel getLHome() {
		if (lHome == null) {
			lHome = new JLabel("");
			ImageIcon image = new ImageIcon(RouteImages.HOME);	
			lHome.setIcon(new ImageIcon(image.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
			lHome.setHorizontalAlignment(SwingConstants.LEFT);
			lHome.setBounds(10, 11, 56, 38);
		}
		return lHome;
	}
	
	public JLabel getLSearch() {
		if (lSearch == null) {
			lSearch = new JLabel("");
			lSearch.setHorizontalAlignment(SwingConstants.CENTER);
			ImageIcon image = new ImageIcon(RouteImages.SEARCH);	
			lSearch.setIcon(new ImageIcon(image.getImage().getScaledInstance(25,25, Image.SCALE_DEFAULT)));
			lSearch.setBounds(90, 11, 56, 38);
		}
		return lSearch;
	}
	
	public JLabel getLAdd() {
		if (lAdd == null) {
			lAdd = new JLabel("");
			lAdd.setHorizontalAlignment(SwingConstants.CENTER);
			ImageIcon image = new ImageIcon(RouteImages.ADD);	
			lAdd.setIcon(new ImageIcon(image.getImage().getScaledInstance(35,35, Image.SCALE_DEFAULT)));
			lAdd.setBounds(188, 11, 56, 38);
		}
		return lAdd;
	}
	
	public JLabel getLUser() {
		if (lUser == null) {
			lUser = new JLabel("");
			lUser.setHorizontalAlignment(SwingConstants.RIGHT);
			ImageIcon image = new ImageIcon(RouteImages.USER);	
			lUser.setIcon(new ImageIcon(image.getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT)));
			lUser.setBounds(273, 11, 56, 38);
		}
		return lUser;
	}
	
	public JPanel getPStory() {
		if (pStory == null) {
			pStory = new JPanel();
			pStory.setOpaque(false);
			pStory.setBounds(0, 44, 339, 85);
			pStory.setLayout(null);
			pStory.add(getLNewStory());
		}
		return pStory;
	}
	
	public JPanel getPPublications() {
		if (pPublications == null) {
			pPublications = new JPanel();
			pPublications.setBounds(10, 140, 319, 307);
		}
		return pPublications;
	}
		
	public JPanel getPOptions() {
		if (pOptions == null) {
			pOptions = new JPanel();
			pOptions.setOpaque(false);
			pOptions.setLayout(null);
			pOptions.setBounds(0, 458, 339, 58);
			pOptions.add(getLUser());
			pOptions.add(getLHome());
			pOptions.add(getLSearch());
			pOptions.add(getLAdd());
		}
		return pOptions;
	}
}
