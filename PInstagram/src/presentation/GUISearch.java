package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;

import utils.RouteImages;

@SuppressWarnings("serial")
public class GUISearch extends JFrame {
	
	//COMPONENTS
	private JLabel lSearch;
	private JTextField tfSearch;

	public GUISearch() {
		
		//BACKGROUND
		getContentPane().setBackground(Color.WHITE);
		
		//ADD	
		getContentPane().add(getLSearch());

		init();
	}
	
	public void init() {
		setTitle("Búsqueda");
		setSize(355,555);
		getContentPane().setLayout(null);
		getContentPane().add(getTfSearch());
		setVisible(true);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RouteImages.ICON));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//METHODS
	public JLabel getLSearch() {
		if (lSearch == null) {
			lSearch = new JLabel("");
			lSearch.setHorizontalAlignment(SwingConstants.LEFT);
			ImageIcon image = new ImageIcon(RouteImages.SEARCH);	
			lSearch.setIcon(new ImageIcon(image.getImage().getScaledInstance(25,25, Image.SCALE_DEFAULT)));
			lSearch.setBounds(10, 11, 56, 38);
		}
		return lSearch;
	}
	public JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBorder(null);
			tfSearch.setHorizontalAlignment(SwingConstants.LEFT);
			tfSearch.setFont(new Font("Dialog", Font.PLAIN, 14));
			tfSearch.setBounds(57, 11, 272, 38);
			tfSearch.setColumns(10);
		}
		return tfSearch;
	}
}
