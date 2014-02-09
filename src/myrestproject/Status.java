package myrestproject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;

@Path("/status")
public class Status {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Tho Java Web Service</p>";
	}
}
