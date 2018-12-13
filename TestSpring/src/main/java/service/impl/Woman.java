package service.impl;

import service.IPerson;

public class Woman implements IPerson {
	private String username;
	

	public Woman() {
		//super();
		this.username =null;
	}
	public Woman(String username) {
		//super();
		this.username = username;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println(username+"是女神！");

	}

}
