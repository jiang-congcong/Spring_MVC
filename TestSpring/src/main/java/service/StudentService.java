package service;

import service.impl.*;

public class StudentService {
	private IPerson person;
	public IPerson getPerson() {
	return person;
	}
	public void setPerson(IPerson person) {
	this.person = person;
	}
	public StudentService() {
	this.person=new Man("zhangsan");
	}
	public StudentService(IPerson person) {
	this.person=person;
	}

}
