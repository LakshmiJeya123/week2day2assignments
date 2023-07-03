package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");

driver.findElement(By.className("USERNAME")).sendKeys("demosalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.id("login")).click();
driver.findElement(By.partialLinkText("CRM")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.className("firstName")).sendKeys("Priya");
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Priyanka")).click();

System.out.println(driver.getTitle());

driver.findElement(By.xpath("//a[text()=Edit")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Accenture");
driver.findElement(By.xpath("//input[@value='Update']")).click();
driver.close();

	}

}

