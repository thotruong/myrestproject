package dto;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
 
public class Access
{
	public ArrayList<Course> getCourses(Connection con) throws SQLException
	{
		ArrayList<Course> courseList = new ArrayList<Course>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM courses");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Course courseObj = new Course();
				courseObj.setId(rs.getInt("id"));
				courseObj.setName(rs.getString("name"));
				courseObj.setDuration(rs.getString("duration"));
				courseObj.setFee(rs.getDouble("fee"));
				courseList.add(courseObj);
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return courseList;
 
	}
	public ArrayList<Graph> getChartData(Connection con) throws SQLException
	{
		ArrayList<Graph> graphData = new ArrayList<Graph>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM my_chart_data");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Graph graphObj = new Graph();
				graphObj.setCatagory(rs.getDate("category").toString());
				graphObj.setValue1(rs.getInt("value1"));
				graphObj.setValue2(rs.getInt("value2"));
				graphData.add(graphObj);
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return graphData;
 
	}
}
