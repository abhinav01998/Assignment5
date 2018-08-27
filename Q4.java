abstract class Vehicle
{
	abstract void start();
	void stop()
	{
		System.out.println("Vehicle stopped");
	}
}
class twowheeler extends Vehicle
{
	void start()
	{
		System.out.println("Two wheeler started!");
	}
	void stop()
	{
		System.out.println("Two wheeler stopped!");
	}
}
class fourwheeler extends Vehicle
{
	void start()
	{
		System.out.println("Four wheeler started!");
	}
	void stop()
	{
		System.out.println("Four wheeler stopped!");
	}
}

public class Q4
{
	public static void main(String args[])
	{
		twowheeler t1=new twowheeler();
		fourwheeler f1=new fourwheeler();
		t1.start();
		t1.stop();
		f1.start();
		f1.stop();
	}
}