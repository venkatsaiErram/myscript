package rv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class newproject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class=\"login\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@name=\"email_create\"]")).sendKeys("venkatsa35erram@gmail.com");

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
Thread.sleep(2000);
//iver.findElement(By.xpath("//input[@value=\"1\"]")).click();
//iver.findElement(By.xpath("//*[@id=\"uniform-id_gender1\"]")).click();

//iver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("sujithreddy");
driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Erram");
driver.findElement(By.xpath("//*[@name=\"passwd\"]")).sendKeys("8074475262");
driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("2");
driver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("september");
driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("1997");
driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("durga");
driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("colony");
driver.findElement(By.xpath("//*[@name=\"address1\"]")).sendKeys("Cudahy");
driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys("Hyderabad");
Thread.sleep(6000);
driver.findElement(By.xpath("//*[@name=\"id_state\"]")).sendKeys("California");
driver.findElement(By.xpath("//*[@name=\"postcode\"]")).sendKeys("90202");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@name=\"id_country\"]")).sendKeys("united states");
driver.findElement(By.xpath("//*[@name=\"other\"]")).sendKeys("9121234563");
driver.findElement(By.xpath("//*[@name=\"phone_mobile\"]")).sendKeys("8074475262");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@name=\"alias\"]")).sendKeys("2-6-62");
driver.findElement(By.xpath("//*[@name=\"submitAccount\"]")).click();
Thread.sleep(8000);

driver.findElement(By.xpath("//a[text()=\"Women\"]")).click();
Thread.sleep(5000);
System.out.println(driver.getWindowHandle());
String MainWindow = driver.getWindowHandle();
driver.findElement(By.xpath("//*[@src=\"http://automationpractice.com/img/p/8/8-home_default.jpg\"]")).click();
Thread.sleep(2000);
driver.navigate().to("http://automationpractice.com/index.php?id_product=3&controller=product");
//driver.switchTo().frame("fancybox-frame1594567491560");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='box-cart-bottom']/div/p/button/span")).click();
Thread.sleep(2000);
driver.navigate().to("http://automationpractice.com/index.php?controller=order");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class=\"btn btn-default button button-medium\"]")).click();



Thread.sleep(5000);
driver.close();
	}
}
