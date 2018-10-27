package webdriverpackage1;



import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_32LSmx']"));
		//driver.findElement(By.xpath("//span[text()='New to Flipkart? Sign up']")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("1109234560");
		//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//above code is working but its asking for valid phone number.
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Thread.sleep(3000);
		WebElement electronics = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
		WebElement mobile = driver.findElement(By.xpath("(//a[@title='Samsung'])[1]"));
		Actions action=new	Actions(driver);
		action.moveToElement(electronics).perform();
		Thread.sleep(3000);
		action.moveToElement(mobile).perform();
		Thread.sleep(2000);
		action.click(mobile).perform();
		Thread.sleep(5000);
		
		WebElement samsung = driver.findElement(By.xpath("(//a[@title='Samsung Galaxy A6 (Blue, 64 GB)'])[1]"));
		
		
		//WebElement price = driver.findElement(By.xpath("(//div[@class='_2rQIn7')[5]"));
		//dynamic xpath=(//h2[@class='Ul-VjD']/../../div/div[@class='_2rQIn7'])[5](in flipkart to click view all)
		Actions act1=new Actions(driver);
		act1.moveToElement(samsung).perform();
		act1.contextClick(samsung).perform();
		act1.sendKeys("W").perform();
		
		Set<String> allwindows = driver.getWindowHandles();
		Iterator <String> win=allwindows.iterator();
		
		String main=win.next();
		String sub=win.next();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(sub);
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		act2.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(5000);
		
		   List<WebElement> allelements = driver.findElements(By.xpath("(//li[@class='_4f8Q22 _2y_FdK'])"));
		 
		int si = allelements.size();
		 WebElement element = null;
		 for(int i=1; i<=si;i++) {
			  element = allelements.get(i);
			  Thread.sleep(5000);
				 Actions Act3=new Actions(driver);
				 Act3.moveToElement(element).perform();
			 	 
		 }
		 
		 //Thread.sleep(3000);
		 //WebElement front = driver.findElement(By.xpath("//h1[@class='_9E25nV']"));
		 //String St = front.getText();
		 //System.out.println(St);
		  
		  
		 driver.findElement(By.xpath("//form[@class='EJrIpC']")).click();
		 driver.findElement(By.xpath("//form[@class='EJrIpC']")).sendKeys("560066");
		 driver.findElement(By.xpath("//span[@class='_2aK_gu']")).click();
		 
		  
		
			}

}
