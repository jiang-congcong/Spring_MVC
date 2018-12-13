package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.impl.Man;
import service.impl.Woman;

@Component
public class Lover {
	
	@Autowired
	private Man man;
	
	@Autowired
	private Woman woman;
	
	public Lover(){}
	
	/*public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
	public Woman getWoman() {
		return woman;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
*/
	@Override
	public String toString() {
		//return "Lover [man=" + man + ", woman=" + woman + "]";
		return man.getUsername()+"和"+woman.getUsername()+"是情侣!";
	}
	
	
	

}
