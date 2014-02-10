package dto;
 
public class Apache
{
private int id;
private String date;
private String hostname;
private String userid;
private int port;
private String ip;
 
	public Apache()
	{
		
	}
 
	public Apache(int id, String date,String userid, String hostname,int port, String ip)
	{
		super();
		this.id = id;
		this.date = date;
		this.userid = userid;
		this.port = port;
		this.hostname = hostname;
		this.ip =ip;

	}
 
	public int getId()
	{
		return id;
	}
 
	public void setId(int id)
	{	
		this.id = id;
	}
 
	public String getDate()
	{
		return date;
	}
 
	public void setDate(String date)
	{
		this.date = date;
	}
 
	public String getUserId()
	{
		return userid;
	}
 
	public void setUserId(String userid)
	{
		this.userid = userid;
	}
 
	public int getPort()
	{
		return port;
	}
 
	public void setPort(int port)
	{
		this.port = port;
	}

	public String getIP()
	{
		return ip;
	}
 
	public void setIP(String ip)
	{
		this.ip = ip;
	}
	@Override
		public String toString()
	{
		return "Course [id=" + id + ", date=" + date + ", userid=" + userid
				+ ", hostname=" + hostname + "]";
	}
 
}