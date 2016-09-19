package fr.imie.emanagerws.service;

import org.junit.Test;

import ch.qos.logback.core.net.SyslogOutputStream;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import fr.imie.emanagerws.entity.Contact;

public class ServiceTest {
	private Service service = null;
	
	@Before
	public void before (){
		service = new Service();
	}
	
	@Test
	public void shouldGetContactById (){
		Contact contact = service.findContactById(2);
		
		assertNotNull(contact);
		assertTrue("The id should be equal to 2", contact.getId() == 2);
	}
	
	@After
	public void after (){
		service = null;
	}
}
