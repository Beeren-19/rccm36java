package collectiontopic;

import java.util.ArrayList;

public class sample11 {
       public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		ArrayList l2=new ArrayList(l1);
		l2.add('A');
		l2.add('B');
		l2.add('c');
		
		System.out.println(l2);
	}
}
