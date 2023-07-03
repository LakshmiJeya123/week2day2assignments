package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.pvrcinemas.com/");
      driver.findElement(By.linkText("Movie Library")).click();
      
      WebElement location = driver.findElement(By.linkText("Search your city"));
      Select place=new Select(location);
      place.selectByVisibleText("Chennai");
      
      WebElement picture = driver.findElement(By.className("genre"));
      Select entertainment=new Select(picture);
      entertainment.selectByVisibleText("ANIMATION");
      
      WebElement audio = driver.findElement(By.name("lang"));
      Select hear=new Select(audio);
      hear.selectByIndex('1');
      
      driver.findElement(By.linkText("Apply")).click();
      driver.findElement(By.linkText("Paw Patrol")).click();
      driver.findElement(By.linkText("Proceed To Book")).click();
      
      WebElement theatre = driver.findElement(By.id("cinemaName"));
      Select mall=new Select(theatre);
      mall.selectByIndex('1');
      
      WebElement time = driver.findElement(By.name("timings"));
      Select show=new Select (time);
      show.selectByIndex('1');
      
      driver.findElement(By.name("noOfTickets")).sendKeys("4");
      driver.findElement(By.name("name")).sendKeys("Nivetha");
      driver.findElement(By.name("email")).sendKeys("nivejeya@gmail.com");
      driver.findElement(By.name("mobile")).sendKeys("8965473231");
      
      WebElement Beverages = driver.findElement(By.name("food"));
      Select snacks=new Select(Beverages);
      snacks.selectByIndex('1');
      
      driver.findElement(By.linkText("Copy To Self")).click();
      driver.findElement(By.linkText("SEND REQUEST")).click();
      driver.findElement(By.linkText("CANCEL")).click();
      driver.findElement(By.linkText("Close this dialog")).click();
      driver.getTitle();
      
      
	}

}
