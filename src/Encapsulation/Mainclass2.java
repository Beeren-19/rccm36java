package Encapsulation;

class Instagram
{
	private String Pwd="s456";

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}
}
public class Mainclass2 {
    public static void main(String[] args)
    {
    	Instagram i=new Instagram();
    	System.out.println(i.getPwd());
    	i.setPwd("sss123");
    	System.out.println(i.getPwd());
    }
    
    
}
