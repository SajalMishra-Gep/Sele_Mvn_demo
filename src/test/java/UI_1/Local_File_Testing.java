package UI_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Local_File_Testing {
	static LocatorManager LM =new LocatorManager();
	public static void main(String[] args) throws InterruptedException, IOException {
		
		// TODO Auto-generated method stub
		ChromeDriver dr=new ChromeDriver();
		dr.get("C:\\Users\\HP\\Desktop\\2026-27_Odd Sem\\BCA\\BCA-A-11-09-2026.html");
		Thread.sleep(1000);
		dr.findElement(By.xpath(LM.getXpath("Sajal"))).click();
		System.out.println(LM.getXpath("sajal"));
		
		LM.list();
		
		Properties pr = new Properties();
		FileInputStream fs=new FileInputStream("D:\\d drive\\ABESIT_Testing\\DevOps_AIIT_5thSem\\Xpath.properties");
		pr.load(fs);
		System.out.println(pr.getProperty("Sajal"));
	
		
	}

}
