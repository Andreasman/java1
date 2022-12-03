package net.staecker.javalernen;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoNFileIO {

	public static void main(String[] args) {
		Path path = Paths.get("E:\\90_TEMP\\testfotos\\DSCN3382.JPG");
		File file = path.toFile();
		System.out.println("File.length: " + file.length() + " Byte");
		
		System.out.println(path.getFileName());
		System.out.println(path.getFileSystem());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.isAbsolute());
	}

}
