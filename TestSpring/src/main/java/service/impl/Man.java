package service.impl;

import service.IPerson;

public class Man implements IPerson {
	private String username;
	

	public Man() {
		//super();
		this.username = null;
	}
	public Man(String username) {
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
		System.out.println(username+"是男神！");

	}

}
