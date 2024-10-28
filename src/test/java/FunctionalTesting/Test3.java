package FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBaseClass;
import com.crm.FileUtility.ExcelSheet;
import com.crm.Javautility.RandomNumber;
import com.crm.pom.ContactHomePagePom;

public class Test3 extends VTigerBaseClass {
	@Test
	public void testCase3() throws EncryptedDocumentException, IOException, InterruptedException {
		String var = ExcelSheet.data("Organization", 1, 0);
		RandomNumber obj1 = new RandomNumber();
		int num = obj1.randomNum();
		ContactHomePagePom obj2 = new ContactHomePagePom(driver);
		obj2.test3(var+num);
		obj2.saveButton();
	}
}
 