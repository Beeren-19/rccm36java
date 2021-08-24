 package Exception_handling;

public class sample4 {
       public static void main(String[] args)
       {
    	   System.out.println("***MS***");
    	   try
    	   {
    		   int i=1/0;
    	   }
    	   catch(ArithmeticException e)
    	   {
    		   System.out.println("handled..");
           }
    	   finally
    	   {
    		   System.out.println("database got closed");
    	   }
    	  System.out.println("***ME***");
       }
}
