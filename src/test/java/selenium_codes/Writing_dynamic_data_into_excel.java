package selenium_codes;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Writing_dynamic_data_into_excel 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);	
	     
	 WebElement text =  driver.findElement(By.xpath("//textarea[@name='text1']"));	
	 Thread.sleep(5000);
	 text.sendKeys("Sending data to perfrom keyboard actions......");
	 Actions Act = new Actions(driver);
	 Act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL);
	 
	 Act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL);
	 
	 Act.keyDown(Keys.TAB).keyUp(Keys.TAB);
	 
	 Act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL);
	 Thread.sleep(5000);
	    WebElement textbox2 =  driver.findElement(By.xpath("//textarea[@id='inputText2']"));
         String textcontent =	 textbox2.getText();
         System.out.println(textcontent);
	 //Thread.sleep(5000);
	 
	 //driver.close();

      }
}