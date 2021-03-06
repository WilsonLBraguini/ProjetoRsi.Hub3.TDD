package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ConsultaTelaPrincipalTest {
	private WebDriver driver;
	
	public void consultaTelaPrincipalPositivo() {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.id("tabletsImg")).click();
		String texto = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[2]/nav/a[2]")).getText();
		Assert.assertEquals("TABLETS", texto);
		//driver.close();
		
	}
	
	public void consultaTelaPrincipalNegativo() {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"img-special-offer\"]/figure/img")).click();
		//driver.close();
	}

}
