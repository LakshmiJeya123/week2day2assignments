package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
driver.findElement(By.className("open-registration-form-button")).click();
driver.findElement(By.className("firstname")).sendKeys("Nive");
driver.findElement(By.className("lastname")).sendKeys("Jeya");
driver.findElement(By.className("reg_email__")).sendKeys("9566896703");
driver.findElement(By.id("password_step_input")).sendKeys("Varathan2020");

WebElement day = driver.findElement(By.id("day"));

Select drop1=new Select (day);
drop1.selectByIndex(29);

WebElement month = driver.findElement(By.className("birthday_month"));

Select drop2=new Select (month);
drop2.selectByVisibleText("Mar");

WebElement year = driver.findElement(By.className("birthday_year"));

Select drop3=new Select (year);
drop3.selectByValue("1992");

driver.findElement(By.xpath("//input[@value=1]")).click();

}

}
