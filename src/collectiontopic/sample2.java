package collectiontopic;

import java.util.ArrayList;

public class sample2 {
  public static void main(String[] args) {
	  ArrayList l1=new ArrayList();
	  l1.add(10);
	  l1.add(20.56);
	  l1.add('A');
	  l1.add("hello");
	  l1.add(20);
	  System.out.println(l1);
	  
	  //adding elements into the particular index
	  l1.add(2,true);
	  System.out.println(l1);
	  
	  
}
}
