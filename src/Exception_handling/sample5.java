package Exception_handling;

public class sample5 {
      public static void main(String[] args){
    	  System.out.println("***MS***");
    	  
    	  try
    	  {
    		  int i=10/2;
    		  System.out.println("the number is "+i);
           }
    	  finally
    	  {
    		  System.out.println("database got placed");
    	  }
    	  System.out.println("***ME***");
      }
}
