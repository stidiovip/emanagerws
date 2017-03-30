package fr.imie.emanagerws.employeemanager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tidiane on 30/03/2017.
 */
public class Employee {

    private String firstname;
    private String lastname;
    private String address;
    private String phone;

    private List<Mission> missions;
    private List<Training> trainings;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public List<Mission> getMissions() {
        return missions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (!firstname.equals(employee.firstname)) return false;
        return lastname.equals(employee.lastname);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        return result;
    }

    public void effectuer (final Mission mission){
        if ( this.missions == null ){
            this.missions = new ArrayList<Mission>();
        }

        this.missions.add(mission);
        mission.addTeamMember (this);
    }

    public void register (final Training training ){
        if ( this.trainings == null ) {
            this.trainings = new ArrayList<Training>();
        }
        this.trainings.add(training);
        training.addRecipients(this);
    }

    public void unregister (final Training training ){
        if ( this.trainings != null ){
            this.trainings.remove(training);
        }

        training.removeRecipient(this);
    }
}
