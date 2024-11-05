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
import FetchToExcel.Universitat_Politècnica_de_Catalunya_Masters_degree_in_Cybersecurity;
//for this script course should display

public class Universitat_Politechnica_Master_Degree_Cyber_Security extends BaseTest implements CommonComponents{

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
	
	@Test (priority=1,  dataProvider = "Abodoo", dataProviderClass = Universitat_Politècnica_de_Catalunya_Masters_degree_in_Cybersecurity.class)
public void universitatPolitechnicaMasterDegreeCyberSecurityTest(String Conditions, String Hardskill1, String Hardskill2,
		String Hardskill3,String Hardskill4,String Hardskill5,String Hardskill6,
		String Hardskill7,String Hardskill8,String Hardskill9,String Hardskill10,
		String Hardskill11,String Hardskill12,String Hardskill13,String Hardskill14,
		String Hardskill15, String Softskill1,String Softskill2,String Softskill3,
		String Jobtitle1,String Jobtitle2,String Jobtitle3,String Jobtitle4,
		String Jobtitle5,String Jobtitle6,String Jobtitle7,String Jobtitle8,
		String Jobtitle9,String Jobtitle10,String Jobtitle11, String CourseName) throws InterruptedException
	{
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
				page.click(Hardskill1);
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
				page.click(Hardskill2);
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
				page.click(Hardskill3);
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
				page.click(Hardskill4);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
		 page.click(hardSkills);
		 page.waitForLoadState();
		 if(page.isVisible("//label[text()='Electronic Engineering']"))
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
		 if(page.isVisible("//label[text()='Electronic Systems']"))
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
		 if(page.isVisible("//label[text()='Informatics Engineering']"))
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
		 if(page.isVisible("//label[text()='Information Privacy']"))
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
		 if(page.isVisible("//label[text()='Infrastructure Security']"))
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
		 if(page.isVisible("//label[text()='Network Engineering']"))
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
		 if(page.isVisible("//label[text()='Software Security']"))
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
				page.click(Hardskill12);
				Thread.sleep(500);
				page.click(saveHardSkillAndProceedButton);
			}
		 page.click(hardSkills);
		 page.waitForLoadState();
		 if(page.isVisible("//label[text()='Teaching']"))
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
		 if(page.isVisible("//label[text()='Telecommunications']"))
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
		 if(page.isVisible("//label[text()='TeleCommunications Engineering']"))
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
		 page.click(softSkills);
		 page.waitForLoadState();
		 if(page.isVisible("//div[text()='Management']"))
			{
				System.out.println("Softskill already exist");
			}	 
			else {			
			Thread.sleep(500);
			page.waitForSelector(addSoftSkillField).click();
			Thread.sleep(500);
			page.click(Softskill2);
			Thread.sleep(500);
			page.click(saveSoftSkillAndProceed);
			}
		 page.click(softSkills);
		 page.waitForLoadState();
		 if(page.isVisible("//div[text()='Vulnerability']"))
			{
				System.out.println("Softskill already exist");
			}	 
			else {			
			Thread.sleep(500);
			page.waitForSelector(addSoftSkillField).click();
			Thread.sleep(500);
			page.click(Softskill3);
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
		 } 				 		 
		
	@AfterSuite
    public void writeMessagesToExcel() {
      // Write all assertion failed messages to Excel
	 excelWriter.writeData("UniPolMasDegCybSec", assertionFailedMessages);
    }	 
 
}
