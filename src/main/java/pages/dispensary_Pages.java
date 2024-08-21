package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dispensary_Pages extends StartupPage {

	

	String pageName = this.getClass().getSimpleName();
	public dispensary_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyTitleOfThePage() throws Exception {
			
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyURLOfThePage() throws Exception {
			
		return null;
	}


	/**@Test2
	 * about this method verifyDispensaryModuleIsPresentOrNot() 
	 * @param : null
	 * @description : vverify the Dispensary module is present or not
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyDispensaryModuleIsPresentOrNot() throws Exception {
		
		return false;
	}

	/**@Test3
	 * about this method verifyAllSubModulesArePresentAndClickOnDispensary() 
	 * @param : null
	 * @description : verify all sub-modules are displayed correctly after clicking on the "Dispensary" Module.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyAllSubModulesArePresentAndClickOnDispensary() throws Exception {
			
		return false;
	}

	
	/**@Test4
	 * about this method scrollToButtomAndVerifytheFields() 
	 * @param : null
	 * @description : scroll to the bottom of the "Sale" page and verify that "Print Invoice" button  , "Discard" button  ,"Invoice History" and  "Credit Limitis and Balance" text are peresent or not.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean scrollToButtomAndVerifytheFields() throws Exception {
		
		return false;
	}

	

	/**@Test5
	 * about this method performTheKeyboardOperationToOpenthePopup() 
	 * @param : null
	 * @description : Perform the keyboard operation to open the  popup and verify that the popup is displayed or not.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean performTheKeyboardOperationToOpenthePopup() throws Exception {
			
		return false;
	}


	/**@Test6
	 * about this method validateErrorMessageInFirstnameTextfield() 
	 * @param : null
	 * @description : Validate the error message in firstname textfield after click on "Ok" button
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateErrorMessageInFirstnameTextfield() throws Exception {
			
		return null;
	}

	/**@Test7
	 * about this method fillAllTheTextfieldsInsideTheAddNewPatientVerifyTheFirstName() 
	 * @param : Map<String, String>
	 * @description : Fill all the textfields which are present inside the Add New Patient popup. and verify that value is present after enter the values.
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillAllTheTextfieldsInsideTheAddNewPatientVerifyTheFirstName(Map<String, String> expectedData) throws Exception {
		
		return null;
	}



	/**@Test8
	 * about this method navigateToLastPageOfTheStockDetailsAndFetchTotalStockValue() 
	 * @param : null
	 * @description : Navigate to the Last page of the stock details list pagenation and fetch the total stock value
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean navigateToLastPageOfTheStockDetailsAndFetchTotalStockValue() throws Exception {
			
		return false;
	}
	
	
	/**@Test9
	 * about this method checkMainDispensaryIsSelectedFromFilterStockDropdown() 
	 * @param : null
	 * @description : check "Main Dispensary" is selected from filter stock dropdown and select main store.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean checkMainDispensaryIsSelectedFromFilterStockDropdown() throws Exception {
			
		return false;
	}
	
	
	/**@Test10
	 * about this method validateCreateRequisitionButtonIsPresent() 
	 * @param : null
	 * @description : validate "create requisition" button is present or not
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean validateCreateRequisitionButtonIsPresent() throws Exception {
			
		return false;
	}
	
	
	/**@Test11
	 * about this method verifyNewItemTextFieldIsPresent() 
	 * @param : null
	 * @description : verify "Item Name" text field is present in "Add Requisition" page
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyNewItemTextFieldIsPresent() throws Exception {
			
		return false;
	}
	
			
	/**@Test12
	 * about this method verifyRequisitionDetailsPrintPageIsDisplayed() 
	 * @param : null
	 * @description : verify Requisition Details Print page
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyRequisitionDetailsPrintPageIsDisplayed() throws Exception {
		
		return false;
	}
	
}
