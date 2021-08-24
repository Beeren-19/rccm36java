package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
    	
		File f1=new File("D:\\rccm36filehandling\\rccm36.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("hello");
		fw.flush();
		System.out.println("data is written");
	}
}
