package selenium_codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_03 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(5000);
		String exp_year="2026";
		String exp_month ="March";
		String exp_date="13";
		
		//year
		while(true)
		{
            WebElement year =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
           String act_year =  year.getText();
          
           
           if(exp_year.equals(act_year))
           {  
        	 break;
           }
           driver.findElement(By.xpath("//span[text()='Next']")).click(); //next  
		}
		//month
		while(true)
		{
           
           
           WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
           String act_month  =	month.getText();
           
           if(exp_month.equals(act_month))
           {  
        	 break;
           }
           driver.findElement(By.xpath("//span[text()='Next']")).click(); //next  
		}
	
		
		//date	
		
		List<WebElement>  dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	int num = 	dates.size();
	System.out.println(num);
	
	for(WebElement days:dates)
	  {
		if(days.getText().equals(exp_date))
		{
			days.click();
			break;
		}
		
	  }
	}

}
