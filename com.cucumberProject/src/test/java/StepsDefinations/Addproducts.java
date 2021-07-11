package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utilites.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addproducts extends Base{

	@Given("User Click on Products")
	public void user_click_on_products() throws Exception {
		Thread.sleep(2000);
		action = new Actions(driver);
		WebElement product= driver.findElement(By.xpath("//span[normalize-space()='Products']"));
		action.moveToElement(product).click().build().perform();
		Thread.sleep(2000);
	}

	@When("Select Add Products from drop down list")
	public void select_add_products_from_drop_down_list() throws Exception {
		Thread.sleep(2000);
		action = new Actions(driver);
		WebElement addproduct = driver.findElement(By.xpath("//a[normalize-space()='Add Products']"));
		action.moveToElement(addproduct).click().perform();
	}

	@When("User Select Type is {string} BarCode is {string} Category is {string} TaxMathod is {string} Using DropDwnSelect Menu")
	public void user_select_type_is_bar_code_is_category_is_tax_mathod_is_using_drop_dwn_select_menu(String TypeValue, String BarcodeValue, String CategoryValue, String TaxValue) throws Exception {
		//Select Type
				WebElement type1=driver.findElement(By.xpath("//select[@id='type']"));
				Select element1 = new Select(type1);
				element1.selectByVisibleText(TypeValue);

				//Select BarcodeSymbology
				Select element2=new Select(driver.findElement(By.xpath("//select[@id='barcode_symbology']")));
				element2.selectByVisibleText(BarcodeValue);


				// Select Category
				Select element3=new Select(driver.findElement(By.xpath("//select[@id='category']")));
				element3.selectByVisibleText(CategoryValue);

				//  Select Tax Value
				Select element4=new Select(driver.findElement(By.xpath("//select[@id='tax_method']")));
				element4.selectByVisibleText(TaxValue);
				Thread.sleep(2000);
				System.out.println("Using Drop Down Info Filled");

		
	}

	@When("User Enter Name is {string} Product code is {string} Price is {string} ProductTax is {string} Details is {string} AddFile is {string} Info Using SendKeysMethod")
	public void user_enter_name_is_product_code_is_price_is_product_tax_is_details_is_add_file_is_info_using_send_keys_method(String name, String code, String price, String tax, String details, String choosefile) throws Exception {
	//  Enter Name
			WebElement name1=driver.findElement(By.xpath("//input[@id='name']"));
			name1.sendKeys(name);

			//  Product code
			WebElement code1 = driver.findElement(By.xpath("//input[@id='code']"));
			code1.sendKeys(code+(int)Math.random());

			// Price
			WebElement price1=driver.findElement(By.xpath("//input[@id='price']"));
			price1.sendKeys(price);

			//  ProductTax
			WebElement tax1=driver.findElement(By.xpath("//input[@id='product_tax']"));
			tax1.sendKeys(tax);

			//    Enter Details about product
			WebElement details1=driver.findElement(By.xpath("//div[@class='redactor-editor redactor-linebreaks']"));
			details1.sendKeys(details);

			//  Add file/Image(Choose file)
			WebElement choosefile1=driver.findElement(By.name("userfile"));
			choosefile1.sendKeys(choosefile);
			Thread.sleep(2000);	
			System.out.println("File uploaded successfully");
			
			

		
		
	}

	@When("User Click on AddProducts button")
	public void user_click_on_add_products_button() throws Exception {
		WebElement addProductBtn= driver.findElement(By.xpath("//input[@name='add_product']"));
		addProductBtn.click();
		Thread.sleep(2000);
		System.out.println("AddProducts button clicked");

	}

	

@Then("User logout the application")
public void user_logout_the_application() throws Exception  {
	driver.findElement(By.xpath("//span[@class='hidden-xs']")).click();

	driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
	Thread.sleep(2000);
	
	WebElement ModalClick=driver.findElement(By.xpath("//button[contains(.,'OK')]"));

	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ModalClick);
	Thread.sleep(2000);
	

}

	
	
}
