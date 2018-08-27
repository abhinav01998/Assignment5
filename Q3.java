class overloaded
{
	void print()
	{
		System.out.println("Print function with Null argument");
	}
	void print(int a)
	{
		System.out.println("Print function with Integer value "+a);
	}
	void print(float b)
	{
		System.out.println("Print function with Float value "+b);
	}
}

public class Q3
{
	public static void main(String args[])
	{
		int a;
		float b;
		overloaded ov=new overloaded();
		a=15;
		b=10.1f;
		ov.print();
		ov.print(a);
		ov.print(b);
	}
}