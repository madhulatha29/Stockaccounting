import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;


public class Stockitem_creation {

	
	public static void main(String[] args) {
		 WebDriver Driver=new FirefoxDriver();
	      Driver.get("http://webapp.qedgetech.com");
	      Driver.manage().window().maximize();
	      Driver.findElement(By.id("btnreset")).click();
	      Driver.findElement(By.id("username")).sendKeys("admin");
	      Driver.findElement(By.name("password")).sendKeys("master");
	     
	      Driver.findElement(By.id("btnsubmit")).click();
	      
	      Driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
	      Sleeper.sleepTightInSeconds(3);
	      
	      Driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	      
	      Sleeper.sleepTightInSeconds(3);
	      Select a=new Select(Driver.findElement(By.id("x_Category")));
	      a.selectByVisibleText("Pens");
	      Sleeper.sleepTightInSeconds(3);
	      Select b=new Select(Driver.findElement(By.id("x_Supplier_Number")));
	      b.selectByVisibleText("Madhu");
	      Sleeper.sleepTightInSeconds(3);
	      
	      Driver.findElement(By.id("x_Stock_Name")).sendKeys("Reynolds");
	      Sleeper.sleepTightInSeconds(3);
	      
	      Select c=new Select(Driver.findElement(By.id("x_Unit_Of_Measurement")));
	      c.selectByVisibleText("Description");
	      
	      Driver.findElement(By.id("x_Purchasing_Price")).sendKeys("40");
	      Driver.findElement(By.id("x_Selling_Price")).sendKeys("50");
	      Driver.findElement(By.id("x_Notes")).sendKeys("Good to use");
	      Sleeper.sleepTightInSeconds(3);
	      
	      Driver.findElement(By.id("btnAction")).click();
	      
	      Sleeper.sleepTightInSeconds(3);
		     Driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		     Sleeper.sleepTightInSeconds(3);
		     Driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	      
	      
	      
	      
	      
	}

}
