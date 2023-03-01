package pomClasses;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrudenHome {

  @FindBy(xpath = "(//evo-link-button[@copy='Get an instant quote'])[2]") private  WebElement GetQ;
  
  
  public PrudenHome(WebDriver driver){
	  PageFactory.initElements(driver, this);
  }
  
  @SuppressWarnings("deprecation")
public void termLife(WebDriver driver) {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  GetQ.click();
	  String sr = null;
	  Set<String> str = driver.getWindowHandles();
	  Iterator<String> it = str.iterator();
	  for(int i=0;i<=1;i++) {
		  sr = it.next();
	  }
	  driver.switchTo().window(sr);
  }
  
 
}
