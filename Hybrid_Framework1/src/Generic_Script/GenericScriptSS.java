package Generic_Script;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericScriptSS {
	
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo="./photos_Hy/";
		Date d=new Date();
		String d1= d.toString();
		String d2= d1.replaceAll(":","-");
		TakesScreenshot ts =(TakesScreenshot)driver;
		//Step2
		File src = ts.getScreenshotAs(OutputType.FILE);
		//step 3
		File dst = new File(photo+d2+ ".jpeg");
		//step 4
		FileHandler.copy(src, dst); 
	}

}
