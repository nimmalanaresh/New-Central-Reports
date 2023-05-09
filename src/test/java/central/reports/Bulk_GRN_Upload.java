package central.reports;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.Bulk_GRNpage;

public class Bulk_GRN_Upload {
	
	public WebDriver driver;

	@Test
	public void Grn_Upload() throws Throwable {
		
		 System.getProperty("user.dir");
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Global.properties");
		 Properties prop=new Properties();
		 prop.load(fis);
		
		    driver = new ChromeDriver();
		
		    driver.manage().window().maximize();
		   
	    	driver.get(prop.getProperty("stage_url"));

	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     	
			Bulk_GRNpage g = new Bulk_GRNpage(driver);
			g.login();
			Thread.sleep(5000);
		    driver.get(prop.getProperty("Grn_url"));
		    String actual = driver.getTitle();
		    System.out.println(actual);
		    if(actual.contains("GRN")) {
		    	System.out.println("Grn's list page opened");
		    }
		    else {
		    	System.out.println("Grn's list page not opened");
		    }
		
		    g.Upload_BulkGRN.click();
		   
		    Thread.sleep(3000);
		    Set<String> windowHandles = driver.getWindowHandles();
		    List<String> handlesList = new ArrayList<>(windowHandles);
		    driver.switchTo().window(handlesList.get(1));
		    Thread.sleep(3000);
		    g.Browse_file.sendKeys("D:\\Naresh\\Bulk GRN\\Upload_GRN.csv");
		    g.Submit_BulkGRN.click();
		    
		    String messageText = g.Toast_Message.getText();
		    System.out.println(messageText);
		    
		    

	}
}
