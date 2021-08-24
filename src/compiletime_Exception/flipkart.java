package compiletime_Exception;

class FlipkartException extends Exception
{
	String msg;
	FlipkartException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class flipkart {
      static void coins() throws FlipkartException
      {
    	  int amount=1000;
    	  if(1000>=1500)
    	  {
    		  System.out.println(" gets super coins");
    	  }
    	  else
    	  {
    		  throw new FlipkartException("no super coins");
    	  }
      }
      public static void main(String[] args) {
		try{
    	  coins();
		}
		catch(FlipkartException e){
			System.out.println(e.getmessage());
		}
	}
}
