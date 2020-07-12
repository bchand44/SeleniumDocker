package dockerTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ProvideIncorrectTitle {

    WebDriver driver;
    String baseURL, nodeURL;
    String expectedTitle="GitHu";

    
	
	
	@BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
        baseURL = "http://github.com";
        nodeURL = "http://localhost:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.ANY);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);
        
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void sampleTest() throws InterruptedException {
    	
    	driver.get(baseURL);
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,expectedTitle,"Title is not correct");
        

    }
    
}
