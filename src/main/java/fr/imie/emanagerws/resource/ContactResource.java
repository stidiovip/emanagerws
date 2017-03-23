package fr.imie.emanagerws.resource;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import fr.imie.emanagerws.entity.Contact;
import fr.imie.emanagerws.service.Service;

@Path("/contacts")
@Produces({MediaType.APPLICATION_JSON})

public class ContactResource {

    private final Service service;

    public ContactResource(Service service){
        this.service = service;
    }

    @GET
    public List<Contact> getContacts (){
        return this.service.getContacts();
    }

    @GET
    @Path("/{id}")
    public Contact getContactByIdWithPathParam(@PathParam("id") final long id){
    	return this.service.findContactById(id);
    }

    @POST
    public Contact addContact (Contact contact){
        return this.service.addContact(contact);
    }

    @DELETE
    public void deleteContact (Contact contact){
        this.service.deleteContact(contact);
    }
}
