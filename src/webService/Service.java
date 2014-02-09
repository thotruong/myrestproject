package webService;

import java.util.ArrayList;
import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;
import model.AccessManager;
import com.google.gson.Gson;
import dao.Course;

@Path("/status")
public class Service {
	
	@GET
	@Path("/courses")
	@Produces("application/json")
	public String courses()
	{
		String courses = null;
		ArrayList<Course> courseList = new ArrayList<Course>();
	
		try
		{
			courseList = new AccessManager().getCourses();
			Gson gson = new Gson();
			courses = gson.toJson(courseList);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return courses;
	}
}
