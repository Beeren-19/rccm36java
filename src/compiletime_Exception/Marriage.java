package compiletime_Exception;

 class MarriageException extends Exception
{
	String msg;
	MarriageException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Marriage {
	 static void submit() throws MarriageException
	 {
		 int age=15;
		 if(age>=21){
			 System.out.println("happy life");
		 }
		 else{
			 throw new MarriageException("invalid age");
		 }
	 }

    public static void main(String[] args) {
    	try{
		 submit();
    	}
    	catch(MarriageException e)
    	{
    		System.out.println(e.getmessage());
    	}
	}
}
