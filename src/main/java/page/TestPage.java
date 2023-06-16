package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPage {
	WebDriver driver;
	public TestPage (WebDriver driver) {
		this.driver = driver;
		
	}
@FindBy(how = How.CSS, using = "input[name= 'allbox']")	WebElement TOGGLE_ALL_ELEMENT;
@FindBy(how = How.CSS ,using = "input[name='todo[0]']") WebElement SELECT_FIRST_CHECKBOX_ELEMENT;		
@FindBy(how = How.CSS ,using = "input[name='todo[1]']") WebElement SELECT_SECOND_CHECKBOX_ELEMENT;
@FindBy(how = How.CSS ,using = "input[name='todo[2]']") WebElement SELECT_THIRD_CHECKBOX_ELEMENT;
@FindBy(how = How.CSS ,using = "input[name='todo[3]']") WebElement SELECT_FOURTH_CHECKBOX_ELEMENT;
@FindBy(how = How.CSS ,using = "input[name='data']") WebElement ADD_FIELD_ELEMENT;
@FindBy(how = How.CSS ,using = "input[value='Add']") WebElement CLICK_ADD_FIELD_ELEMENT;
@FindBy(how = How.CSS ,using = "input[value='Remove'") WebElement REMOVE_BOTTON_ELEMENT;
public void toggleAll() {
	 TOGGLE_ALL_ELEMENT.click();
}
public void selectFirstCheckbox() {
	SELECT_FIRST_CHECKBOX_ELEMENT.click();


}
public void selectSecondCheckbox() {
	SELECT_SECOND_CHECKBOX_ELEMENT.click();
}
public void selectThirdCheckbox() {
	SELECT_THIRD_CHECKBOX_ELEMENT.click();
}
public void selectFourthCheckbox() {
	SELECT_FOURTH_CHECKBOX_ELEMENT.click();
}
public void addField(String add) {
	ADD_FIELD_ELEMENT.sendKeys(add);
}
public void clickAddField() {
	CLICK_ADD_FIELD_ELEMENT.click();;
}

public void removeBotton() {
	REMOVE_BOTTON_ELEMENT.click();
	

}
}