package com.qa.abodoo.testscript;


import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.qa.abodoo.commontests.CommonComponents;

import FetchToExcel.Becoming_A_Cybersecurity_Consultant_Excel_Data;
import FetchToExcel.FetchDataToExcel;
//For this test script, course should display.
public class Becoming_a_Cybersecurity_Consultant_Test extends BaseTest implements CommonComponents{
	
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
	
	 @Test (priority=1,  dataProvider = "Abodoo", dataProviderClass = Becoming_A_Cybersecurity_Consultant_Excel_Data.class)
	public void becomingCyberSecurityConsultaneTest(String Condition , String Hardskill1 , String Hardskill2 , 
			String Hardskill3 , String Hardskill4 , String Hardskill5 , 
			String Hardskill6 , String Softskill1 , String Softskill2 ,
			String Softskill3 , String Jobtitle1 , String Jobtitle2 ,
			String Jobtitle3 , String Jobtitle4 , String Jobtitle5 , String Course) throws InterruptedException {
		  
		 page.click(hardSkills);
		 page.waitForLoadState();
		 Thread.sleep(1000);
		 if(page.isVisible("//label[text()='Cyber Security']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
		if(page.isVisible("//label[text()='Digital Literacy']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			page.click(addHardSkillIcon);
			page.click(addHardSkillField);
			page.click(Hardskill2);
			page.click(saveHardSkillAndProceedButton);
		}
		 page.click(hardSkills);
		 page.waitForLoadState();
		if(page.isVisible("//label[text()='Digital Technology']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			page.click(addHardSkillIcon);
			page.click(addHardSkillField);
			page.click(Hardskill3);
			page.click(saveHardSkillAndProceedButton);
		}
		 page.click(hardSkills);
		 page.waitForLoadState();
		if(page.isVisible("//label[text()='Economics']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			page.click(addHardSkillIcon);
			page.click(addHardSkillField);
			page.click(Hardskill4);
			page.click(saveHardSkillAndProceedButton);
		}
		 page.click(hardSkills);
		 page.waitForLoadState();
		if(page.isVisible("//label[text()='Research']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			page.click(addHardSkillIcon);
			page.click(addHardSkillField);
			page.click(Hardskill5);
			page.click(saveHardSkillAndProceedButton);
		}
		 page.click(hardSkills);
		 page.waitForLoadState();
		if(page.isVisible("//label[text()='Risk Management']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			page.click(addHardSkillIcon);
			page.click(addHardSkillField);
			page.click(Hardskill6);
			page.click(saveHardSkillAndProceedButton);
		}
//		if(page.isVisible("//label[text()='Target Audience']"))
//		{
//		System.out.println("HardSkill already exist");
//		}
//		else {
//		page.click(addHardSkillIcon);
//		page.click(addHardSkillField);
//		page.click(Hardskill7);
//		page.click(saveHardSkillAndProceedButton);
//		}
//		
		page.click(softSkills);
		 page.waitForLoadState();
		if(page.isVisible("//div[text()='Communications']"))
		{
			System.out.println("Softskill already exist");
		}
		else {			
			page.click(addSoftSkillField);
			Thread.sleep(500);
			page.click(Softskill1);
			Thread.sleep(500);
			page.click(saveSoftSkillAndProceed);
			Thread.sleep(500);	
		}
		
		page.click(softSkills);
		 page.waitForLoadState();
		if(page.isVisible("//div[text()='Innovation']"))
		{
			System.out.println("Softskill already exist");
		}
		else {
		page.click(addSoftSkillField);
		page.click(Softskill2);
		page.click(saveSoftSkillAndProceed);
		}
		page.click(softSkills);
		 page.waitForLoadState();
		if(page.isVisible("//div[text()='Management']"))
		{
			System.out.println("Softskill already exist");
		}
		else {
		page.click(addSoftSkillField);
		page.click(Softskill3);
		page.click(saveSoftSkillAndProceed);
		}
	
		Thread.sleep(500);
		page.click(learningMenu);
		Thread.sleep(500);
		page.dblclick(allJobs);
		Thread.sleep(1500);
		String courseNameText = page.locator(Course).textContent();
		System.out.println(courseNameText);
		Thread.sleep(500);
		Thread.sleep(500);
		page.click(addDesiredJobTitleButton);
		Thread.sleep(500);
		page.click(addJobTitleField);
		String jobtitletext1 = page.locator(Jobtitle1).textContent();
		page.click(Jobtitle1);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		
		if (page.isVisible(Course)) {
        try{
        Assert.fail(courseNameText + " is visible");    
            }
 	
		catch(AssertionError e) {
		    System.out.println("Assertion failed: For Job title, " +" "+jobtitletext1+" , "+ e.getMessage());
			   assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext1+" , "+ e.getMessage());    
        }
    }
		Thread.sleep(1000);
		page.click(clearAll);
		Thread.sleep(500);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext2 = page.locator(Jobtitle2).textContent();
		page.click(Jobtitle2);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		
		if (page.isVisible(Course)) {
        try{
        Assert.fail(courseNameText + " is visible");    
            }
 	
		catch(AssertionError e) {
			System.out.println("Assertion failed: For Job title, " +" "+jobtitletext2+" , "+ e.getMessage());
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
		
		if (page.isVisible(Course)) {
        try{
        Assert.fail(courseNameText + " is visible");    
            }
 	
		catch(AssertionError e) {
			System.out.println("Assertion failed: For Job title, " +" , "+jobtitletext3+" "+ e.getMessage());
			assertionFailedMessages.add("Assertion failed: For Job title, " +" , "+jobtitletext3+" "+ e.getMessage());    
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
		
		if (page.isVisible(Course)) {
        try{
        Assert.fail(courseNameText + " is visible");    
            }
 	
		catch(AssertionError e) {
			System.out.println("Assertion failed: For Job title, " +" "+jobtitletext4+" , "+ e.getMessage());
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
		
		if (page.isVisible(Course)) {
        try{
        Assert.fail(courseNameText + " is visible");    
            }
 	
		catch(AssertionError e) {
			System.out.println("Assertion failed:  For Job title, " +" "+jobtitletext5+" , "+ e.getMessage());
			assertionFailedMessages.add("Assertion failed:  For Job title, " +" "+jobtitletext5+" , "+ e.getMessage());    
    }  
 }        
	}
	 @AfterSuite
	    public void writeMessagesToExcel() {
	        // Write all assertion failed messages to Excel
		 excelWriter.writeData("BCC1", assertionFailedMessages);
	    } 
}
	 
