package Exception_handling;

public class sample3 {
       public static void main(String[] args)
       {
    	   System.out.println("***MS***");
    	   
    	   try
    	   {
    	   int i=1/2;
    	
    	   int[] arr={10,20,30,40};
    	       try{
    	        System.out.println(arr[7]);
    	       }
    	       catch(ArrayIndexOutOfBoundsException e)
    	       {
    		   System.out.println("caught..");
    	       }
    	   }
    	   catch(ArithmeticException e)
    	   {
    		   System.out.println("handled..");
    	   }
    	   System.out.println("***ME***");       
      }
}