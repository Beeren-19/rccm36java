package compiletime_Exception;

class swiggyException extends Exception
{
	String msg;
	swiggyException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}

public class swiggy {
     static void order() throws swiggyException
     {
    	 int amount=1200;
    	 if(1200>=1500)
    	 {
    		 System.out.println("get 10% discount");
    	 }
    	 else{
    		 throw new swiggyException("no discount");
    	 }
     }
     public static void main(String[] args) {
		try{
			order();
		}
		catch(swiggyException e)
		{
			System.out.println(e.getmessage());
		}
	}
}
