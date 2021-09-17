package ClassDemo;

import java.util.Scanner;

public class A {
	
	public static void main(String args[])
	{
		System.out.println("This is the output of static values of Student");
		//here we have provided static value for printing details of students...
		B bObj1=new B();
		bObj1.print();
		
		//pass some dynamic value to print 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student name: ");
		String name=sc.nextLine();
		System.out.print("Enter Student Rollno:");
		int rollno=sc.nextInt();
		B bObj2=new B(name,rollno);
		System.out.println("This is the output of dynamic values of Student");
		bObj2.print();
		
		//add two no by providing static value and values are 25 and 65
		System.out.println("This is the addition of two static values");
		B bObj3 =new B();
		System.out.println("addition of two values 25 and 65 is :"+bObj3.add());
		
		
		//add two no. by providing dynamic values
		System.out.print("Enter value1 for addition: ");
		int value1=sc.nextInt();
		System.out.print("Enter value2 for addition: ");
		int value2=sc.nextInt();
		B bObj4=new B(value1,value2);
		System.out.println("This is the addition of two dyanmic values");
		System.out.print("addition of above entered values is  :"+bObj4.add());
		
	}

}
