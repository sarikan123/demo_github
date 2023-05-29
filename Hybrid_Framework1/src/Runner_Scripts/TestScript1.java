package Runner_Scripts;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Generic_Script.GenericScriptEx;
import Pom_HY.Pom1;


public class TestScript1 extends Base_Test {
@Test(dataProvider="testdata")
	
	public void test1(String d1,String d2) throws InterruptedException
	{
	
	Pom1 p= new Pom1(driver);
	p.username1(d1);
	p.password2(d2);
	Thread.sleep(3000);
	p.login();
	Assert.fail();

}

	@Test
	public void test2() throws InterruptedException {
		String unf=GenericScriptEx.get_data("Sheet1", 1, 0);
		String pwdf=GenericScriptEx.get_data("Sheet1", 1, 1);
		Pom1 p= new Pom1(driver);
		p.username1(unf);
		p.password2(pwdf);
		Thread.sleep(3000);
		p.login();
	}
@DataProvider(name="testdata")
 public Object[][] createData1(){

return new Object[][] {
	{"Santhosh","1234"},
};
}
}


