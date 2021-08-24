package polymorphism;

class whatsapp{
	static void send(int no)
	{
		System.out.println("send through no "+8);
	}
	static void send(String textmsg)
	{
		System.out.println("send through txt msg "+"hai");
	}
	static void send(int no,String textmsg)
	{
		System.out.println("send through no and txt msg "+ 8 + " hai");	
	}
	static void send(String textmsg,int no)
	{
		System.out.println("send through txt msg and no "+"hai "+ 8);
	}
}
public class mainclass2 {
	public static void main(String[] args)
	{
		whatsapp.send(8);
		whatsapp.send("hai");
		whatsapp.send(8,"hai");
		whatsapp.send("hai",8);
		
		
	}

}
