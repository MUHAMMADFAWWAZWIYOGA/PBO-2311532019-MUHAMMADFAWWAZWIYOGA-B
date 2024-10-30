package DAO;

import java.sql.Connection;

public interface OrderDetailREPO {
	

		
		private Connection connection ;
		final String insert = " INSERT INTO user (name,username,password) VALUES (?,?,?) ;";
		final String select = " SELECT * FROM user;";
		final String delete = " DELETE FROM user HERE id =?;";
		final String update = " UPDATE user SET nam=?. username=?, password=? WHERE id=?;";
		

		public OrderDetailREPO() {
			connection =Database.koneksi ();
		}
		@Override
		public default void Order (Order order) {
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(insert);
			st.setString ( 1,costumer.getNama());
			st.setString(2,costumer.getAlamat ());
			st.setInt(3,costumer.getNomorHp ());
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
		public List<Order> show () {
			List <Costumer> ls=null;
			try {
				ls =new ArrayList<Costumer>();
				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery(select);
				while (rs.next()) {
					Costumer costumer= new Costumer();
					costumer.setId(rs.getString("id"));
					costumer.setNama(rs.getString("name"));
					costumer.setAlamat(rs.getString("username"));
					costumer.setNomorHp(rs.getInt("password"));
					ls.add(costumer);
				}
			}catch (SQLException e) {
				Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE,null, e);
			}
			return ls ;
		}

		@Override
		public void update (Order order) {
			PreparedStatement st = null ;
			try {
				st.getConnection().prepareStatement (update);
				st.setString(1,costumer.getNama());
				st.setString(2,costumer.getAlamat());
				st.setInt(3,costumer.getNomorHp());
				st.setString(4,costumer.getId());
				
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

		@Override
		public void delete (String id) {
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
		
		@Override
		public String toL (String_OrderID(model.Costumer costumer) {
			// TODO Auto-generated method stub
			
		}
		}



}
