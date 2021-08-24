package compiletime_Exception;

class OlaException extends Exception
{
	String msg;
	OlaException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Ola {
     static void ride() throws OlaException
     {
    	 int amt=1000;
    	 if(1000>=1500)
    	 {
    		 System.out.println("get 20% discount");
    	 }
    	 else {
    		 throw new OlaException("no discount");
    	 }
     }
     public static void main(String[] args) {
		try{
			ride();
		}
		catch(OlaException e)
		{
			System.out.println(e.getmessage());
		}
	}
}
