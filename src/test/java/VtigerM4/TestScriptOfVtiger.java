package VtigerM4;

import java.time.Duration;

import org.testng.annotations.Test;

import com.crm.VtigerM4BaseClass.BaseClassOfVtiger;

public class TestScriptOfVtiger extends BaseClassOfVtiger {
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("...Login VTiger Application...");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

}
