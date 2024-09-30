package DAO;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import config.Database;
import model.Service;


public class ServiceRepo implements ServiceDAO{

	
	private Connection connection ;
	final String insert = " INSERT INTO user (name,username,password) VALUES (?,?,?) ;";
	final String select = " SELECT * FROM user;";
	final String delete = " DELETE FROM user HERE id =?;";
	final String update = " UPDATE user SET nam=?. username=?, password=? WHERE id=?;";
	
	public ServiceRepo () {
		connection =Database.koneksi ();
	}

	@Override
	public void save (Service service){
		
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(insert);
			st.setString ( 1, service.getJenis());
			st.setString(2,service.getHarga ());
			st.setString(3,service.getStatus ());
			st.executeUpdate();
			 int rowsAffected = st.executeUpdate();
			System.out.println(rowsAffected + " rows inserted."); 
			
		}catch (SQLException e ) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	
	public List<Service> show (){
		// TODO Auto-generated method stub
		List <Service> ls=null;
		try {
			ls =new ArrayList<Service>();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(select);
			while (rs.next()) {
				Service service = new Service ();
				service.setId(rs.getString("id"));
				service.setJenis(rs.getString("name"));
				service.setStatus(rs.getString("username"));
				ls.add(service);
			}
		}catch (SQLException e) {
			Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE,null, e);
		}
		return ls;
	}

	@Override
	public void delete(String id) {
		PreparedStatement st = null ;
		try {
			st=connection.prepareStatement (delete);
			st.setString(1,id);
			st.executeUpdate();
		
			
		}catch (SQLException e ) {
			e.printStackTrace ();
			
		} finally {
			try {
				st.close();
				
			}catch (SQLException e ) {
				e.printStackTrace();
			}
		}
	}
		// TODO Auto-generated method stub
		
	

	@Override
	public void update (Service service) {
		PreparedStatement st = null ;
		try {
			st.getConnection().prepareStatement (update);
			st.setString(1, service.getJenis());
			st.setString(2,service.getStatus());
			st.setString(3,service.getHarga());
			st.setString(4, service.getId());
			
		}catch (SQLException e ) {
			e.printStackTrace ();
			
		} finally {
			try {
				st.close();
				
			}catch (SQLException e ) {
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
	}

		@Override
		public void save(java.security.Provider.Service service) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(java.security.Provider.Service Service) {
			// TODO Auto-generated method stub
			
		}

	

		// TODO Auto-generated method stub
		
	
	
	
}
