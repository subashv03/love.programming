package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vijay");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Subbu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I love programming");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subashv@gmail.com");
		WebElement elementDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(elementDropDown);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suresh");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());

	}

}
