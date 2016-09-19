package fr.imie.emanagerws.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import fr.imie.emanagerws.entity.Contact;
import fr.imie.emanagerws.entity.Employee;

public class EServiceTest {
	private EService eService = null;
	@Before
	public void before (){
		eService = new EService();
	}
	
	@Test
	public void shouldAddEmployee (){
		// Employee to add
		Employee employeeToAdd = new Employee();
		employeeToAdd.setFirstname ("Tidiane");
		employeeToAdd.setLastname ("SIDIBE");
		employeeToAdd.setSalary(30000f);
		
		// The contact of the employee
		Contact contact = new Contact();
		contact.setAddress("Nantes, France");
		contact.setPhone("050505050505");
		employeeToAdd.setContact(contact);
		
		// Adding the employee
		employeeToAdd = eService.addEmployee(employeeToAdd);
		
		assertThat(employeeToAdd).isNotNull();
		assertThat(employeeToAdd.getId()).isNotEqualTo(0);
		
		Employee addedEmployee = eService.findEmployeeById(employeeToAdd.getId());
		
		assertThat(addedEmployee.getFirstname()).isEqualTo("Tidiane");
		assertThat(addedEmployee.getLastname()).isEqualTo("SIDIBE");
		
	}
	
	@After
	public void after (){
		eService = null;
	}
}
