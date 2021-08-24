package compiletime_Exception;

class PhonepayException extends Exception
{
	String msg;
	PhonepayException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class phonepay {
      static void pay() throws PhonepayException
      {
    	  int amount=250;
    	  if(250>=500)
    	  {
    		  System.out.println("get scratch card");
    	  }
    	  else{
    		  throw new PhonepayException("no scratch card");
    	  }
      }
      public static void main(String[] args) {
		try
		{
			pay();
		}
		catch(PhonepayException e)
		{
			System.out.println(e.getmessage());
		}
	}
}

