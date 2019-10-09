
package operation;

import java.util.List;
import model.Student;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import services.LinkSearch;

@Path("search")
public class Search {
    @Context
    private UriInfo context;
    LinkSearch link = new LinkSearch();
    public Search() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String instructions() {
        return "To search a [ USER ] the following "
                + "format is used:\n"
                + ".../USER/{name}\n"
                + ".../USER/{name}/{password}\n"
                + ".../USER/ADMINS\n"
                + ".../USER/EMPLOYEES\n"
                + ".../USERS\n"
                + "Example: \n"
                + ".../USER/Lucas\n"
                +
                "To search a [ SAUCER ] the following "
                + "format is used:\n"
                + ".../SAUCER/{name}\n"
                + ".../SAUCERS\n"
                + "Example: \n"
                + ".../SAUCER/stuffed rice\n\n\n"
                +
                "To search a [ CLIENT ] the following "
                + "format is used:\n"
                + ".../CLIENT/{firsname}/{lastname}\n"
                + ".../CLIENTS\n"
                + "Example: \n"
                + ".../CLIENT/Luigi/Villarreal\n\n\n"
                +
                "To search a [ MENU ] the following "
                + "format is used:\n"
                + ".../MENU/{nameMenu}\n"
                + ".../MENUS\n"
                + "Example: \n"
                + ".../MENU/ComidaSierra\n\n\n"
                +
                "To search a [ PURCHASE ] the following "
                + "format is used:\n"
                + ".../PURCHASE/{namePurchase}\n"
                + ".../PURCHASE\n"
                + ".../PURCHASEDAY\n"
                + "Example: \n"
                + ".../PURCHASE/Encebollado\n\n\n";
    }
    
    @Path("STUDENT/{firstname}/{lastname}")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student setStudent(@PathParam("firstname") String firstname, 
            @PathParam("lastname") String lastname) 
    {
        return link.getStudent(firstname, lastname);
    }
    
    @Path("STUDENTS")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> setStudents() 
    {
        return link.listStudent();
    }
    
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
