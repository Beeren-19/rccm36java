package Encapsulation;

class Gmail
{
	private String Pwd="g5648";

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}
}
public class Mainclass5 {
     public static void main(String[] args)
     {
        Gmail g=new Gmail();
        System.out.println(g.getPwd());
        g.setPwd("k123");
        System.out.println(g.getPwd());
     }
}
