package FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBaseClass;
import com.crm.pom.OrganizationHomePagePom;

public class Test2 extends VTigerBaseClass{
	@Test
	public void main() throws InterruptedException, EncryptedDocumentException, IOException {
		OrganizationHomePagePom obj1 = new OrganizationHomePagePom(driver);
		obj1.test2();
	}
}
