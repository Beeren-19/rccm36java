package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo7 {
     public static void main(String[] args) throws IOException {
		File f1=new File("D:\\rccm36filehandling\\rccm36.txt");
		FileWriter fw=new FileWriter(f1,true);
		BufferedWriter bw=new BufferedWriter(fw);
		String[] arr={"java","mava","jobaa","girlaa"};
		
		for(int i=0; i<arr.length;i++)
		{
			bw.write(arr[i]);
			bw.newLine();
		}
		bw.flush();
		System.out.println("data is written..");
	}
}
