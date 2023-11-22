package Com.organge.HRM.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import Com.excel.excelutility;
import Com.excel.propertiesutility;
import comHRM.loginPage;

public class logintestcase extends baseTest {
@Test
	public void loginwithvaliduserandpassword() throws InvalidFormatException, IOException {
		loginPage login=new  loginPage();
	//login.loginApplication(excelutility.getTestData(1, 0), excelutility.getTestData(1, 1));
		login.loginApplication(propertiesutility.getData("username"),propertiesutility.getData("password"));
	}
}
