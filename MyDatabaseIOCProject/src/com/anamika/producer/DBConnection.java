package com.anamika.producer;

public class DBConnection implements Connection {

	private String URL;
	private String username;
	private String password;
	
	

	public DBConnection() {
		super();
	}

	public DBConnection(String URL, String username, String password) {
		super();
		this.URL = URL;
		this.username = username;
		this.password = password;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void connect() {
		System.out.println("User is connected with "+URL+ " connection with username:"+username +" and password:"+password);
	}

}
