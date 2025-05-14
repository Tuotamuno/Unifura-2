
package ishi_aki;

import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import org.json.JSONObject;


@Path("new")
public class New {

    @Context
    private UriInfo context;

 
    public New() {
    }

 
    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        JSONObject reply = new JSONObject();
        reply.put("status", "I Dey Kampe");
        return reply.toString();
        
    }

  
}
