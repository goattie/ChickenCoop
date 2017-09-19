package fileReader;

import java.io.File;

public class FileReader {
	
	public File getFile(String filePath) {
		File retrievedFile = new File(filePath);
		return retrievedFile;		
	}

}
