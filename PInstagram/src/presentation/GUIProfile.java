package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;

import utils.RouteImages;

@SuppressWarnings("serial")
public class GUIProfile extends JFrame {
	
	//COMPONETS
	private JPanel pPublications;
	private JPanel pOptions;
	
	private JLabel lPhotoProfile;
	private JLabel lUserName;
	private JLabel lDescription;
	
	private JLabel lNumPublications;
	private JLabel lPublications;
	
	private JLabel lNumFollowers;
	private JLabel lFollowers;
	
	private JLabel lNumFollowed;
	private JLabel lFollowed;
	
	private JLabel lPhotos;
	private JLabel lVideos;
	
	private JLabel lHome;
	private JLabel lSearch;
	private JLabel lAdd;
	private JLabel lUser;
	
	private JButton bEditProfile;
	
	public GUIProfile() {
		
		//BACKGROUND
		getContentPane().setBackground(Color.WHITE);
		
		//ADD	
		getContentPane().add(getLPhotoProfile());
		getContentPane().add(getLUserName());
		getContentPane().add(getTADescription());
		
		getContentPane().add(getLNumPublications());
		getContentPane().add(getLPublications());
		
		getContentPane().add(getLNumFollowers());
		getContentPane().add(getLFollowers());
		
		getContentPane().add(getLNumFollowed());
		getContentPane().add(getLFollowed());
		
		getContentPane().add(getLPhotos());
		getContentPane().add(getLVideos());
			
		getContentPane().add(getBEditProfile());
		
		getContentPane().add(getPOptions());
		getContentPane().add(getPPublications());
		
		init();
	}
	
	public void init() {
		setTitle("Perfil");
		setSize(355,555);	
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RouteImages.ICON));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//METHODS
	public JLabel getLPhotoProfile() {
		if (lPhotoProfile == null) {
			lPhotoProfile = new JLabel("");
			lPhotoProfile.setBounds(10, 11, 97, 94);
			lPhotoProfile.setIcon(new ImageIcon(RouteImages.PHOTOPROFILE));
		}
		return lPhotoProfile;
	}
	
	public JLabel getLUserName() {
		if (lUserName == null) {
			lUserName = new JLabel(" (Nombre)");
			lUserName.setFont(new Font("Dialog", Font.BOLD, 12));
			lUserName.setBounds(10, 116, 319, 14);
		}
		return lUserName;
	}
	
	public JLabel getTADescription() {
		if (lDescription == null) {
			lDescription = new JLabel();
			lDescription.setVerticalAlignment(SwingConstants.TOP);
			lDescription.setFont(new Font("Dialog", Font.PLAIN, 12));
			lDescription.setText("(Descripci\u00F3n)");
			lDescription.setForeground(Color.DARK_GRAY);
			lDescription.setBounds(10, 141, 319, 58);
		}
		return lDescription;
	}
	
	public JLabel getLNumPublications() {
		if (lNumPublications == null) {
			lNumPublications = new JLabel("0");
			lNumPublications.setFont(new Font("Dialog", Font.PLAIN, 18));
			lNumPublications.setHorizontalAlignment(SwingConstants.CENTER);
			lNumPublications.setBounds(131, 31, 37, 32);
		}
		return lNumPublications;
	}
	
	public JLabel getLPublications() {
		if (lPublications == null) {
			lPublications = new JLabel("Publicaciones");
			lPublications.setHorizontalAlignment(SwingConstants.CENTER);
			lPublications.setFont(new Font("Dialog", Font.PLAIN, 10));
			lPublications.setBounds(114, 63, 76, 23);
		}
		return lPublications;
	}
	
	public JLabel getLNumFollowers() {
		if (lNumFollowers == null) {
			lNumFollowers = new JLabel("0");
			lNumFollowers.setHorizontalAlignment(SwingConstants.CENTER);
			lNumFollowers.setFont(new Font("Dialog", Font.PLAIN, 18));
			lNumFollowers.setBounds(210, 36, 37, 23);
		}
		return lNumFollowers;
	}
	
	public JLabel getLFollowers() {
		if (lFollowers == null) {
			lFollowers = new JLabel("Seguidores");
			lFollowers.setFont(new Font("Dialog", Font.PLAIN, 10));
			lFollowers.setBounds(205, 63, 56, 23);
		}
		return lFollowers;
	}
	
	public JLabel getLNumFollowed() {
		if (lNumFollowed == null) {
			lNumFollowed = new JLabel("0");
			lNumFollowed.setHorizontalAlignment(SwingConstants.CENTER);
			lNumFollowed.setFont(new Font("Dialog", Font.PLAIN, 18));
			lNumFollowed.setBounds(276, 31, 37, 32);
		}
		return lNumFollowed;
	}
	
	public JLabel getLFollowed() {
		if (lFollowed == null) {
			lFollowed = new JLabel("Seguidos");
			lFollowed.setHorizontalAlignment(SwingConstants.CENTER);
			lFollowed.setFont(new Font("Dialog", Font.PLAIN, 10));
			lFollowed.setBounds(266, 63, 63, 23);
		}
		return lFollowed;
	}

	public JLabel getLPhotos() {
		if (lPhotos == null) {
			lPhotos = new JLabel("");
			ImageIcon image = new ImageIcon(RouteImages.PHOTOS);	
			lPhotos.setIcon(new ImageIcon(image.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
			lPhotos.setHorizontalAlignment(SwingConstants.CENTER);
			lPhotos.setBounds(10, 234, 158, 32);
		}
		return lPhotos;
	}
	
	public JLabel getLVideos() {
		if (lVideos == null) {
			lVideos = new JLabel("");
			ImageIcon image = new ImageIcon(RouteImages.VIDEOS);	
			lVideos.setIcon(new ImageIcon(image.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
			lVideos.setHorizontalAlignment(SwingConstants.CENTER);
			lVideos.setBounds(171, 234, 158, 32);
		}
		return lVideos;
	}
	
	public JButton getBEditProfile() {
		if (bEditProfile == null) {
			bEditProfile = new JButton("Editar perfil");
			bEditProfile.setForeground(Color.WHITE);
			bEditProfile.setBackground(SystemColor.textHighlight);
			bEditProfile.setFont(new Font("Dialog", Font.PLAIN, 13));
			bEditProfile.setBounds(10, 204, 319, 23);
		}
		return bEditProfile;
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
	
	public JPanel getPPublications() {
		if (pPublications == null) {
			pPublications = new JPanel();
			pPublications.setBounds(10, 277, 319, 170);
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
