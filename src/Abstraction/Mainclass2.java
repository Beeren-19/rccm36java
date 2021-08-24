package Abstraction;

interface Bike
{
	void ride();
}
class Activa implements Bike
{
	public void ride()
	{
		System.out.println("riding Activa bike");
	}
}
class Royal implements Bike
{
	public void ride()
	{
		System.out.println("riding Royal bike");
	}
}
class Pulser implements Bike
{
	public void ride()
	{
	System.out.println("riding Pulser bike");
    }
}
class type
{
	static void order(Bike B)
	{
		B.ride();
	}
}
public class Mainclass2 {
public static void main(String[] args){
	Activa a=new Activa();
	Royal R=new Royal();
	Pulser P=new Pulser();
	
	type.order(a);
	type.order(R);
	type.order(P);
	
}
}
