package Encapsulation;

class Facebook
{
	private String pwd="bee123";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}

public class mainclass1 {
     public static void main(String[] args)
     {
    	 Facebook f=new Facebook();
    	 System.out.println(f.getPwd());
    	 f.setPwd("Beer456");
    	 System.out.println(f.getPwd());
     }
     
}
