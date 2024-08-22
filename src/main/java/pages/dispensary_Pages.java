package pages;

import java.util.Map;


import org.openqa.selenium.WebDriver;

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
	 * @description : verify all sub-modules are displayed correctly after clicking on the expand icon of  "Dispensary" Module.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyAllSubModulesArePresentAndClickOnDispensary() throws Exception {
		
		return false;
	}


	/**@Test4
	 * about this method scrollToButtomAndVerifytheFields() 
	 * @param : null
	 * @description :scroll to the bottom of the "Sale" page and verify that "Print Invoice" button  , "Discard" button  ,"Invoice History" and  "Credit Limitis and Balance" text are peresent or not?
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean scrollToButtomAndVerifytheFields() throws Exception {
		
		return false;
	}



	/**@Test5
	 * about this method performTheKeyboardOperationToOpenthePopup() 
	 * @param : null
	 * @description :Perform the keyboard operation to open the "Add New Patient" popup Page  and verify that the popup is displayed or not.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public String performTheKeyboardOperationToOpenthePopup() throws Exception {
		
		return null;
	}


	/**@Test6
	 * about this method validateErrorMessageInFirstnameTextfield() 
	 * @param : null
	 * @description : Validate the error message in "Add New Patient" form's  firstname textfield after clicking on "Ok" Button without filling any information in the form
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateErrorMessageInFirstnameTextfield() throws Exception {
		
		return null;
	}

	/**@Test7.1
	 * about this method fillfirstNameTextFieldVerifyTheFirstName() 
	 * @param : Map<String, String>
	 * @description : fill First Name TextField and Verify First name
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillfirstNameTextFieldVerifyTheFirstName(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test7.2
	 * about this method fillmiddelNameTextFieldVerifyThemiddleName() 
	 * @param : Map<String, String>
	 * @description : fill Middle Name TextField and Verify middle name
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillmiddelNameTextFieldVerifyThemiddleName(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test7.3
	 * about this method filllastNameTextfieldVerifylastName() 
	 * @param : Map<String, String>
	 * @description : fill Last Name TextField and Verify Last name
	 * @return : String
	 * @author : Yaksha
	 */
	public String filllastNameTextfieldVerifylastName(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test7.4
	 * about this method fillAgeTextFieldVerifyTheAge() 
	 * @param : Map<String, String>
	 * @description : fill age and Verify the age.
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillAgeTextFieldVerifyTheAge(Map<String, String> expectedData) throws Exception {

		return null;
	}



	/**@Test7.5
	 * about this method fillContactNumberTextFieldVerifyContactNumber() 
	 * @param : Map<String, String>
	 * @description : fill Contact Number TextField and Verify Contact Number
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillContactNumberTextFieldVerifyContactNumber(Map<String, String> expectedData) throws Exception {

		return null;
	}	

	/**@Test8
	 * about this method validateTheConfirmMessageOnTheNewConsumptionEntryPage() 
	 * @param : null
	 * @description : On the "New Consumption Entry's page, validate the confirm! Message that is "Are you sure you want to Proceed ?"
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public String validateTheConfirmMessageOnTheNewConsumptionEntryPage() throws Exception {
			
		return null;
	}


	/**@Test9
	 * about this method selectMainStoreFromFilterSelectMainStoreFromFilter() 
	 * @param : null
	 * @description : on the Stock page,select Main store from Filter by store dropdown and verify that Main store is selected and stock value are filtered by the selected store name 
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean selectMainStoreFromFilterSelectMainStoreFromFilter() throws Exception {
		
		return false;
	}


	/**@Test10
	 * about this method validateCreateRequisitionButtonIsPresentGoToThisPageThenValidateThePageName() 
	 * @param : null
	 * @description : on the stock page , please validate clicking "Create Requisition" button navigate to "Add Requisitions" page and validate the page Name.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public String validateCreateRequisitionButtonIsPresentGoToThisPageThenValidateThePageName() throws Exception {
		
		return null;
	}



	/**@Test11
	 * about this method byClickingOnThatButtonSomeTextFieldsAreDisplyed() 
	 * @param : null
	 * @description : on the Add Requisition page, clicking the + icon button on right hand side of Remarks text box add a  the New set of elements to add a new records and validate New Item text field, Quantity Text field and Remark text box are present or not 2nd rows?
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean byClickingOnThatButtonSomeTextFieldsAreDisplyed() throws Exception {
			
		return false;
	}
	
	
	/**@Test12.1
	 * about this method verifyPageNameOfRequisitionDetailsPage() 
	 * @param : null
	 * @description : On the "Requisition" page, verify that view button under "action" navigate to the "Requisition Details Print" page and validate the page name is  "Requisition Details Print" 
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyPageNameOfRequisitionDetailsPage() throws Exception {
		
		return null;
	}
	
	
	/**@Test12.2
	 * about this method validateTheButtonsArePresentOrNot() 
	 * @param : null
	 * @description :  validate "print" and "Requisitions List" button are present
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean validateTheButtonsArePresentOrNot() throws Exception {

		return false;
	}
	
	
	/**@Test13
	 * about this method getTheMedicineNameFromTable() 
	 * @param : null
	 * @description :  On the "Requisition Details Print" page, Get the medicine name from the "Requisition Details Print" table and  validate the medicine name is not blank.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean getTheMedicineNameFromTable() throws Exception {

		return false;
	}
	

	/**@Test14
	 * about this method inAddressFieldValidateThePlaceHolderNameAndPrintOnConsole() 
	 * @param : null
	 * @description : On the "New SSU Patient Registration" under social service module, get the place holder name of "Address" textfiled of  "New SSU Patient Registration" page and verify  the place holder name.
	 * @return : String
	 * @author : Yaksha
	 */
	public String inAddressFieldValidateThePlaceHolderNameAndPrintOnConsole() throws Exception {
		
		return null;
	}
	
	/**@Test15
	 * about this method closeNewSSUPatientRegistrationPopupByUsingJsExecutor() 
	 * @param : null
	 * @description : On the "New SSU Patient Registration" page, Close this "New SSU Patient Registration" popup page by using javaScript.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean closeNewSSUPatientRegistrationPopupByUsingJsExecutor() throws Exception {
		
		return false;
	}


}
