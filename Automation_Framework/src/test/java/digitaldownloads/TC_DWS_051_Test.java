package digitaldownloads;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_051_Test extends BaseClass {
	@Test
	public void clickOnDigitalDownloads() {
		HomePage hp=new HomePage(driver);
		hp.getDigitalDwonloadlink().click();;
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads", "Digital downloads page is not displayed");
		test.log(Status.PASS, "Digital downloads page is displayed");
	}

}
