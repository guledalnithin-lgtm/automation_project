package apparelbooks;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_041_Test extends BaseClass {
	@Test
	public void clickOnApparel() {
		HomePage hp=new HomePage(driver);
		hp.getApparelLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes", "Apparel page is not displayed");
		test.log(Status.PASS, "Apparel page is not displayed");
	}

}
