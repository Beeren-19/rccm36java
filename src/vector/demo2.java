package vector;

import java.util.Vector;

public class demo2 {
    public static void main(String[] args) {
		Vector l1=new Vector(3);
		System.out.println(l1.capacity());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1.capacity());
	}
}
