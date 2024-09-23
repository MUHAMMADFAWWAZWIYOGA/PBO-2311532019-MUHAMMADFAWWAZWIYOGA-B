package model;

public class User {

	String id,nama,username, password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return nama;
	}

	public void setName(String nama) {
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

	public void setPassword(String string) {
		this.password = string;
	}
	
	public static boolean login (String username, String password) {
		boolean isLoggin = false ;
		User user = new User ();
		user.setId ("1");
		user.setName ("fulan");
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


