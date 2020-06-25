package eg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileOperations {

	
	public void openFile(String fileName) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(fileName);
	}
}
