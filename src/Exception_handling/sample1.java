package Exception_handling;

public class sample1 {
     public static void main(String[] args)
     {
    	 System.out.println("***Ms***");
    	 try
    	 {
    	 int i=1/0;
    	 System.out.println("hai");
    	 }
    	 catch(ArithmeticException e)
    	 {
    		 System.out.println("handled..");
    	 }
    	 System.out.println("***ME***");
     }
}
