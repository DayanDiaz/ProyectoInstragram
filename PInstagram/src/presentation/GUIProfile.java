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
public class GUIProfile extends JFrame {
	private JLabel lPhoto;
	private JLabel lpublications;
	private JLabel lFollowers;
	private JLabel lFollowed;
	private JLabel lNumPublications;
	private JLabel lNumFollowers;
	private JLabel lNumFollowed;
	private JLabel lName;
	private JButton bEditProfile;
	private JPanel pPublications;
	private JButton bPhotos;
	private JButton bVideos;
	private JButton bStarted;
	private JButton bSearch;
	private JButton bProfile;
	private JButton bAdd;
	
	public GUIProfile() {
		getContentPane().setBackground(Color.WHITE);
		
		getContentPane().setLayout(null);
		getContentPane().add(getLPhoto());
		getContentPane().add(getLpublications());
		getContentPane().add(getLFollowers());
		getContentPane().add(getLFollowed());
		getContentPane().add(getLNumPublications());
		getContentPane().add(getLNumFollowers());
		getContentPane().add(getLNumFollowed());
		getContentPane().add(getLName());
		getContentPane().add(getBEditProfile());
		getContentPane().add(getPPublications());
		getContentPane().add(getBPhotos());
		getContentPane().add(getBVideos());
		getContentPane().add(getBStarted());
		getContentPane().add(getBSearch());
		getContentPane().add(getBProfile());
		getContentPane().add(getBAdd());
		
		
		initialization();
	}
	
	public void initialization() {
		setTitle("Perfil");
		setSize(498,690);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JLabel getLPhoto() {
		if (lPhoto == null) {
			lPhoto = new JLabel("");
			lPhoto.setBounds(10, 21, 127, 114);
			
			ImageIcon image = new ImageIcon("images\\profile.jpg");
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(127,
					114, Image.SCALE_DEFAULT));
						
			lPhoto.setIcon(icon);
			

		}
		return lPhoto;
	}
	public JLabel getLpublications() {
		if (lpublications == null) {
			lpublications = new JLabel("Publicaciones");
			lpublications.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lpublications.setBounds(193, 85, 63, 23);
		}
		return lpublications;
	}
	public JLabel getLFollowers() {
		if (lFollowers == null) {
			lFollowers = new JLabel("Seguidores");
			lFollowers.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lFollowers.setBounds(298, 85, 60, 23);
		}
		return lFollowers;
	}
	public JLabel getLFollowed() {
		if (lFollowed == null) {
			lFollowed = new JLabel("Seguidos");
			lFollowed.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lFollowed.setBounds(401, 85, 63, 23);
		}
		return lFollowed;
	}
	public JLabel getLNumPublications() {
		if (lNumPublications == null) {
			lNumPublications = new JLabel("0");
			lNumPublications.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lNumPublications.setHorizontalAlignment(SwingConstants.CENTER);
			lNumPublications.setBounds(194, 54, 46, 32);
		}
		return lNumPublications;
	}
	public JLabel getLNumFollowers() {
		if (lNumFollowers == null) {
			lNumFollowers = new JLabel("0");
			lNumFollowers.setHorizontalAlignment(SwingConstants.CENTER);
			lNumFollowers.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lNumFollowers.setBounds(307, 54, 46, 32);
		}
		return lNumFollowers;
	}
	public JLabel getLNumFollowed() {
		if (lNumFollowed == null) {
			lNumFollowed = new JLabel("0");
			lNumFollowed.setHorizontalAlignment(SwingConstants.CENTER);
			lNumFollowed.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lNumFollowed.setBounds(401, 54, 46, 32);
		}
		return lNumFollowed;
	}
	public JLabel getLName() {
		if (lName == null) {
			lName = new JLabel("(Nombre)");
			lName.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lName.setBounds(26, 143, 148, 23);
		}
		return lName;
	}
	public JButton getBEditProfile() {
		if (bEditProfile == null) {
			bEditProfile = new JButton("Editar perfil");
			bEditProfile.setBackground(Color.WHITE);
			bEditProfile.setFont(new Font("Tahoma", Font.PLAIN, 13));
			bEditProfile.setBounds(10, 177, 462, 23);
		}
		return bEditProfile;
	}
	public JPanel getPPublications() {
		if (pPublications == null) {
			pPublications = new JPanel();
			pPublications.setBounds(10, 245, 462, 341);
		}
		return pPublications;
	}
	public JButton getBPhotos() {
		if (bPhotos == null) {
			bPhotos = new JButton("");
			bPhotos.setBounds(10, 213, 221, 32);
			
			ImageIcon image = new ImageIcon("images\\publications.png");
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(34,
					30, Image.SCALE_DEFAULT));
			
			bPhotos.setIcon(icon);
			
			bPhotos.setOpaque(false);
			bPhotos.setContentAreaFilled(false);
			bPhotos.setBorderPainted(false);
		}
		return bPhotos;
	} 
	public JButton getBVideos() {
		if (bVideos == null) {
			bVideos = new JButton("");
			bVideos.setBounds(251, 213, 221, 32);
			
			ImageIcon image = new ImageIcon("images\\videos.png");
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(34,
					30, Image.SCALE_DEFAULT));
			
			bVideos.setIcon(icon);
			
			bVideos.setOpaque(false);
			bVideos.setContentAreaFilled(false);
			bVideos.setBorderPainted(false);
		}
		return bVideos;
	}
	public JButton getBStarted() {
		if (bStarted == null) {
			bStarted = new JButton("");
			
			bStarted.setBounds(10, 597, 97, 43);
			
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
			bSearch.setBounds(132, 597, 97, 43);
			
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
			bProfile.setBounds(375, 597, 97, 43);
			
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
			bAdd.setBounds(251, 597, 97, 43);
			
			
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
}
