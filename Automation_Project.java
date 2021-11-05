package com.bd.bongo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Automation_Project extends DriverSetup {
	
		public static String baseUrl= "https://bongobd.com/";
		
		@Test
		public static void Bongo() throws InterruptedException {
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//Page Title Verify
			String actualTitle = "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere";
			String siteTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, siteTitle);
			System.out.println("Title verifyed");
			Thread.sleep(2000);
			
            //click on the sports button
			driver.findElement(By.xpath("//span[contains(text(),'Sports')]")).click();
			Thread.sleep(3000);
			
			// Sports page verify
			String actualText="SPORTS";
			String sitetext = driver.findElement(By.xpath("//span[contains(text(),'Sports')]")).getText();
			Assert.assertEquals(actualText, sitetext);
			System.out.println("Sports page verifyed");
			Thread.sleep(2000);	
			
			
			//Scroll to the middle
			 JavascriptExecutor js = (JavascriptExecutor)driver;
		     js.executeScript("window.scrollTo(0,document.body.scrollHeight/2,);");
			 Thread.sleep(3000);
			 
			//click on the video
			 driver.findElement(By.xpath("//div[@class='MuiCardMedia-root jss645 jss688']")).click();
			 Thread.sleep(3000);
			 
			 //video page verify
			 String videoText= "Kieron Pollard hits 6 Sixes in an Over! - 1st CG Insurance T20 2021 - WI vs SL";
			 String siteVideoText = driver.findElement(By.xpath("//h5[contains(text(),'Kieron Pollard hits 6 Sixes in an Over! - 1st CG I')]")).getText();
			 Assert.assertEquals(videoText, siteVideoText);
			 System.out.println("Video page verified");
			 Thread.sleep(10000);
			 
			 //click on the pause button
			 driver.findElement(By.xpath("//button[@class='vjs-big-play-button bongo-big-play-button']")).click();
			 Thread.sleep(3000);
			 System.out.println("Done");
			 
		}
	}
