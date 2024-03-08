package Almosafer;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases extends Parametres {

	WebDriver driver = new ChromeDriver();

	@BeforeTest()
	public void Setup() throws InterruptedException {
		driver.get("https://www.almosafer.com/en");
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/button[1]")).click();
		Thread.sleep(3000);
	}

	@Test(priority=2)
public void Check_hotel() throws InterruptedException {
		//driver.get("https://www.almosafer.com/en");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[normalize-space()='Kingdom of Saudi Arabia, SAR']")).click(); 
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(language[randomNumber]);
		Thread.sleep(3000);
	//driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/button[1]"));
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]/div")).click();
	Thread.sleep(3000);

		if (randomNumber == 0) {
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"))
				.sendKeys(enLanguage[enenLanguageRandom]);
			driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button/span"))
					.click();
		} else {
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"))
					.sendKeys(arLanguage[arLanguageRandom]);
			driver.findElement(
				By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button/span"))
					.click();
		}
	Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]")).click();
	Thread.sleep(3000);
		WebElement div = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]"));
		List<WebElement> divPrice = div
			.findElements(By.xpath("//*[@id=\"hotelCard-1141415\"]/div[3]/div/div[2]/div/div[1]/div/span[2]"));
		

		for (int i = 0; i < divPrice.size(); i++) {
			//System.out.println(divPrice.get(i).getText());
		
		LowestPrice = Integer.parseInt(divPrice.get(0).getText());
		HighestPrice = Integer.parseInt(divPrice.get(divPrice.size() - 1).getText());
		}
		AssertJUnit.assertEquals(LowestPrice >HighestPrice,false );
				asser.assertAll();
	}

	@Test(invocationCount =3, priority = 1)
	public void checkTheWebsiteLanguage() {
		
		driver.get(language[randomNumber]);
		String AtualTitle = driver.getTitle();
		if (
				
				
				randomNumber == 1) {
			AssertJUnit.assertEquals(AtualTitle, "المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران");
	} else {
			AssertJUnit.assertEquals(AtualTitle, "Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking");

	}

		asser.assertAll();

	}

@Test(priority = 3)
	public void CheckContactNumber() {
		driver.navigate().back();
		String ExpectedContactNumber = "+966554400000";
		String ActualContactNumber = driver.findElement(By.tagName("strong")).getText();

		AssertJUnit.assertEquals(ActualContactNumber, ExpectedContactNumber);
		asser.assertAll();
	}

	@Test(priority = 4)
	public void defaultCurrency() throws InterruptedException {
	
		Thread.sleep(3000);
		WebElement currency = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
		String expectedResult = "SAR";
		String Actualcurrency = currency.getText();
		asser.assertEquals(Actualcurrency, expectedResult);
		asser.assertAll();

	}

	@Test(priority=5)
	public void numberOfImg() throws InterruptedException

	{
		
	//	driver.get("https://www.almosafer.com/en");
		//Thread.sleep(3000);
//driver.findElement(By.cssSelector("//button[normalize-space()='Kingdom of Saudi Arabia, SAR']")).click(); ; 
		List<WebElement> a = driver.findElements(By.tagName("img"));
             		for(int i=0;i<a.size();i++)

              		
              		{
	String b=a.get(i).getAttribute("src");
               		System.out.println(b+"#"+(i+1));
               			
               		}
		System.out.println(a.size());
	}

	@Test(invocationCount=6,priority = 6
			)
	public void locationField() {
		String[] language={"https://www.almosafer.com/ar","https://www.almosafer.com/en"};

		
driver.get(language[randomNumber]);
		if(randomNumber==0)
	{
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(arLanguage[arLanguageRandom]);
			
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("القاهرة, مصر");
		WebElement el1=driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[2]/div/div[2]/div/button"));
Actions act=new Actions(driver);
		act.click(el1).perform();
			
		}
	else {
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(enLanguage[enenLanguageRandom])
			;
			
			
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("Amman ,Jordan");
			WebElement el2 =driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[2]/div/div[2]/div/button"));
	Actions act=new Actions(driver);
			act.click(el2).perform();
		}
	
}
	@Test(priority=7)
	public void hotleTabIsNotSelected() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();

		WebElement hotle = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
		Thread.sleep(3000);

		String Expected = "false";
	String Actual = hotle.getAttribute("aria-selected");

		AssertJUnit.assertEquals(Actual, Expected);
		asser.assertAll();
	}


	@Test(priority=11)
public void chack_Date() throws InterruptedException
{
		Thread.sleep(3000);
	 	Actions act=new Actions(driver);

	driver.get("https://www.almosafer.com/en");
		driver.findElement(By.xpath("//button[normalize-space()='Kingdom of Saudi Arabia, SAR']")).click(); 
		 WebElement a=driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-flights\"]/div"));
		 act.click(a).perform();
		Thread.sleep(3000);
    WebElement Return=driver.findElement(By.cssSelector("div[class='sc-OxbzP sc-lnrBVv gKbptE'] span[class='sc-hvvHee cuAEQj']"));
    		 Return.getText();
     int actualreturn=Integer.parseInt(Return.getText());
		Thread.sleep(3000);

		WebElement flight=driver.findElement(By.cssSelector("div[class='sc-OxbzP sc-lnrBVv gKbptE'] span[class='sc-eSePXt ljMnJa']"));
				flight.getText();
	 

	 	
		int actualFligh=Integer.parseInt(flight.getText());
		
		Thread.sleep(3000);

	AssertJUnit.assertEquals(actualFligh,expectdFligh);
	AssertJUnit.assertEquals(actualreturn,expectdReturn);

	asser.assertAll();

}
@Test(priority =8)
	public void qtife() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//div[@class='sc-fihHvN eYrDjb']//*[name()='svg']"));

		List<WebElement> element2=element.findElements(By.tagName("svg"));

	element.isDisplayed();
		AssertJUnit.assertEquals(element.isDisplayed(), true);
		asser.assertAll();
	}

	@Test(priority =9)
	public void checkTheVisa() throws InterruptedException {
		Thread.sleep(3000);
		WebElement visa = driver.findElement(By.xpath("//div[@class='sc-kNBZmU jEzChs']"));
		Thread.sleep(3000);

		List<WebElement> visalogo = visa.findElements(By.tagName("svg"));

		System.out.println(visalogo.get(2).getAttribute("data-testid"));
	for (int i = 0; i < visalogo.size(); i++) {
			if (i == 0 || i == 1 || i == 3) {
				continue;
			} else

			{
				String actual = visalogo.get(i).getAttribute("data-testid");
				String expected = "Footer__VisaCardLogo";

				AssertJUnit.assertEquals(actual, expected);

			}
		}
		asser.assertAll();
}

	@Test(priority = 10)
	public void randomlySelecOfVisitor() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();

		WebElement a = driver.findElement(
				By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[3]/div/select"));
		Actions act = new Actions(driver);
		act.click(a).perform();
		Select myselect = new Select(a);
		myselect.selectByIndex(randomNumber);

		System.out.println(a.getText());

	}

}
