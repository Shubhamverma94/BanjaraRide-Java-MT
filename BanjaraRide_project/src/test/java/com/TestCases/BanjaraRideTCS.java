package com.TestCases;

import org.testng.annotations.Test;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.capabilities.Capabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class BanjaraRideTCS extends Capabilities{
	AndroidDriver<AndroidElement> driver ;
//	@BeforeMethod
//	public void setup() throws IOException, InterruptedException {
//		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
//		startserver().start();
//		driver = capability(devicename, platformname, apppackage, appactivity, chromedriver);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
//	}
	
//	@AfterMethod
//	public void yamete() {
//		service.stop();
//	}	
	@Test(enabled = true, priority = 0)
	public void TS1() throws IOException, InterruptedException {
		startserver().start();
		driver = capability(devicename, platformname, apppackage, appactivity, chromedriver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
		
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/link_2")).click();

//		driver.findElement(By.xpath("//*[@text='India (IN)']")).click();
		
		driver.findElement(By.xpath("//*[@text='Hire Bike']")).click();
		
//		scroll - CB SHINE BS VI (2023) - 7 days
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CB SHINE BS VI (2023)\"))")).click() ;
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"7 days \"))")).click() ;
		
//		Book now
		driver.findElement(By.xpath("//*[@resource-id='com.forbinary.banjararide:id/btnBookNow']")).click();
		driver.findElement(By.xpath("//*[@resource-id='com.forbinary.banjararide:id/llDateContainer']")).click();
		
//		driver.findElements(MobileBy.className("android.widget.RelativeLayout")).get(10).click();
		
//		change date
		driver.findElement(MobileBy.AccessibilityId("Next month")).click();
		driver.findElement(MobileBy.AccessibilityId("01 June 2023")).click();
		
//		click OK
		driver.findElement(By.xpath("//*[@text='OK']")).click();	
	}
	
	@Test(enabled = true , priority = 1)
	
	public void TS2() throws InterruptedException {
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
	}
	
	@Test(enabled = true , priority = 2)
	
	public void TS3() throws InterruptedException {
		driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]")).click();
		driver.findElement(MobileBy.xpath("//*[@text='Bookings']")).click();
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_button")).click() ;
		
		driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("activa") ;

		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		driver.pressKey( new KeyEvent(AndroidKey.SEARCH) ) ;
		
		String failedMSG = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name") ;
		System.out.println(failedMSG);
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]")).click();
	}
	
	@Test(enabled = true, priority = 3)
	public void TS4() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))")).click() ;
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority = 4)
	public void TS5() throws InterruptedException {
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority = 5)
	public void TS6() throws InterruptedException {
		driver.pressKey( new KeyEvent(AndroidKey.APP_SWITCH) ) ;
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='CLEAR ALL']")).click();
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority = 6)
	public void TS7() throws InterruptedException, IOException {
		driver = capability(devicename, platformname, apppackage, appactivity, chromedriver) ;
		Thread.sleep(4000);
		
		driver.findElement(MobileBy.xpath("//*[@text='About Us']")).click();
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.xpath("//*[@text='About Company!']")).click();
		Thread.sleep(3000);
		String dsp = driver.findElement(MobileBy.id("com.forbinary.banjararide:id/infocenterlib_page_description")).getText();
		
		System.out.println(dsp);
	}
	
	
	@Test(enabled = true, priority = 7)
	public void TS8() throws InterruptedException {
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
		Thread.sleep(3000);
	}
	
	
	@Test(enabled = true, priority = 8)
	public void TS9() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Change Language")).click();
		Thread.sleep(3000);
		
		String msg = driver.findElement(MobileBy.xpath("//*[@text='No Notifications Received']")).getText();
		
		System.out.println(msg);
		driver.findElement(MobileBy.xpath("//*[@text='Go Back']")).click();
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority = 9)
	public void TS10() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Play video")).click();
		Thread.sleep(3000);
//		driver.findElement(MobileBy.AccessibilityId("Enter fullscreen")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(MobileBy.className("android.view.View")).click();
//		Thread.sleep(3000);
//		driver.pressKey( new KeyEvent(AndroidKey.BACK) ) ;
//		Thread.sleep(2000);
//		
//		driver.findElement(MobileBy.id("com.google.android.youtube:id/player_control_play_pause_replay_button")).click() ;
//		Thread.sleep(3000);
		
		
		
		startserver().stop();
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
	}
	
}