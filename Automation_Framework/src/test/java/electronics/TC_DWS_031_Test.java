package electronics;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_031_Test extends BaseClass {
	@Test
	public void clickOnElectronics() {
		HomePage hp=new HomePage(driver);
		hp.getElectroincsLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics", "Electronics page is not diplayed");
		test.log(Status.PASS, "Electronics page is diplayed");
	}

}
