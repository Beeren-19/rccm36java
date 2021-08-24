package File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo4 {
    public static void main(String[] args) throws Exception {
		File f1=new File("D:\\rccm36filehandling\\rccm36.txt");
		FileReader fr=new FileReader(f1);
		char[] arr=new char[(int) f1.length()];
		fr.read(arr);
		
		//coverting from arry to string
		String s1=new String(arr);
		System.out.println(s1);
	}
}
