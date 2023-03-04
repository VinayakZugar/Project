package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPom {

	@FindBy (xpath="//span[@onclick='r(0)']") private WebElement Zero;
	@FindBy (xpath="//span[@onclick='r(1)']") private WebElement One;
	@FindBy (xpath="//span[@onclick='r(2)']") private WebElement Two;
	@FindBy (xpath="//span[@onclick='r(3)']") private WebElement Three;
	@FindBy (xpath="//span[@onclick='r(4)']") private WebElement Four;
	@FindBy (xpath="//span[@onclick='r(5)']") private WebElement Five;
	@FindBy (xpath="//span[@onclick='r(6)']") private WebElement Six;
	@FindBy (xpath="//span[@onclick='r(7)']") private WebElement Seven;
	@FindBy (xpath="//span[@onclick='r(8)']") private WebElement Eight;
	@FindBy (xpath="//span[@onclick='r(9)']") private WebElement Nine;
	@FindBy (xpath="(//span[@class='sciop'])[5]") private WebElement MultiplicationSign;
	@FindBy (xpath="//span[text()='/']") private WebElement DivisionSign;
	@FindBy (xpath="(//span[@class='sciop'])[1]") private WebElement AdditionSign;
	@FindBy (xpath="(//span[@class='sciop'])[3]") private WebElement SubtractionSign;
	@FindBy (xpath="//div[@id='sciOutPut']") private WebElement AnsText;
	@FindBy (xpath="//span[text()='AC']") private WebElement Clear;
	
	
	public CalculatorPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void multiplication() {
		Four.click();
		Two.click();
		Three.click();
		MultiplicationSign.click();
		Five.click();
		Two.click();
		Five.click();
	
		
	}
	
	public void divison() {
		Four.click();
		Zero.click();
		Zero.click();
		Zero.click();
		DivisionSign.click();
		Two.click();
		Zero.click();
		Zero.click();
	
		
	}
	
	public void addition() {
		SubtractionSign.click();
		for(int i=1;i<=2;i++) {
		Two.click();
		Three.click();
		Four.click();
		}
		AdditionSign.click();
		for(int i=1;i<=2;i++) {
			Three.click();
			Four.click();
			Five.click();
			}
		
		
	}
	
	public void subtraction() {
		Two.click();
		Three.click();
		Four.click();
		Eight.click();
		Two.click();
		Three.click();
		SubtractionSign.click();
		SubtractionSign.click();
		Two.click();
		Three.click();
		Zero.click();
		Nine.click();
		Four.click();
		Eight.click();
		Two.click();
		Three.click();
	
	
	}
	
	public void clear() throws InterruptedException {
		Thread.sleep(1000);
		Clear.click();
	}
	
	public String anstxt() {
		String txt = AnsText.getText();
		return txt;
		
	}

}
