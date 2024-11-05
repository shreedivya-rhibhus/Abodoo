package com.qa.abodoo.testscript;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.qa.abodoo.commontests.CommonComponents;

import FetchToExcel.Becoming_Cybersecurity_Consultant_Coursera_Excel_Data;
import FetchToExcel.Becoming_A_Cybersecurity_Consultant_Excel_Data;
import FetchToExcel.FetchDataToExcel;
//For this script course should not visible
public class Becoming_Cybersecurity_Consultant_Coursera_Test extends BaseTest implements CommonComponents{
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

    @Test (priority=1,  dataProvider = "Abodoo", dataProviderClass = Becoming_Cybersecurity_Consultant_Coursera_Excel_Data.class)
    public void becomingCyberSecurityConsultaneCourseraTest(String Condition, String Hardskill1, String Hardskill2, 
    String Hardskill3, String Hardskill4, String Hardskill5, String Hardskill6, 
    String Hardskill7, String Hardskill8, String Hardskill9, String Hardskill10,
    String Hardskill11,String Hardskill12, String Hardskill13, String Hardskill14, 
    String Hardskill15, String Hardskill16, String Hardskill17, String Hardskill18,
    String Hardskill19, String Hardskill20, String Softskill1, String Softskill2, 
    String Softskill3, String Softskill4, String Softskill5, String Jobtitle1, 
    String Jobtitle2, String Jobtitle3, String Jobtitle4, String Jobtitle5, 
    String Jobtitle6, String Jobtitle7, String Jobtitle8, String Jobtitle9, 
    String Jobtitle10, String Jobtitle11, String Jobtitle12, String Jobtitle13, 
    String Jobtitle14, String Jobtitle15, String Jobtitle16, String Jobtitle17, 
    String Jobtitle18, String Jobtitle19, String Jobtitle20, String Jobtitle21,
    String Jobtitle22, String Jobtitle23, String Jobtitle24, String Jobtitle25, 
    String Jobtitle26, String Jobtitle27, String Jobtitle28, String Jobtitle29, 
    String Jobtitle30, String Jobtitle31, String Jobtitle32, String Jobtitle33,
    String Jobtitle34, String Jobtitle35, String Jobtitle36, String Jobtitle37,
    String Jobtitle38, String Jobtitle39, String Jobtitle40, String Jobtitle41, 
    String Jobtitle42, String Jobtitle43, String Jobtitle44, String Jobtitle45,
    String Jobtitle46, String Jobtitle47, String Jobtitle48, String Jobtitle49,
    String Jobtitle50, String Jobtitle51, String Jobtitle52, String Jobtitle53,
    String Jobtitle54, String Jobtitle55, String Jobtitle56, String Jobtitle57,
    String Jobtitle58, String Jobtitle59, String Jobtitle60, String Jobtitle61,
    String Jobtitle62, String CourseName) throws InterruptedException
   {  	
   	 page.click(hardSkills);
   	 page.waitForLoadState();
   	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Attack Surface Management']"))
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
	 if(page.isVisible("//label[text()='Computer Networks']"))
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
	 if(page.isVisible("//label[text()='Critical Thinking']"))
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
	 if(page.isVisible("//label[text()='Cyber Defense']"))
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
	 if(page.isVisible("//label[text()='Cyber Threat Intelligence']"))
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
	 if(page.isVisible("//label[text()='Economics']"))
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
			page.click(Hardskill8);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Information Technology']"))
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
	 if(page.isVisible("//label[text()='IT Infrastructure']"))
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
	 if(page.isVisible("//label[text()='Loyalty Programs']"))
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
			page.click(Hardskill12);
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
	 if(page.isVisible("//label[text()='Requirements Analysis']"))
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
	 if(page.isVisible("//label[text()='Risk Analysis']"))
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
			page.click(Hardskill16);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Security Controls']"))
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
	 if(page.isVisible("//label[text()='Threat Assessment']"))
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
	 if(page.isVisible("//label[text()='Vulnerability Assessments']"))
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
	 if(page.isVisible("//label[text()='Certified Information Systems Security Professional']"))
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
	 page.click(softSkills);
	 page.waitForLoadState();		
		if(page.isVisible("//div[text()='Accountability']"))
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
		 if(page.isVisible("//div[text()='Decision Making']"))
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
		 page.click(softSkills);
		 page.waitForLoadState();
		if(page.isVisible("//div[text()='Management']"))
		{
			System.out.println("Softskill already exist");
		}
		else {
			
			page.click(addSoftSkillField);
			Thread.sleep(500);
			page.click(Softskill3);
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
			page.click(Softskill4);
			Thread.sleep(500);
			page.click(saveSoftSkillAndProceed);
			Thread.sleep(500);	
		}
		 page.click(softSkills);
		 page.waitForLoadState();
		if(page.isVisible("//div[text()='Vulnerability']"))
		{
			System.out.println("Softskill already exist");
		}
		else {			
			page.click(addSoftSkillField);
			Thread.sleep(500);
			page.click(Softskill5);
			Thread.sleep(500);
			page.click(saveSoftSkillAndProceed);
			Thread.sleep(500);	
		}
		
		Thread.sleep(500);
		page.click(learningMenu);
		Thread.sleep(500);
		page.dblclick(allJobs);
		Thread.sleep(1500);
		String courseNameText = page.locator(CourseName).textContent();
		System.out.println(courseNameText);
		Thread.sleep(500);
		page.click(clearAll);
		Thread.sleep(2000);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
	    String jobtitletext1 = page.locator(Jobtitle1).textContent();
		page.click(Jobtitle1);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);		
		if (page.isVisible(CourseName)) {
        try{
        Assert.fail(courseNameText + " is visible");    
            }
		catch(AssertionError e) {
		    System.out.println("Assertion failed: " + e.getMessage());
		    assertionFailedMessages.add("Assertion failed:For Jobtitle " +" "+jobtitletext1+ " , " + e.getMessage());    
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
			    assertionFailedMessages.add("Assertion failed: For Job title" +" "+jobtitletext18+" , "+ e.getMessage());    
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
			    assertionFailedMessages.add("Assertion failed: For Job title" +" "+jobtitletext19+" , "+ e.getMessage());    
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
			    assertionFailedMessages.add("Assertion failed: For Job title" +" "+jobtitletext21+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext22 = page.locator(Jobtitle22).textContent();
		page.click(Jobtitle22);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext22+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext23 = page.locator(Jobtitle23).textContent();
		page.click(Jobtitle23);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext23+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext24 = page.locator(Jobtitle24).textContent();
		page.click(Jobtitle24);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext24+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext25 = page.locator(Jobtitle25).textContent();
		page.click(Jobtitle25);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext25+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext26 = page.locator(Jobtitle26).textContent();
		page.click(Jobtitle26);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext26+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext27 = page.locator(Jobtitle27).textContent();
		page.click(Jobtitle27);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext27+" , "+ e.getMessage());    
	        }
	    }	
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext28 = page.locator(Jobtitle28).textContent();
		page.click(Jobtitle28);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext28+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext29 = page.locator(Jobtitle29).textContent();
		page.click(Jobtitle29);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext29+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext30 = page.locator(Jobtitle30).textContent();
		page.click(Jobtitle30);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext30+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext31 = page.locator(Jobtitle31).textContent();
		page.click(Jobtitle31);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext31+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext32 = page.locator(Jobtitle32).textContent();
		page.click(Jobtitle32);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext32+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext33 = page.locator(Jobtitle33).textContent();
		page.click(Jobtitle33);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext33+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext34 = page.locator(Jobtitle34).textContent();
		page.click(Jobtitle34);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext34+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext35 = page.locator(Jobtitle35).textContent();
		page.click(Jobtitle35);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext35+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext36 = page.locator(Jobtitle36).textContent();
		page.click(Jobtitle36);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext36+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext37 = page.locator(Jobtitle37).textContent();
		page.click(Jobtitle37);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext37+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext38 = page.locator(Jobtitle38).textContent();
		page.click(Jobtitle38);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext38+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext39 = page.locator(Jobtitle39).textContent();
		page.click(Jobtitle39);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext39+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext40 = page.locator(Jobtitle40).textContent();
		page.click(Jobtitle40);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext40+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext41 = page.locator(Jobtitle41).textContent();
		page.click(Jobtitle41);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext41+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext42 = page.locator(Jobtitle42).textContent();
		page.click(Jobtitle42);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext42+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext43 = page.locator(Jobtitle43).textContent();
		page.click(Jobtitle43);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext43+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext44 = page.locator(Jobtitle44).textContent();
		page.click(Jobtitle44);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext44+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext45 = page.locator(Jobtitle45).textContent();
		page.click(Jobtitle45);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext45+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext46 = page.locator(Jobtitle46).textContent();
		page.click(Jobtitle46);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext46+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext47 = page.locator(Jobtitle47).textContent();
		page.click(Jobtitle47);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext47+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext48 = page.locator(Jobtitle48).textContent();
		page.click(Jobtitle48);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext48+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext49 = page.locator(Jobtitle49).textContent();
		page.click(Jobtitle49);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext49+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext50 = page.locator(Jobtitle50).textContent();
		page.click(Jobtitle50);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext50+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext51 = page.locator(Jobtitle51).textContent();
		page.click(Jobtitle51);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext51+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext52 = page.locator(Jobtitle52).textContent();
		page.click(Jobtitle52);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext52+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext53 = page.locator(Jobtitle53).textContent();
		page.click(Jobtitle53);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext53+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext54 = page.locator(Jobtitle54).textContent();
		page.click(Jobtitle54);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext54+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext55 = page.locator(Jobtitle55).textContent();
		page.click(Jobtitle55);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext55+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext56 = page.locator(Jobtitle56).textContent();
		page.click(Jobtitle56);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext56+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext57 = page.locator(Jobtitle57).textContent();
		page.click(Jobtitle57);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext57+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext58 = page.locator(Jobtitle58).textContent();
		page.click(Jobtitle58);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext58+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext59 = page.locator(Jobtitle59).textContent();
		page.click(Jobtitle59);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext59+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext60 = page.locator(Jobtitle60).textContent();
		page.click(Jobtitle60);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext60+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext61 = page.locator(Jobtitle61).textContent();
		page.click(Jobtitle61);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext61+" , "+ e.getMessage());    
	        }
	    }	
		
		page.click(clearAll);
		page.click(addDesiredJobTitleButton);
		page.click(addJobTitleField);
		String jobtitletext62 = page.locator(Jobtitle62).textContent();
		page.click(Jobtitle62);
		page.click(saveDesiredJobTitleButton);
		page.click(matched);
		Thread.sleep(2000);
		if (page.isVisible(CourseName)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
			    assertionFailedMessages.add("Assertion failed: For Job title, " +" "+jobtitletext62+" , "+ e.getMessage());    
	        }
	    }	
 }  
    @AfterSuite
    public void writeMessagesToExcelTest() {
        // Write all assertion failed messages to Excel
	 excelWriter.writeData("BCCC2", assertionFailedMessages);
    } 
}

