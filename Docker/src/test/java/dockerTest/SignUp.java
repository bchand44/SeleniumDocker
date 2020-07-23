package dockerTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignUp  extends TestBase{



@Test

public void signUP() throws InterruptedException
{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[1]/header/div/div[2]/div[2]/a[2]")).click();
}



}
