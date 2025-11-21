package selenium_codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker_02 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//input DOB
		String requiredYear = "2030";
		String requiredMonth="Jan";
		String requiredDate ="13";
		
		Thread.sleep(5000);
          driver.findElement(By.xpath("//input[@id='txtDate']")).click();
          
          WebElement year    =  driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//select[2]"));
          Select s1 = new Select(year);
         s1.selectByValue("2030");
          
          WebElement month  = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//select[1]"));
          Select s2 = new Select(month);
          s2.selectByVisibleText("Jan");
          
         List<WebElement> date =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
      for( WebElement day: date)
      {
    	  if(day.getText().equals(requiredDate))
    	  {
    		  day.click();
    		  break;
    	  }
    	  
      }
	}

}
