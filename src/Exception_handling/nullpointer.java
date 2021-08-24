package Exception_handling;

public class nullpointer {
      public static void main(String[] args)
      {
    	  System.out.println("***main starts***");
    	  
    	  nullpointer n1=null;
    	  try
    	  {
    	  System.out.println(n1.hashCode());
    	  }
    	  catch(NullPointerException e)
    	  {
    		  System.out.println("handeled");
    	  }
    	  
    	  System.out.println("***main ends***");
      }
}
