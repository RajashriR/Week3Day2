package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//selecting men
		driver.findElementByXPath("//a[text() = 'MEN']").click();
        //typing in the search button
		WebElement select= driver.findElementByXPath("//input[@name = 'searchVal']");
		select.sendKeys("Bags",Keys.ENTER);
				//select.click();
		driver.findElementByXPath("//label[@for ='Men']").click();
		Thread.sleep(500);
		driver.findElementByXPath("//label[contains(text(),'Fashion Bags')]").click();
		Thread.sleep(1000);
		WebElement len = driver.findElementByXPath("//div[@class='length']");
		String str = len.getText();
		System.out.println("Number of items : " +str);
	
		List<WebElement> list= driver.findElements(By.xpath("//div[@class = 'brand']"));
		System.out.println("SIZE OF THE LIST : " + list.size());
		System.out.println("BRAND NAME OF BAGS");
		System.out.println("********************");
		for(WebElement brandname :list)
		{
			String name =brandname.getText();
			System.out.println(name);
						
		}
		List<WebElement> list2 = driver.findElementsByXPath("//div[@class='name']");
		System.out.println("NAME OF THE BAGS");
		System.out.println("********************");
		for (WebElement bagname : list2) {

			String name1 = bagname.getText();
			
			System.out.println(name1);
		
		
	}

}
}
