package SeleniumDay3_SelectclassDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethod{
	
	public static void main(String[] arge) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Selenium/OfflineWebsite/pages/examples/add_user.html");
		Thread.sleep(5000);
		WebElement textBoxUsername = driver.findElement(By.xpath("//input[@id='username']"));
		textBoxUsername.sendKeys("Akshata");
		Thread.sleep(5000);
		textBoxUsername.clear();
		Thread.sleep(5000);
		textBoxUsername.sendKeys("Ankita");
		Thread.sleep(5000);
		
		String  attribute = textBoxUsername.getAttribute("placeholder");
		System.out.println("Value of placeholder attribute is :"+attribute);
		
		String tagname = textBoxUsername.getTagName();
		System.out.println("Value of tagname is :"+tagname);
		
		WebElement textBoxMobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		System.out.println(textBoxMobile.isDisplayed());
		
		if(textBoxMobile.isDisplayed()) {
		   textBoxMobile.sendKeys("9033761269");
		}
		Thread.sleep(5000);
		
		WebElement textBoxEmail = driver.findElement(By.xpath("//input[@id='email']"));
		
		if(textBoxEmail.isEnabled()) {
			textBoxEmail.sendKeys("Akshata@gamil.com");
		}
		Thread.sleep(5000);
		
        WebElement redioButtonGenderFemale = driver.findElement(By.xpath("//input[@id='Female']"));
		
		if(redioButtonGenderFemale.isSelected()) {
		
		}else{
		   redioButtonGenderFemale.click();
		}
		Thread.sleep(5000);
		
		WebElement stateDropdown = driver.findElement(By.tagName("select"));
	    Select obj = new Select(stateDropdown);
	    obj.selectByValue("Maharashtra");
	    Thread.sleep(5000);
	    
	    WebElement textBoxPassword = driver.findElement(By.xpath("//input[@id='password']"));
		textBoxPassword.sendKeys("Akshata@123");
		Thread.sleep(5000);
		
		WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        String s = buttonSubmit.getText();
        System.out.println("text value present on submit button"+s);
		Thread.sleep(5000);
		
		buttonSubmit.submit();
		Thread.sleep(5000);				
		driver.close();
			
	}

	
}
