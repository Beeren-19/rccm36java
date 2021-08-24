package Abstraction;

interface Recharge{
	void pay();
}

class phonebill implements Recharge
{
	public void pay()
	{
		System.out.println("pay phonebill");
	}
}
class electricitybill implements Recharge
{
	public void pay()
	{
		System.out.println("pay electricitybill");
	}
}
class DTH implements Recharge
{
	public void pay()
	{
	System.out.println("pay DTH");
    }
}
class phonepay 
{
static void using(Recharge R)
{
	R.pay();
}
}
public class Mainclass1{
public	static void main(String[] args)
	{
		phonebill p=new phonebill();
		electricitybill e=new electricitybill();
		DTH d=new DTH();
		
		phonepay.using(p);
		phonepay.using(e);
		phonepay.using(d);
	}

}
