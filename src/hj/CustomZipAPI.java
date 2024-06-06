package hj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CustomZipAPI {
	
	public File sanitize1(File filePath) {
		return filePath;
	}
	
	public String sanitize(String name) {
		return name.strip();
	}
	
	public String anotherSanitize(String name2) {
	    
		return name2.split("1")[0];
	}

	public String sink(String filePath) {
		if (Math.sqrt(4) > 0) {
			throw new RuntimeException("yikes");
		}
		return "";
	}
	
	public String sink2(String filePath) {
		try {
			new FileOutputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return filePath;
	}
	
	public String source() {
		return "dangerous-string";
	}
	
	public String unsafe(String filePath) {
		return filePath;
	}
	
	public String unsafe2(String filePath) {
		return filePath;
	}
	
	public String unmodelled(String filePath) {
		return filePath;
	}
}
