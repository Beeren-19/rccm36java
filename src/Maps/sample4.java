package Maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class sample4 {
   public static void main(String[] args) {
	   LinkedHashMap<String, Integer> l1=new LinkedHashMap<String,Integer>();
			l1.put("nikitha", 1254);
			l1.put("priya", 5784);
			l1.put("venu", 123);
			l1.put("vani", 1545);
			l1.put("priya", 342);
			l1.put("raju", 1254);
			for(Entry<String, Integer> a1:l1.entrySet())
				{
				System.out.println(a1.getKey()+" "+a1.getValue());
			}
}
}
