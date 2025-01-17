package pages;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dispensary_Pages extends StartupPage {
	
	By usernameTextfield=By.id(" ");
	By usernameTextbox = By.xpath(" ");
	By passwordTextbox = By.xpath(" ");
	By signInButton = By.xpath(" ");
	By registeredPatientTextElement = By.xpath(" ");
	By dispensaryModule = By.xpath(" ");
	By dispensaryToggle = By.xpath(" ");	
	By PrescriptionSubModule = By.xpath(" ");
	By saleSubModule = By.xpath(" ");
	By stockSubModule = By.xpath(" ");
	By counterSubModule = By.xpath(" ");
	By reportsSubModule = By.xpath(" ");
	By patientConsumptionSubModule = By.xpath(" ");
	By morningCounter = By.xpath(" ");
	By eveningCounter = By.xpath(" ");
	By nightCounter = By.xpath(" ");
	By counterSelection = By.xpath(" ");
	By saleTab = By.xpath(" ");
	By saleListTab = By.xpath(" ");
	By returnFromCustomerTab = By.xpath(" ");
	By returnSaleListTab = By.xpath(" ");
	By provisionalBillsTab = By.xpath(" ");
	By settlementTab = By.xpath(" ");
	By ProvisionalReturnTab = By.xpath(" ");
	By addNewPatientPopup = By.xpath(" ");
	By okButton = By.xpath(" ");
	By errorMeesageInFirstNameTextField = By.xpath(" ");
	By addNewPatientPageTitle = By.xpath(" ");
	By patientConsuptionTab = By.xpath(" ");
	By newConsuptionButton = By.xpath(" ");
	By saveConsuptionButton = By.id(" ");
	By confirmMessage = By.xpath(" ");
	By confirmButton = By.id(" ");
	By newConsumptionEntryPageCancelButton = By.xpath(" ");
	By filterByStoreDropdown = By.id(" ");

	By firstNameTextFieldInAddNewPatient = By.id(" ");
	By middleNameTextFieldInAddNewPatient = By.id(" ");
	By lastNameTextFieldInAddNewPatient = By.id(" ");
	By ageTextFieldInAddNewPatient = By.id(" ");
	By contactNumberTextFieldInAddNewPatient = By.id(" ");
	By XButton = By.xpath(" ");
	By lastButtonInstockSubModule = By.xpath(" ");
	By totalStockValueText = By.xpath(" ");

	By printInvoiceButtonElement = By.xpath(" ");
	By discardButtonElement = By.xpath(" ");
	By invoiceHistoryTextElement = By.xpath(" ");
	By creditLimitsAndBalancesTextElement = By.xpath(" ");

	By storeDropdownElement = By.xpath(" ");
	By totalStockValueOfAllStockElement = By.xpath(" ");

	By requisitionsLinkElement = By.xpath(" ");
	By createRequisitionsButtonElement = By.xpath(" ");	
	By mainDispensaryOption = By.xpath(" ");
	By mainStoreOption = By.xpath(" ");
	By requisitionSubModule = By.xpath(" ");
	By createRequisitionButton = By.xpath(" ");
	By itemNameTextfield=By.id(" ");
	By cancelButton = By.xpath(" ");
	By viewButton = By.xpath(" ");	
	By medicineNameField = By.xpath(" ");
	By printButton = By.xpath(" ");
	By requisitionsListButton = By.xpath(" ");
	By RequisitionPageTitle = By.xpath(" ");
	By socialServiceModule = By.xpath(" ");	
	By registerNewSSUPatientButton = By.xpath(" ");
	By addressTextField = By.id(" ");
	By xButton = By.xpath(" ");
	By procurementModule = By.xpath(" ");
	By settingsTab = By.xpath(" ");
	By invoiceHeadersSubTab = By.xpath(" ");
	By addNewInvoiceHeaderButton = By.xpath(" ");
	By chooseFileButton = By.id(" ");

	By shortCutKeysArrowIconElement = By.xpath(" ");
	By salesPageTooltipsValueElement = By.xpath(" ");
	By dispensarySalesNavigationMenuElement = By.xpath(" ");

	By appointmentTab=By.xpath(" ");
	By keyboardButton=By.xpath(" ");
	By tooltip=By.xpath(" ");
	By countryDropdownByElement = By.xpath(" ");
	By dispensarySaleTabElement = By.xpath(" ");

	By patientSearchTextBoxElement = By.xpath(" ");
	By listOfpatientlElement = By.xpath(" ");

	By operationTheatreNavMenuElement = By.xpath(" ");
	By newOtBookingButtonElement = By.xpath(" ");
	By addNewOtButtonElement = By.xpath(" ");
	By addInvoiceHeaderCloseButtonElement = By.xpath(" ");

	By othersChargesTab = By.xpath(" ");
	By addOtherChargesButton = By.xpath(" ");
	By isVATApplicableCheckBox = By.xpath(" ");
	By isActiveCheckBox = By.xpath(" ");
	By isDefaultCheckBox = By.xpath(" ");
	By bookingOTSchedulePageCloseButtonElement = By.xpath(" ");
	By procurementModuleSettingTabElement = By.xpath(" ");
	By addOtherChargesCloseButtonElement = By.xpath(" ");
	By requisitionTab = By.xpath(" ");
	By addRequisitionsPageName = By.xpath(" ");
	By plusIcon = By.xpath(" ");
	By itemNameTextField = By.id(" ");
	By quantityTextField = By.id(" ");
	By remarkTextField = By.id(" ");
	By cancelButtonInAddRequisition = By.xpath(" ");
	By viewIconiconOfRecentlyCreatedDocument = By.xpath(" ");
	By requisitionDetailsPrintPageName = By.xpath(" ");	
	By medicineName = By.xpath(" ");
	By closeButton = By.xpath(" ");

	
	String pageName = this.getClass().getSimpleName();
	public dispensary_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1.1
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

}
