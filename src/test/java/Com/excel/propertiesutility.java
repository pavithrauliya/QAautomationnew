package Com.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesutility {

	public static String getData(String Key) throws IOException {
		//file
		File file= new File("C:\\Users\\PU64320\\Documents\\TestData.properties");
		//reader
		FileReader reader= new FileReader(file);
		//properties
		Properties prop=new Properties();
		//loader
		prop.load(reader);
		//get value
		return (String)prop.getProperty(Key);
	}
}
