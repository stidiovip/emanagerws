package fr.imie.emanagerws.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.imie.emanagerws.entity.Contact;


public class Service {
	
	/**
	 * Collection of contacts
	 */
	private List<Contact> contacts = null;
    
	/**
	 * The default constructor 
	 * 
	 * This adds some data for testing purpose
	 */
    public Service (){
    	contacts = new ArrayList<Contact>();
    	
    	// adding testing data
    	contacts.add( new Contact (1L, "Nantes, France", "03838386"));
    	contacts.add( new Contact (2L, "Rennes, France", "03838385"));
    	contacts.add( new Contact (3L, "Paris, France", "03838384"));
    	contacts.add( new Contact (4L, "Mans, France", "03838383"));
    }

    /**
     * Gets the list of contacts
     * @return
     */
	public List<Contact> getContacts() {
		return contacts;
	}
    
	/**
	 * Gets contact by id
	 * 
	 * Note : Makes use of Java8 streams
	 * 
	 * @param id : the id of the contact to get
	 * @return {@link Contact}}
	 */
    public Contact findContactById ( final long id ){
    	Optional<Contact> contact = this.contacts.stream().filter(cont -> { return true;}).findFirst();
    	return contact.isPresent() ? contact.get() : null;
    }
}
