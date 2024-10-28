package FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBaseClass;
import com.crm.FileUtility.ExcelSheet;
import com.crm.Javautility.RandomNumber;
import com.crm.pom.OrganizationHomePagePom;

public class Test1 extends VTigerBaseClass{
	@Test
	public void main() throws InterruptedException, EncryptedDocumentException, IOException {
		String var = ExcelSheet.data("Organization", 0, 0);
		RandomNumber obj1 = new RandomNumber();
		int num = obj1.randomNum();
		OrganizationHomePagePom obj = new OrganizationHomePagePom(driver);
		obj.og(var+num);
	}
}
