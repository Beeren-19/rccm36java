package Encapsulation;

class syndicate
{
	private int amount=20000;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
public class Mainclass4 {
   public static void main(String[] args)
   {
	   syndicate s=new syndicate();
	   System.out.println(s.getAmount());
	   s.setAmount(50000);
	   System.out.println(s.getAmount());
   }
}
