package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuotePom {
	
	//DataMemeber
	@FindBy (xpath="//input[@id='has_existing_policy']")private WebElement InsuYesbtn;
	@FindBy (xpath="//input[@id='has_no_existing_policy']")private WebElement InsuNobtn;
	@FindBy (xpath="//input[@id='gender_male']")private WebElement Male;
	@FindBy (xpath="//input[@id='gender_female']")private WebElement Female;
	@FindBy (xpath="//input[@id='tobacco_true']")private WebElement TabacoYesbtn;
	@FindBy (xpath="//input[@id='tobacco_false']")private WebElement TabacoNobtn;
	@FindBy (xpath="//input[@id='married_true']")private WebElement MarrYes;
	@FindBy (xpath="//input[@id='married_false']")private WebElement MarrNo;
	@FindBy (xpath="//input[@id='has_children_true']")private WebElement Chilyes;
	@FindBy (xpath="//input[@id='has_children_false']")private WebElement ChilNo;
	@FindBy (xpath="//select[@id='hinet-birth_month']")private WebElement DobMonth;
	@FindBy (xpath="//input[@id='hinet-birth_day']")private WebElement DobDay;
	@FindBy (xpath="//input[@id='hinet-birth_year']")private WebElement DobYear;
	@FindBy (xpath="//span[text()='Month is required']")private WebElement MonthErr ;
	@FindBy (xpath="//span[text()='Day is required']")private WebElement DayErr ;
	@FindBy (xpath="//span[text()='Year is required']")private WebElement YearErr ;
	@FindBy (xpath="//button[@type='button']")private WebElement cont;
	@FindBy (xpath="//span[@class='percent']")private WebElement percent;
	
	// Initailzes
	public QuotePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Usage
	public void haveInsuYes() {
		InsuYesbtn.click();
	}

	public void haveInsuNO() {
		InsuNobtn.click();
	}

	public void gender() {
		Male.click();
	}

	public void genderFem() {
		Female.click();
	}

	public void TobaccoY() {
		TabacoYesbtn.click();
	}

	public void TobaccoN() {
		TabacoNobtn.click();
	}

	public void MarriedY() {
		MarrYes.click();
	}

	public void MarriedN() {
		MarrNo.click();
	}

	public void hasChildyes() {
		Chilyes.click();
	}

	public void hasChildno() {
		ChilNo.click();
	}

	public void month(String Month) {
		Select mnth = new Select(DobMonth);
		mnth.selectByVisibleText(Month);
	}

	public void day(String Day) {
		DobDay.sendKeys(Day);
	}

	public void year(String Year) {
		DobYear.sendKeys(Year);
	}
	public String merr() {
		String str = MonthErr.getText();
		return str;
	}
	public String dayerr() {
		String str = DayErr.getText();
		return str;
	}
	public String yearerr() {
		String str = YearErr.getText();
		return str;
	}
	public void cnt() {
		cont.click();
	}
	public String perc() {
		String str = percent.getText();
		return str;
	}
}
