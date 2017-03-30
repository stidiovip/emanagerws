package fr.imie.emanagerws.employeemanager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tidiane on 30/03/2017.
 */
public class Mission {

    private long start;
    private long end;

    private List<Employee> team;

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void addTeamMember  (final Employee employee){
        if ( this.team == null ){
            this.team = new ArrayList<Employee>();
        }
        this.team.add(employee);
    }
}
