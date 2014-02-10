package model;
 
import java.sql.Connection;
import java.util.ArrayList;

import dto.Access;
import dto.Course;
import dto.Database;
import dto.Graph;
 
public class AccessManager {

	public ArrayList<Course> getCourses() throws Exception
	{
		ArrayList<Course> courseList = new ArrayList<Course>();
		Database db = new Database();
		Connection con = db.getConnection();
		Access access = new Access();
		courseList = access.getCourses(con);
		return courseList;
	}
	public ArrayList<Graph> getGraphData() throws Exception
	{
		ArrayList<Graph> courseList = new ArrayList<Graph>();
		Database db = new Database();
		Connection con = db.getConnection();
		Access access = new Access();
		courseList = access.getChartData(con);
		return courseList;
	}
}