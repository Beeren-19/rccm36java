package Exception_handling;

public class sample6 {
      public static void main(String[] args)
      {
    	  System.out.println("***MS***");
    	  try {
    		  int i=1/0;
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println("handled..");
    	  }
    	  System.out.println("***ME***");
      }
      
}
