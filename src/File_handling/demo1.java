package File_handling;

import java.io.File;

public class demo1 {
     public static void main(String[] args) {
		File f1=new File("D:\\rccm36filehandling");
		if(f1.mkdirs())
		{
			System.out.println("folder is created");
		}
		else{
			System.out.println("folder is not created");
		}
		if(f1.exists())
		{
			System.out.println("folder exists");
		}
		else{
			System.out.println("folder doesnt exists");
		}
	
     }
}
