package dockerTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	String runEnviroment="docker";
	WebDriver driver; 
	String baseURl="http://github.com";
	String nodeURL;


	@BeforeMethod

	public void setTestConfigs() throws MalformedURLException
	{

		if(runEnviroment.equalsIgnoreCase("Docker"))
		{
			nodeURL = "http://localhost:4444/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
            capability.setPlatform(Platform.ANY);
			driver = new RemoteWebDriver(new URL(nodeURL), capability);
		}
		else if(runEnviroment.equalsIgnoreCase("local")) {

			driver= new ChromeDriver();
			driver.get(baseURl);
			driver.manage().window().maximize();

		}
		else { 
			System.out.println("Run Time Enviroment not in the list, check the list!");
		}

	}


	@AfterMethod

	public void closeDriver()
	{
		driver.quit();
	}



}
