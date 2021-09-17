package ClassDemo;

import java.util.Scanner;

public class TypeCasting {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter integer value for type casting into float :");
		int value=sc.nextInt();
		
		TypeCasting t1=new TypeCasting();
		t1.typeCastIntoFloat(value);
		
		System.out.print("Enter float value for type casting into integer :");
		float value2=sc.nextFloat();
		
		TypeCasting t2=new TypeCasting();
		t2.typeCastIntoInt(value2);
		
		System.out.print("Enter char value for type casting into integer(a-f and A-F) :");
		char value3=sc.next().charAt(0);
		
		TypeCasting t3=new TypeCasting();
		t3.CharIntoInto(value3);
		
		
		
	}
	public void CharIntoInto(char val) {
		int ch=(int)val;
		System.out.println("Integer value for above given character is:"+ch);
	}
	public void typeCastIntoInt(float f2) {
		int i=(int)f2;
		System.out.println("Float value is :"+i);
	}
	
	public void typeCastIntoFloat(int val)
	{
		float f1=val;
		System.out.println("Int value is :"+f1);
	}

}
