package FunctionalTesting;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBaseClass;
import com.crm.FileUtility.ExcelSheet;
import com.crm.Javautility.RandomNumber;
import com.crm.pom.ContactHomePagePom;

public class Test4 extends VTigerBaseClass{
	@Test
	public void testCase4() throws EncryptedDocumentException, IOException, InterruptedException {
		String var = ExcelSheet.data("Organization", 1, 0);
		RandomNumber obj2 = new RandomNumber();
		int num = obj2.randomNum();
		ContactHomePagePom obj3 = new ContactHomePagePom(driver);
		obj3.test4(var+num);
		String parent = driver.getWindowHandle();
		
		Set<String> childs = driver.getWindowHandles();
		childs.remove(parent);
		for (String str : childs) 
		{
			Thread.sleep(2000);
			driver.switchTo().window(str);
			Thread.sleep(1000);
			obj3.addCompanys();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[@id='9']")).click();
//			Thread.sleep(2000);
		}
		driver.switchTo().window(parent);

		obj3.test4(var+num);
		
		obj3.saveButton();
		
	}
}
