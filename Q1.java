import java.util.*;
import java.lang.*;

public class Q1
{
	public int a,b,sum;
	static
	{
		System.out.println("Program for Addition");
	}
	void add(int a,int b)
	{
		sum=a+b;
		System.out.println("Sum is: "+sum);
		}
	public static void main(String args[])
	{
		Q1 obj=new Q1();
		obj.add(5,10);
	}
}