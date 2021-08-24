package Abstraction;

interface Brand
{
	void ride();
}
class lambo implements Brand
{
	public void ride()
	{
		System.out.println("riding lambo");
	}
}
class audi implements Brand
{
	public void ride()
	{
		System.out.println("riding audi");
	}
}
class BMW implements Brand
{
	public void ride()
	{
	System.out.println("riding BMW");
    }
}
class car
{
	static void order(Brand B)
	{
	B.ride();	
	}
}
public class Mainclass 
{
public static void main(String[] args)
{
	lambo l=new lambo();
	audi a=new audi();
	BMW B1=new BMW();
	
	car.order(l);
	car.order(a);
	car.order(B1);
}
}
