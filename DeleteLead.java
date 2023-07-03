package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElement(By.id("Phone")).click();
		driver.findElement(By.className("phoneNumber")).sendKeys("7894356781");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		driver.findElement(By.xpath("//div[class='x-grid3-cell-inner x-grid3-col-partyId']")).clear();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field']")).sendKeys("10358");
		driver.findElement(By.linkText("Find Leads")).click();

        driver.close();
		


	}

}
