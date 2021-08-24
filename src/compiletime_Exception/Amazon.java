package compiletime_Exception;

class AmazonException extends Exception
{
     String msg;
     AmazonException(String msg)
     {
    	 this.msg=msg;
     }
  public String getmessage()
  {
	  return msg;
  }
}

public class Amazon {
    static void order() throws AmazonException
    {
    	int pamt=4500;
    	if(pamt>=5000)
    	{
    		System.out.println("100rs discount");
    	}
    	else{
    		throw new AmazonException("no discount..");
        	}
    }
    public static void main(String[] args)
    {
    	try
    	{
    		order();
    	}
    	catch(AmazonException e)
    	{
    		System.out.println(e.getmessage());
    	}
    }
}
