package collectiontopic;

import java.util.ArrayList;

public class sample4 {
   public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	
	ArrayList l2=new ArrayList();
	l2.add('A');
	l2.add('B');
	l2.add('C');
	
	System.out.println("****b4****");
	System.out.println("l1---> "+ l1);
	System.out.println("l2--> "+ l2);
	
	//copy all the elements of l2 to l1 in the particular index
	l1.add(1,l2);
	
    System.out.println("***a4***");
    System.out.println("l1---> "+ l1);
    System.out.println("l2--> "+ l2);
}
}
