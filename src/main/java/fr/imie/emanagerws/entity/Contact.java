package fr.imie.emanagerws.entity;

public class Contact {

	private long id;
	private String address;
	private String phone;
	
	public Contact (){
		
	}
	
	public Contact (final long id, final String address, final String phone){
		this.id = id;
		this.address = address;
		this.phone = phone;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
