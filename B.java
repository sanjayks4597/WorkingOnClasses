package ClassDemo;

public class B {

	private String name="sanjay";
	private int rollno=25;
	private int value1=25;
	private int value2=65;
	B()
	{
		
	}
	
    B(String name,int rollno)
    {
    	this.name=name;
    	this.rollno=rollno;
    }
    B(int value1,int value2)
    {
    	this.value1=value1;
    	this.value2=value2;
    	
    }
	
	public void print()
	{
		System.out.println("Name of Student is: "+name);
		System.out.println("Rollno of Student is: "+rollno);
		}
	
	public int add()
	{
		return value1+value2;
	}
	
}
