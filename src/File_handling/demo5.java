package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo5 {
    public static void main(String[] args) throws IOException {
		File f1=new File("D:\\rccm36filehandling\\rccm36.txt");
		FileWriter fw=new FileWriter(f1,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hahaha");
		bw.newLine();
		bw.write("java");
		bw.flush();
		System.out.println("data is written");
	}
}
