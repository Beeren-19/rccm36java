package Encapsulation;

class SBI
{
	private int Pwd=5897;

	public int getPwd() {
		return Pwd;
	}

	public void setPwd(int pwd) {
		Pwd = pwd;
	}
}
public class Mainclass3 {
    public static void main(String[] args)
    {
    	SBI s=new SBI();
    	System.out.println(s.getPwd());
    	s.setPwd(9785);
    	System.out.println(s.getPwd());
    }
}
