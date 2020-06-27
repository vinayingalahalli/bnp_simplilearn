package char_demos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {
	public static void main(String[] args) {
	
		
		try(FileWriter fw=new FileWriter("char.txt",true);
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("hello from char stream");
			bw.newLine();
			bw.write("This line will  be in new line");
			bw.newLine();
			bw.write("You dont have to covert when doing char stream");
			System.out.println("Info written to file successfully");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
