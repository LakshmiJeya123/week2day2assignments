package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
		driver.findElement(By.xpath("//a[@aria-controls='pills-home']")).click();
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.id("source")).click();

		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.id("destination")).click();
		
		WebElement date = driver.findElement(By.id("datepicker1"));
		
		Select Calender=new Select (date);
		Calender.selectByValue("4");
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//p[text()='AC Sleeper (2 + 1)']")).getText();
		driver.findElement(By.id("Bustypes4")).click();
		driver.findElement(By.linkText("20 Seats Available")).getText();
		driver.findElement(By.linkText("Select Seat")).click();
		driver.findElement(By.xpath("//div[@class='seats']//a")).click();
		driver.findElement(By.id("seatnos")).sendKeys("SL5");
		driver.findElement(By.id("ticketfare")).sendKeys("1059.00");
		
		WebElement source = driver.findElement(By.id("boardingpoint_id"));
		Select pickup=new Select(source);
		pickup.selectByVisibleText("Karapakkam-21:21");
		
		WebElement destination = driver.findElement(By.id("droppingpoint_id"));
		Select drop=new Select(destination);
		drop.selectByVisibleText("KR-puram-05:52");
		
		driver.getTitle();
		driver.close();
		
		
	}

}
