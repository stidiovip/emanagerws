package fr.imie.emanagerws.entity;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private float salary;
	
	private Contact contact;
	
	public Employee(){
		
	}
	
	/**
	 * The Copy Constructor
	 * @param e
	 */
	public Employee (Employee e){
		this.id = e.getId();
		this.firstname = e.getFirstname();
		this.lastname = e.getLastname();
		this.salary = e.getSalary();
		
		Contact c = e.getContact();
		this.contact = new Contact(c.getId(), c.getAddress(), c.getPhone());
	}
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
}
