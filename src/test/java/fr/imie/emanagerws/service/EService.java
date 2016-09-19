package fr.imie.emanagerws.service;

import java.util.ArrayList;
import java.util.List;

import fr.imie.emanagerws.entity.Employee;

public class EService {
	
    private static List<Employee> employees = null;
    private static int count = 0;
    
    public EService (){
    	if ( employees == null ){
    		employees = new ArrayList<Employee>();
    	}
    }
    
    /**
     * Adds a new employee
     * @param employeeToAdd
     * @return
     */
	public Employee addEmployee(Employee employeeToAdd) {
		count ++;
		
		employeeToAdd.setId(count);
		employeeToAdd.getContact().setId(count);
		employees.add(employeeToAdd);
		return employeeToAdd;
	}
	
	/**
	 * Finds an employee by id
	 * 
	 * @param id
	 * @return
	 */
	public Employee findEmployeeById(int id) {
		for (Employee e : employees){
			if ( e.getId() == id ){
				return new Employee(e);
			}
		}
		
		return null;
	}

}
