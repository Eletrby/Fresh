package StepDefinitions;

import POM.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    static WebDriver driver = null;

    @Before
	public void openBrowser() throws InterruptedException {

//       System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
      //  driver = new ChromeDriver();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");



     driver= new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.navigate().to("https://fresh.com.eg/en");
        Thread.sleep(1000);

    }
    

        @After
    public static void closeBrowser()
    {
        try{
            Thread.sleep(2000);
            driver.quit();
        }catch (NullPointerException e) {
            System.out.println("NullPointerException Thrown!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
