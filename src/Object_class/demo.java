package Object_class;

public class demo extends Object 
{
     public static void main(String[] args)
     {
    	 demo d=new demo();
    	 System.out.println(d.hashCode());
    	 
    	 demo d1=d;
    	 System.out.println(d1.hashCode());
    	 
    	 demo d2=d1;
    	 System.out.println(d2.hashCode());
     }
}
