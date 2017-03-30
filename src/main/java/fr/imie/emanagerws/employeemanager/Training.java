package fr.imie.emanagerws.employeemanager;

import java.util.ArrayList;
import java.util.List;

public class Training {

    private String theme;
    private long date;

    private List<Employee> recipients;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void addRecipients (final Employee employee){
        if ( this.recipients == null ){
            this.recipients = new ArrayList<Employee>();
        }
        this.recipients.add(employee);
    }

    public void removeRecipient(final Employee employee) {
        if ( this.recipients != null ){
            this.recipients.remove(employee);
        }
    }
}
