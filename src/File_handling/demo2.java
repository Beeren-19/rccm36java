package File_handling;

import java.io.File;
import java.io.IOException;

public class demo2 {
   public static void main(String[] args) throws IOException {
	 File f1=new File ("D:\\rccm36filehandling\\rccm36.txt");
	 
	 if(f1.createNewFile())
	 {
		 System.out.println("file is created");
	 }
	 else{
		 System.out.println("file is not created");
	 }
	 
}
}
