package com.qa.abodoo.testscript;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.qa.abodoo.commontests.CommonComponents;

import FetchToExcel.EIT_Digital_Summer_School_Excel_Data;
import FetchToExcel.FetchDataToExcel;
//for this script course should display
public class EIT_Digital_Summer_School_Test extends BaseTest implements CommonComponents {
	public ExtentReports extent; 
	 private FetchDataToExcel excelWriter;
	 private List<String> assertionFailedMessages;

	 @BeforeTest
	public void setUpTest() {
	 String excelFilePath = "C:\\Users\\Rhibhus\\eclipse-workspace\\Abodoo\\src\\main\\java\\excel\\OutCome_Abodoo.xlsx";
  excelWriter = new FetchDataToExcel(excelFilePath);
  assertionFailedMessages = new ArrayList<>(); 
	 }
	 
  @BeforeTest
	public void loginTest() throws InterruptedException {
	 BaseTest.launchBrowser();
		Thread.sleep(1500);		
  }

  @Test (priority=1,  dataProvider = "Abodoo", dataProviderClass = EIT_Digital_Summer_School_Excel_Data.class)
  public void eITDigitalSummerSchoolTest(String Course, String Hardskill1, String Hardskill2, 
		    String Hardskill3, String Hardskill4, String Hardskill5, String Hardskill6, 
		    String Hardskill7, String Hardskill8, String Hardskill9, String Hardskill10,
		    String Hardskill11,String Hardskill12, String Hardskill13, String Hardskill14, 
		    String Hardskill15, String Hardskill16, String Hardskill17, String Hardskill18,
		    String Hardskill19, String Hardskill20,String Hardskill21, String Softskill1, String Softskill2, 
		    String Jobtitle1, String Jobtitle2, String Jobtitle3, String Jobtitle4, String Jobtitle5, 
		    String Jobtitle6, String Jobtitle7, String Jobtitle8, String Jobtitle9, 
		    String Jobtitle10, String Jobtitle11, String Jobtitle12, String Jobtitle13, 
		    String Jobtitle14, String Jobtitle15, String CourseName) throws InterruptedException {
	
	   page.click(hardSkills);
	   page.waitForLoadState();
		 page.hover("(//div[@class=' card w-100 mb-3 d-flex justify-content-center'])[10]");
	   if(page.isVisible("//label[text()='5G Technology']"))
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
	   if(page.isVisible("//label[text()='Authentications']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Business Continuity Planning']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
			page.click(addHardSkillIcon);
			Thread.sleep(500);
			page.click(addHardSkillField);
			Thread.sleep(500);
			page.click(Hardskill3);
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
			Thread.sleep(1000);
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
			page.click(Hardskill5);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	   page.click(hardSkills);
	   page.waitForLoadState();
	   if(page.isVisible("//label[text()='Digital Forensics']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Digital Literacy']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Digital Technology']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Ethical Standards And Conduct']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Finance']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='General Data Protection Regulation (GDPR)']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Identity And Access Management']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Incident Response']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Information Privacy']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Infrastructure Security']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Internet Of Things (IoT)']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Lecturing']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Network Security']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Operations']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Privacy Impact Assessments']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	   if(page.isVisible("//label[text()='Risk Management']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
			page.click(addHardSkillIcon);
			Thread.sleep(500);
			page.click(addHardSkillField);
			Thread.sleep(500);
			page.click(Hardskill21);
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
			
			page.click(addSoftSkillField);
			Thread.sleep(500);
			page.click(Softskill1);
			Thread.sleep(500);
			page.click(saveSoftSkillAndProceed);
			Thread.sleep(500);	
		}
		page.click(softSkills);
		 page.waitForLoadState();
		if(page.isVisible("//div[text()='Planning']"))
		{
			System.out.println("Softskill already exist");
		}
		else {
			
			page.click(addSoftSkillField);
			Thread.sleep(500);
			page.click(Softskill2);
			Thread.sleep(500);
			page.click(saveSoftSkillAndProceed);
			Thread.sleep(500);	
		}
		Thread.sleep(500);
		page.click(learningMenu);
		Thread.sleep(500);
		page.dblclick(allJobs);
		page.waitForLoadState();
		Thread.sleep(1500);
		String courseNameText = page.locator(CourseName).textContent();
		System.out.println(courseNameText);
		Thread.sleep(500);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext1 = page.locator(Jobtitle1).textContent();
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
				   assertionFailedMessages.add("Assertion failed:For Jobtitle, " +" "+ jobtitletext1 +" "+ e.getMessage());    
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
    }		
  @AfterSuite
  public void writeMessagesToExcel() {
      // Write all assertion failed messages to Excel
	 excelWriter.writeData("EIT_Digital_Summer_School", assertionFailedMessages);
  } 
  }
