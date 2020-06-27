package char_demos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadCharDemo {

	public static void main(String[] args) {
		
		try(FileReader fr=new FileReader("char.txt");
				BufferedReader br=new BufferedReader(fr);
				){
			System.out.println("Reading info from file");
			String s="";
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
