package UI_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Search_Feature_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.youtube.com");
		dr.navigate().refresh();
		dr.navigate().back();
		dr.navigate().forward();
		dr.findElement(By.xpath("/html/body/ytd-pp/div[1a]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/div/div/form/input")).sendKeys("Laalpari");
		dr.findElement(By.xpath("/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/div/button/span/span/div")).click()
;
	
		//dr.quit();
		

	}

}
