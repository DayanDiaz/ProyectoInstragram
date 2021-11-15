package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DatabaseConnect {
	
	private static DatabaseConnect dbC;
	
	String user;
	String clave;
	String url;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	private DatabaseConnect() {
		
		user = "root";
		clave = "D1234n./";
		url = "jdbc:mysql://localhost:3306/instragram_proyecto";
		
		try {
			con = DriverManager.getConnection(url, user, clave);
			stmt = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DatabaseConnect getInstance() {
		
		if(dbC == null) {
			
			dbC = new DatabaseConnect();
		}
		return dbC;
	}
	
	public void insertUser(String username,String password,String name,String lastName1,String lastName2,String phone,
			String dateOfBirth,String gender) {
		
		try {
			
			stmt.executeUpdate("INSERT INTO tb_usuario VALUES('"+username+"','"+password+"','"+name+"','"+lastName1+"','"+
					lastName2+"','"+phone+"','"+dateOfBirth+"','"+gender+"')"); //Insertar datos
			
			JOptionPane.showMessageDialog(null, "Cuenta creada");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al crear la cuenta");
		}
	}
	
	public void consultTable(String nameTable) {
		try {
			
			rs = stmt.executeQuery("SELECT * FROM "+nameTable);
			rs.next();
			
		
			
			do{
				System.out.println("User: "+rs.getString("usuario")+"\tNombre: "+rs.getString("nombre"));//Mostrar los datos de la tabla
			}while(rs.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean search(String id,String password) {
		try {
			rs = stmt.executeQuery("SELECT * FROM tb_usuario");
			rs.next();
			
			do{
				if((rs.getString("usuario").equals(id) || rs.getString("telefono").equals(id)) && rs.getString("contrasena").equals(password)) {
					
					return true;
					
				}
			}while(rs.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "La contraseña es incorrecta o\n el usuario no existe");
		return false;
		
	}
	

}