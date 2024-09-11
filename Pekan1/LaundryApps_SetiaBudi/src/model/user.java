package model;

public class user {

	String id,nama,username,password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasword() {
		return password;
	}

	public void setPassword(String pasword) {
		this.password = pasword;
	}
	
	public static boolean login (String username, String password) {
		boolean isLoggin = false ;
		user user = new user ();
		user.setId ("1");
		user.setNama ("fulan");
		user.setUsername(username);
		user.setPassword ("12345");
		
		if (user.getUsername().equalsIgnoreCase(username)
			&&user.getPasword().equalsIgnoreCase(password))
		{
			isLoggin= true;
		}else {
			isLoggin =false;
		}
		return isLoggin ;
	}
	
		
		
	}


