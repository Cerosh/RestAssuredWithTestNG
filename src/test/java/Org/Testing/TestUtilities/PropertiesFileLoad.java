package Org.Testing.TestUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {
	public static Properties PropFileLoad(String path) throws IOException {
		File file = new File(path);
		FileInputStream fi = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fi);
		return prop;
	}

}
