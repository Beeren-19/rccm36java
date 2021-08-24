package vector;

import java.util.Vector;
import java.util.ArrayList;
public class demo1 {
     public static void main(String[] args) {
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add('A');
		l1.add(40.25);
		l1.add(null);
		l1.add(10);
		
		for(int i=0;i<l1.size();i++)
		{
			Object o1=l1.get(i);
			System.out.println(o1);
		}
	}
}
