package Abstraction;

interface Amazon
{
	void shop();
}
class electronics implements Amazon
{
	public void shop()
	{
		System.out.println("buy electronics goods");
	}
}
class mobiles implements Amazon
{
	public void shop()
	{
		System.out.println("buy mobiles");
	}
}
class shoes implements Amazon
{
	public void shop()
	{
		System.out.println("buy shoes");
	}
}
class shopping_app
{
	static void order(Amazon A)
	{
	A.shop();
	}
}
public class Mainclass3 {
public static void main(String[] args)
{
	electronics e=new electronics();
	mobiles m=new mobiles();
	shoes s=new shoes();
	
	shopping_app.order(e);
	shopping_app.order(m);
	shopping_app.order(s);
	
	
}
}
