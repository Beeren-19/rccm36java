package polymorphism;

public class sample1 {
          public static void main(String[] args) {
			nike n=new nike();
			puma p=new puma();
			Addidas a=new Addidas();
			
			show.purchase(n);
			show.purchase(p);
			show.purchase(a);
		}
}
class Brand{
	void Style()
	{
		System.out.println("with symbol");
		
	}
}
 class nike extends Brand{
	 void Style()
	 {
		 System.out.println("with nike symbol");
	 }
 }
   class puma extends Brand{
	   void Style()
	   {
		   System.out.println("with puma symbol");
	   }
   }
     class Addidas extends Brand{
    	 void Style()
    	 {
    	 System.out.println("with Addidas symbol");
    	 
          }
     }
        class show{
        	static void purchase(Brand B)
        	{
        	B.Style();
        }
        }