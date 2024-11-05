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
import FetchToExcel.University_of_Kent_CyberSecurity_Excel_Data;
//for this script course should display

public class University_Of_Kent_Cyber_Security_Test extends BaseTest implements CommonComponents {
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

   @Test (priority=1,  dataProvider = "Abodoo", dataProviderClass = University_of_Kent_CyberSecurity_Excel_Data.class)
   public void universityofKentCS(String Condition, 
   String Hardskill1, String Hardskill2, String Hardskill3, String Hardskill4, 
   String Hardskill5, String Hardskill6,String Hardskill7, String Hardskill8, 
   String Hardskill9, String Hardskill10,  String Hardskill11,String Hardskill12, 
   String Hardskill13, String Hardskill14, String Hardskill15, String Hardskill16, 
   String Hardskill17, String Hardskill18,  String Hardskill19, String Hardskill20, 
   String Hardskill21, String Hardskill22, String Hardskill23, String Hardskill24, 
   String Softskill1, String Softskill2, String Jobtitle1, String Jobtitle2, 
   String Jobtitle3, String Jobtitle4, String Jobtitle5, String Jobtitle6, 
   String Jobtitle7, String Jobtitle8, String CourseName) throws InterruptedException
  {  	
  	 page.click(hardSkills);
  	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Algorithms']"))
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
	 if(page.isVisible("//label[text()='C (Programming Language)']"))
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
	 if(page.isVisible("//label[text()='Computer Science']"))
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
	 if(page.isVisible("//label[text()='Curriculum Development']"))
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
	 if(page.isVisible("//label[text()='Cybercrime']"))
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
	 if(page.isVisible("//label[text()='Data Mining']"))
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
				page.click(Hardskill8);
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
				page.click(Hardskill9);
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
				page.click(Hardskill10);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Governance']"))
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
	 if(page.isVisible("//label[text()='Information And Communications Technology']"))
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
	 if(page.isVisible("//label[text()='Information Security Management']"))
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
	 if(page.isVisible("//label[text()='Information Systems']"))
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
				page.click(Hardskill15);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Java (Programming Language)']"))
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
	 if(page.isVisible("//label[text()='Knowledge Discovery']"))
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
	 if(page.isVisible("//label[text()='Mathematics']"))
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
				page.click(Hardskill19);
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
				page.click(Hardskill19);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Object-Oriented Programming (OOP)']"))
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
	 if(page.isVisible("//label[text()='Research']"))
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
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Secure Programming']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(1000);
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
	 if(page.isVisible("//label[text()='Systems Engineering']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(1000);
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
	 if(page.isVisible("//label[text()='Systems Architecture']"))
			{
			System.out.println("HardSkill already exist");
			}
			else {
				Thread.sleep(1000);
				page.click(addHardSkillIcon);
				Thread.sleep(500);
				page.click(addHardSkillField);
				Thread.sleep(500);
				page.click(Hardskill24);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
	 Thread.sleep(2000);
	  page.click(softSkills);
	  page.waitForLoadState();
	  if(page.isVisible("//div[text()='Communications']"))
		{
			System.out.println("Softskill already exist");
		}
		else {
		page.click(addSoftSkillField);
		page.click(Softskill1);
		page.click(saveSoftSkillAndProceed);
		Thread.sleep(1000);
		}	  
	  page.click(softSkills);
	  page.waitForLoadState();
	 if(page.isVisible("//div[text()='Innovation']"))
		{
			System.out.println("Softskill already exist");
		}	 
		else {			
		Thread.sleep(1000);
		page.waitForSelector(addSoftSkillField).click();
		Thread.sleep(1000);
		page.click(Softskill2);
		Thread.sleep(1000);
		Thread.sleep(500);
		page.click(saveSoftSkillAndProceed);
		}
	 
		Thread.sleep(500);
		page.click(learningMenu);
		Thread.sleep(500);
		page.dblclick(allJobs);
		Thread.sleep(2000);
		String courseNameText = page.locator(CourseName).textContent();
		System.out.println(courseNameText);
		Thread.sleep(500);
//		page.click(clearAll);
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
				   assertionFailedMessages.add("Assertion failed: For Jobtitle, " +" "+ jobtitletext1 +" , "+ e.getMessage());    
	        }
	 }
	        page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			String jobtitletext2 = page.locator(Jobtitle2).textContent();
			page.click(Jobtitle2);
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
					   assertionFailedMessages.add("Assertion failed: For Jobtitle, " +" "+jobtitletext2+" , "+ e.getMessage());    
		        }
		 }
		        page.click(clearAll);
				page.click(addDesiredJobTitleButton);
				page.click(addJobTitleField);
				   String jobtitletext3 = page.locator(Jobtitle3).textContent();
				page.click(Jobtitle3);
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
		assertionFailedMessages.add("Assertion failed: For Jobtitle, " +" "+jobtitletext3+" , "+ e.getMessage());    
		 }
			 }
	    page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext4 = page.locator(Jobtitle4).textContent();
		page.click(Jobtitle4);
		page.click(saveDesiredJobTitleButton);
		Thread.sleep(500);
		page.click(matched);
		Thread.sleep(1000);
			 
	 if (page.isVisible(CourseName)) {
		try{
				 
	      Assert.fail(courseNameText + " is visible");    
	        }
				 	
		catch(AssertionError e) {
	    System.out.println("Assertion failed: " + e.getMessage());
		   assertionFailedMessages.add("Assertion failed: For Jobtitle, " +" "+jobtitletext4+" , "+ e.getMessage());    
		   }
	 }
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext5 = page.locator(Jobtitle5).textContent();
		page.click(Jobtitle5);
		page.click(saveDesiredJobTitleButton);
		Thread.sleep(500);
		page.click(matched);
		Thread.sleep(1000);
		if (page.isVisible(CourseName)) {
       try{
	    Assert.fail(courseNameText + " is visible");    
       }
					 	
		catch(AssertionError e) {
		System.out.println("Assertion failed: " + e.getMessage());
		assertionFailedMessages.add("Assertion failed: For Jobtitle, " +" "+jobtitletext5+" , "+ e.getMessage());    
		 }
	   }
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext6 = page.locator(Jobtitle6).textContent();
		page.click(Jobtitle6);
		page.click(saveDesiredJobTitleButton);
		Thread.sleep(500);
		page.click(matched);
		Thread.sleep(1000);
		if (page.isVisible(CourseName)) {
       try{
	    Assert.fail(courseNameText + " is visible");    
       }				 	
		catch(AssertionError e) {
		System.out.println("Assertion failed: " + e.getMessage());
		assertionFailedMessages.add("Assertion failed: For Jobtitle, " +" "+jobtitletext6+" , "+ e.getMessage());    
		 }
	   }
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext7 = page.locator(Jobtitle7).textContent();
		page.click(Jobtitle7);
		page.click(saveDesiredJobTitleButton);
		Thread.sleep(500);
		page.click(matched);
		Thread.sleep(1000);
		if (page.isVisible(CourseName)) {
       try{
	    Assert.fail(courseNameText + " is visible");    
       }
					 	
		catch(AssertionError e) {
		System.out.println("Assertion failed: " + e.getMessage());
		assertionFailedMessages.add("Assertion failed: For Jobtitle, " +" "+jobtitletext7+" , "+ e.getMessage());    
		 }
	   }
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext8 = page.locator(Jobtitle7).textContent();
		page.click(Jobtitle7);
		page.click(saveDesiredJobTitleButton);
		Thread.sleep(500);
		page.click(matched);
		Thread.sleep(1000);
		if (page.isVisible(CourseName)) {
       try{
	    Assert.fail(courseNameText + " is visible");    
       }
					 	
		catch(AssertionError e) {
		System.out.println("Assertion failed: " + e.getMessage());
		assertionFailedMessages.add("Assertion failed: For Jobtitle, " +" "+jobtitletext8+" , "+ e.getMessage());    
		 }
	 	 }
	 }
	 @AfterSuite
	    public void writeMessagesToExcel() {
	        // Write all assertion failed messages to Excel
		 excelWriter.writeData("University_Of_Kent_CS", assertionFailedMessages);
	    } 
}
