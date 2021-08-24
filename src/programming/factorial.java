package programming;

public class factorial {
     public static void main(String[] args) {
		int no=8;
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
