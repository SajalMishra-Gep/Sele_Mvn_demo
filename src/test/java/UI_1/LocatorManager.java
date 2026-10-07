package UI_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocatorManager {

	static Properties pr=new Properties();
	static{
		
	try{
			FileInputStream fis=new FileInputStream("D:\\d drive\\ABESIT_Testing\\DevOps_AIIT_5thSem\\src\\locators.properties");
			pr.load(fis);
			fis.close();
	}
	catch(IOException e)
	{
		e.getStackTrace();
		throw new RuntimeException("FIle not found and thats why xpath unable to load");
	}
	}
	public static void list(){
		System.out.println();
		pr.list(System.out);
	}
	public static String getXpath(String key) {
		return pr.getProperty(key);

	}

}
