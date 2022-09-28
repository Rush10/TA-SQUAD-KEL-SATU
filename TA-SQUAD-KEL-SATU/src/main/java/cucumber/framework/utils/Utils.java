package cucumber.framework.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	public static int testCount = 0;
	public static int countOutline = 1;
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
				+screenshotName+"_"+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	public static void delay(int detik, String delays) {
		if(delays.equals("y"))
		{
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public static void zoomOut(int n) throws AWTException{
	  	Robot robot = new Robot();
	  	for (int i = 0; i < n; i++) {			
	  		robot.keyPress(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_SUBTRACT);
	  		robot.keyRelease(KeyEvent.VK_CONTROL);
	  		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		}
	}
	
	public static void zoomIn(int n) throws AWTException{
	  	Robot robot = new Robot();
	  	for (int i = 0; i < n; i++) {			
	  		robot.keyPress(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_ADD);
	  		robot.keyRelease(KeyEvent.VK_CONTROL);
	  		robot.keyRelease(KeyEvent.VK_ADD);
		}
	}
	
	public static int generateInteger(int intFirstIndex, int intLastIndex) {
		Random rand = new Random();
		int intTemp = 0;
		
		try {
			intTemp = rand.nextInt(intFirstIndex, intLastIndex+1);			
		} catch (IllegalArgumentException e) {
			intTemp = 0;
		}
		
		return intTemp;
	}
	
	public static String generateString(int intStringLength) {
		int randAlphabeth = 0;
		final char charBatasBawahAlphabeth = 97;
		final char charBatasAtasAlphabeth = 123;
		Random rand = new Random();
		StringBuffer strRandomString = new StringBuffer();
		
		for (int i = 0; i < intStringLength; i++) {
			randAlphabeth = rand.nextInt(charBatasBawahAlphabeth,charBatasAtasAlphabeth);
			strRandomString.append((char)randAlphabeth);
		}
		
		return strRandomString.toString();
	}
	
	public static String generateWord(int intWord, int intWordLength) {
		StringBuffer strRandomString = new StringBuffer();
		String strTemp = "";
		
		for (int i = 0; i < intWord; i++) {
			strRandomString.append(generateString(intWordLength) + " ");
		}
		
		strTemp = strRandomString.toString().substring(0,strRandomString.length()-1);
		
		return strTemp;
	}
	
	public static String generateDate() {
		Random rand = new Random();
		String strTemp = "";
		
		strTemp = 2022 + "-" + rand.nextInt(1,13) + "-" + rand.nextInt(1,31);
		
		return strTemp;
	}
	
	public static String generateDate(int firstIndexYear, int lastIndexYear) {
		Random rand = new Random();
		String strTemp = "";
		
		try {			
			strTemp = rand.nextInt(firstIndexYear,lastIndexYear+1) + "-" + rand.nextInt(1,13) + "-" + rand.nextInt(1,31);
		} catch (Exception e) {
			strTemp = 2022 + "-" + rand.nextInt(1,13) + "-" + rand.nextInt(1,31);
		}
		
		return strTemp;
	}
	
	public static String generateDate(int firstIndexMonth, int lastIndexMonth, int firstIndexDate, int lastIndexDate) {
		Random rand = new Random();
		String strTemp = "";
		
		try {			
			strTemp = 2022 + "-" + rand.nextInt(firstIndexMonth,lastIndexMonth+1) + "-" + rand.nextInt(firstIndexDate,lastIndexDate+1);
		} catch (Exception e) {
			strTemp = 2022 + "-" + rand.nextInt(1,13) + "-" + rand.nextInt(1,31);
		}
		
		return strTemp;
	}
}