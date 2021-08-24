package collectiontopic;

import java.util.ArrayList;

public class sample9 {
   public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add("vegpalav");
	l1.add("jamon");
	l1.add("pongal");
	l1.add("gobi");
	
	System.out.println(l1);
	if(l1.contains("gobi"))
	{
		System.out.println("it is present");
	}
	else{
		System.out.println("it is not present");
	}
	
	
}
}
