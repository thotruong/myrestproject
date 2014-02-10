package dto;


public class Graph
{

	private String catagory;
	private int value1;
	private int value2;
 
	public Graph()
	{
		
	}
 
	public Graph(String catagory, int value1, int value2)
	{
		super();
		this.catagory = catagory;
		this.value1 = value1;
		this.value2 = value2;

	}
 
	public String getCatagory()
	{
		return catagory;
	}
 
	public void setCatagory(String catagory)
	{
		this.catagory = catagory;
	}
 
	public int getValue1()
	{
		return value1;
	}
 
	public void setValue1(int value1)
	{
		this.value1 = value1;
	}
	public int getValue2()
	{
		return value2;
	}
 
	public void setValue2(int value2)
	{
		this.value2 = value2;
	}

	@Override
	public String toString()
	{
		return "Graph [value1=" + value1 + ", value2=" + value2 +"]";
	}
 
}