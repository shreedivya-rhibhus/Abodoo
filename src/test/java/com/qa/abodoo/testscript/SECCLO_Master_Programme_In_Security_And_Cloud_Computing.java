package com.qa.abodoo.testscript;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.qa.abodoo.commontests.CommonComponents;

import FetchToExcel.FetchDataToExcel;
import FetchToExcel.SECCLO_Master_Programme_In_Security_Excel_Data;
//for this script course should display

public class SECCLO_Master_Programme_In_Security_And_Cloud_Computing extends BaseTest  implements CommonComponents{

	public ExtentReports extent;
	 private FetchDataToExcel excelWriter;
	 private List<String> assertionFailedMessages;
	 
	@BeforeTest
	public void setUp() {
	 String excelFilePath = "C:\\Users\\Rhibhus\\eclipse-workspace\\Abodoo\\src\\main\\java\\excel\\OutCome_Abodoo.xlsx";
    excelWriter = new FetchDataToExcel(excelFilePath);
    assertionFailedMessages = new ArrayList<>();    
}
	@BeforeTest
		public void login() throws InterruptedException {
		 BaseTest.launchBrowser();
			Thread.sleep(1500);		
	}
	
	@Test (priority=1,  dataProvider = "Abodoo", dataProviderClass = SECCLO_Master_Programme_In_Security_Excel_Data.class)
public void universitatPolitechnicaMasterDegreeCyberSecurityTest(String Conditions, 
		String Hardskill1, 	String Hardskill2,String Hardskill3,String Hardskill4,
		String Hardskill5,	String Hardskill6, String Hardskill7,String Hardskill8,
		String Hardskill9,	String Hardskill10,	String Hardskill11,String Hardskill12,
		String Hardskill13,	String Hardskill14,	String Hardskill15,String Hardskill16,
		String Hardskill17,	String Hardskill18,	String Hardskill19,String Hardskill20,
		String Hardskill21,	String Hardskill22, String Hardskill23,String Hardskill24,
		String Hardskill25,	String Hardskill26,	String Hardskill27,String Hardskill28,
		String Hardskill29,	String Hardskill30,String Hardskill31,String Softskill1,
		String Jobtitle1,String Jobtitle2,String Jobtitle3,String Jobtitle4,
		String Jobtitle5,String Jobtitle6,String Jobtitle7,String Jobtitle8,
		String Jobtitle9,String Jobtitle10,String Jobtitle11,String Jobtitle12,
		String Jobtitle13,String Jobtitle14,String Jobtitle15,String Jobtitle16,
		String Jobtitle17,String Jobtitle18,String Jobtitle19,String Jobtitle20,
		String Jobtitle21 , String CourseName) throws InterruptedException
{
		page.click(hardSkills);
		page.waitForLoadState();
		if(page.isVisible("//label[text()='Algorithms']"))
			{
			System.out.println("HardSkill already exist");
			}
		else {	
		Thread.sleep(500);
		page.click(addHardSkillIcon);
		Thread.sleep(500);
		page.click(addHardSkillField);
		Thread.sleep(500);
		page.click(Hardskill1);
		Thread.sleep(500);
		page.click(saveHardSkillAndProceedButton);
	}	
		page.click(hardSkills);
		 page.waitForLoadState();
		 if(page.isVisible("//label[text()='Application Development']"))
			{
			System.out.println("HardSkill already exist");
			}
		else {
			Thread.sleep(500);
			page.click(addHardSkillIcon);
			Thread.sleep(500);
			page.click(addHardSkillField);
			Thread.sleep(500);
			page.click(Hardskill2);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}	
	    page.click(hardSkills);
	    page.waitForLoadState();
		 if(page.isVisible("//label[text()='Applied Research']"))
			{
			System.out.println("HardSkill already exist");
			}
		else {
			Thread.sleep(500);
			page.click(addHardSkillIcon);
			Thread.sleep(500);
			page.click(addHardSkillField);
			Thread.sleep(500);
			page.click(Hardskill3);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
			}	
		 Thread.sleep(500);
		 page.click(hardSkills);
		 page.waitForLoadState();
		 if(page.isVisible("//label[text()='Big Data']"))
			{
			System.out.println("HardSkill already exist");
			}
		else {
		Thread.sleep(500);
		page.click(addHardSkillIcon);
		Thread.sleep(500);
		page.click(addHardSkillField);
		Thread.sleep(500);
		page.click(Hardskill4);
		Thread.sleep(500);
		page.click(saveHardSkillAndProceedButton);
	}	
		 page.click(hardSkills);
		 page.waitForLoadState();
		 if(page.isVisible("//label[text()='Calculus']"))
			{
			System.out.println("HardSkill already exist");
			}
		else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill5);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Cloud Computing']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill6);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Computer Networks']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill7);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Computing Platforms']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill8);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Cryptography']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill9);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Curriculum Development']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill10);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Cyber Security']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill11);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Data Mining']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill12);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Data Security']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill13);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Data Structures']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill14);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Digital Literacy']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill15);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Digital Technology']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill16);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Discrete Mathematics']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill17);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Distributed Computing']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill18);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}	
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Embedded Systems']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill19);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Linear Algebra']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill20);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Machine Learning']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill21);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Mathematics']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill22);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Mobile Application Development']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill23);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Online Service Provider']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill24);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Operating Systems']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill25);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Probability Theories']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill26);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Research']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill27);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Software Engineering']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill28);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Statistics']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill29);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	        page.click(hardSkills);
	        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Systems Engineering']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill30);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
		        page.click(hardSkills);
		        page.waitForLoadState();
		 if(page.isVisible("//label[text()='Theory Of Computation']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(500);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill31);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);	
			}
		 
		 page.click(softSkills);
		 page.waitForLoadState();
		 if(page.isVisible("//div[text()='Communications']"))
			{
				System.out.println("Softskill already exist");
			}	 
			else {	
			
			Thread.sleep(500);
			page.waitForSelector(addSoftSkillField).click();
			Thread.sleep(500);
			page.click(Softskill1);
			Thread.sleep(500);
			page.click(saveSoftSkillAndProceed);
			}

		 Thread.sleep(500);
			page.click(learningMenu);
			Thread.sleep(500);
			page.dblclick(allJobs);
			Thread.sleep(1500);
			String courseNameText = page.locator(CourseName).textContent();
			System.out.println(courseNameText);
			Thread.sleep(500);
//			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext1 = page.locator(Jobtitle1).textContent();
			System.out.println(jobtitletext1);
			page.click(Jobtitle1);		
			page.click(saveDesiredJobTitleButton);
			Thread.sleep(500);
			page.click(matched);
			Thread.sleep(2000);
			
		 if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
					   assertionFailedMessages.add("Assertion failed:For Jobtitle, " +" "+ jobtitletext1 +" , "+ e.getMessage());    
		        }
		 }
		 
		 page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext2 = page.locator(Jobtitle2).textContent();
			page.click(Jobtitle2);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);		
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }	 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext2+" , "+ e.getMessage());    
		        }
		    }
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext3 = page.locator(Jobtitle3).textContent();
			page.click(Jobtitle3);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);		
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }	 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext3+" , "+ e.getMessage());    
		        }
		    }
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext4 = page.locator(Jobtitle4).textContent();
			page.click(Jobtitle4);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);		
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }	 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext4+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext5 = page.locator(Jobtitle5).textContent();
			page.click(Jobtitle5);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);		
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext5+" , "+ e.getMessage());    
		        }
		    }
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext6 = page.locator(Jobtitle6).textContent();
			page.click(Jobtitle6);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext6+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext7 = page.locator(Jobtitle7).textContent();
			page.click(Jobtitle7);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext7+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext8 = page.locator(Jobtitle8).textContent();
			page.click(Jobtitle8);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext8+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext9 = page.locator(Jobtitle9).textContent();
			page.click(Jobtitle9);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext9+" , "+ e.getMessage());    
		        }
		    }
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext10 = page.locator(Jobtitle10).textContent();
			page.click(Jobtitle10);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext10+" , "+ e.getMessage());    
		        }
		    }
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext11 = page.locator(Jobtitle11).textContent();
			page.click(Jobtitle11);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext11+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext12 = page.locator(Jobtitle12).textContent();
			page.click(Jobtitle12);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext12+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext13 = page.locator(Jobtitle13).textContent();
			page.click(Jobtitle13);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext13+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext14 = page.locator(Jobtitle14).textContent();
			page.click(Jobtitle14);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext14+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext15 = page.locator(Jobtitle15).textContent();
			page.click(Jobtitle15);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext15+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext16 = page.locator(Jobtitle16).textContent();
			page.click(Jobtitle16);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext16+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext17 = page.locator(Jobtitle17).textContent();
			page.click(Jobtitle17);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext17+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext18 = page.locator(Jobtitle18).textContent();
			page.click(Jobtitle18);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext18+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext19 = page.locator(Jobtitle19).textContent();
			page.click(Jobtitle19);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext19+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext20 = page.locator(Jobtitle20).textContent();
			page.click(Jobtitle20);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext20+" , "+ e.getMessage());    
		        }
		    }	
			
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext21 = page.locator(Jobtitle21).textContent();
			page.click(Jobtitle21);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			if (page.isVisible(CourseName)) {
		        try{
		        Assert.fail(courseNameText + " is visible");    
		            }
		 	
				catch(AssertionError e) {
				    System.out.println("Assertion failed: " + e.getMessage());
				    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext21+" , "+ e.getMessage());    
		        }
			}		 
}
	@AfterSuite
    public void writeMessagesToExcel() {
      // Write all assertion failed messages to Excel
	 excelWriter.writeData("Secclo", assertionFailedMessages);
    }		
	
}
