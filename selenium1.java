import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
	
	
	public static void main(String[] args) {
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com/");
//		WebElement searchLine = driver.findElement(By.name("q"));
//		searchLine.click();
//		searchLine.sendKeys("Bitch Lasagna - Pewdiepie");
//		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
//		searchButton.click();
//		WebElement VideoPew = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div/div"));
//		VideoPew.click();
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.youtube.com/");
//		WebElement SearchLine = driver.findElement(By.xpath("//*[@id=\"search\"]"));
//		SearchLine.click();
//		SearchLine.sendKeys("Bitch Lasagna - Pewdiepie");
//		WebElement SearchBTN = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
//		SearchBTN.click();
//		WebElement VideoPew = driver.findElement(By.xpath("//*[@id=\"contents\"]/ytd-video-renderer[1]"));
//		VideoPew.click();
	
		
		//Practice 1
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://friends.walla.co.il/register/");
//		WebElement Username = driver.findElement(By.id("username"));
//		Username.sendKeys("ShezifHamutz");
//		WebElement Surname = driver.findElement(By.id("fname"));
//		Surname.sendKeys("Shezif");
//		WebElement Lastname = driver.findElement(By.id("sname"));
//		Lastname.sendKeys("Hamutz");
		
		//Practice 2
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		WebElement searchLine = driver.findElement(By.name("q"));
		searchLine.click();
		searchLine.sendKeys("Bitch Lasagna - Pewdiepie");
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
		searchButton.click();
		WebElement ResultPew = driver.findElement(By.linkText("bitch lasagna - YouTube"));
		ResultPew.click();
		
	}

}
