package Abstraction;

interface chocalate
{
	void choco();
}
class dairy_milk implements chocalate
{
	public void choco()
	{
		System.out.println("have dairymilk");
	}
}
class temptation implements chocalate
{
	public void choco()
	{
		System.out.println("have temptation");
	}
}
class kitkat implements chocalate
{
	public void choco()
	{
		System.out.println("have kitkat");
	}
}
class taste
{
	static void eat(chocalate c)
	{
		c.choco();
	}
}
public class Mainclass4 {
public static void main(String[] args)
{
	dairy_milk d=new dairy_milk();
	temptation t=new temptation();
	kitkat k=new kitkat();
	
	taste.eat(d);
	taste.eat(t);
	taste.eat(k);
}

}
