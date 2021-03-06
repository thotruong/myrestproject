package webService;

import java.util.ArrayList;

import javax.ws.rs.*;

import model.AccessManager;

import com.google.gson.Gson;

import dto.Course;
import dto.Graph;

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
	@GET
	@Path("/graph")
	@Produces("application/json")
	public String graph()
	{
		String courses = null;
		ArrayList<Graph> graphData = new ArrayList<Graph>();
	
		try
		{
			graphData = new AccessManager().getGraphData();
			Gson gson = new Gson();
			courses = gson.toJson(graphData);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return courses;
	}
}
