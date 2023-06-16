package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TestPage;
import utill.BrowserFactory;

public class LoginTest {
WebDriver driver;
@Test
public void validPage() {
	driver = BrowserFactory.init();
	TestPage testPage = PageFactory.initElements(driver,TestPage.class);
//Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.
	testPage.addField("java");
	testPage.clickAddField();
	testPage.addField("Sql");
	testPage.clickAddField();
	testPage.addField("Selenium");
	testPage.clickAddField();
	
	testPage.toggleAll();
	
//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.
//testPage.selectFirstCheckbox();	
//testPage.removeBotton();
	
//Test 3: Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.	

//testPage.toggleAll();
//testPage.removeBotton();


}
}