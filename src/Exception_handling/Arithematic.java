package Exception_handling;

public class Arithematic {
      public static void main(String[] args)
      {
    	  System.out.println("***main starts***");
    	  try
    	  {
    	  int i=1/0;
    	  }
    	  catch(ArithmeticException e)
    	  {
    		  System.out.println("handeled..");
    	  }
    	  System.out.println("*** main ends***");
      }
}
