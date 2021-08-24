package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class demo6 {
     public static void main(String[] args)throws Exception {
		File f1=new File("D:\\rccm36filehandling\\rccm36.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		String s1=br.readLine();
		while(s1!=null)
		{
			System.out.println(s1);
			s1=br.readLine();
		}
	}
}
