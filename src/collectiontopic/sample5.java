package collectiontopic;

import java.util.ArrayList;

public class sample5 {
     public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("banglore");
		l1.add("goa");
		l1.add("mandya");
		l1.add("ballery");
		System.out.println("***before***");
		System.out.println(l1);
		
		l1.remove("goa");
		
		System.out.println("***after***");
		System.out.println(l1);
		
		l1.remove(1);
		
		System.out.println("***after***");
		System.out.println(l1);
	}
}
