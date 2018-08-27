import java.util.*;
import java.lang.*;
abstract class Animal
{
	String breed,colour;
	Animal(String a,String b)
	{
       breed=a;
	   colour=b;
	}
	abstract void speak();
}
class Dog extends Animal
{
	Dog(String a,String b)
	{
		super(a,b);
	}
	void speak()
	{
		System.out.println("Dog barks!");
	}
}
class Cat extends Animal
{
	Cat(String a,String b)
	{
		super(a,b);
	}
	void speak()
	{
		System.out.println("Cat meows!");
	}
}
public class Q2
{
  public static void main(String args[])
  {
	 Dog D1=new Dog("Pitbull","White");
     Cat C1=new Cat("Persian","White");
     D1.speak();
     C1.speak();	 
  }
}