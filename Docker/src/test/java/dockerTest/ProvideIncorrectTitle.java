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

public class ProvideIncorrectTitle extends TestBase {

   
    String baseURL, nodeURL;
    String expectedTitle="The world’s leading software development platform · GitHub";
    
    

    @Test
    public void sampleTest() throws InterruptedException {
    	
    	
        String title= driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,expectedTitle,"Title is not correct");
        

    }
    
}
