package kh.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Contact {
	private String phone;
	private String address;
	
	public Contact(String phone, String address) {
		this.phone = phone;
		this.address = address;
	}
	public Contact() {
		super();
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
