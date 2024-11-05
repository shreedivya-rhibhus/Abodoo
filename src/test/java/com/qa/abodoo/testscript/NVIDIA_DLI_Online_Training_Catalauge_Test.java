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
import FetchToExcel.NVIDIA_DLI_Online_Training_Catalauge_Excel_Data;
//for this script course should display
public class NVIDIA_DLI_Online_Training_Catalauge_Test extends BaseTest implements CommonComponents{
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

   @Test (priority=1,  dataProvider = "Abodoo", dataProviderClass = NVIDIA_DLI_Online_Training_Catalauge_Excel_Data.class)
   public void becomingCyberSecurityConsultaneCourseraTest(String Condition, String Hardskill1, String Hardskill2, 
   String Hardskill3, String Hardskill4, String Hardskill5, String Hardskill6, 
   String Hardskill7, String Hardskill8, String Hardskill9, String Hardskill10,
   String Hardskill11,String Hardskill12, String Hardskill13, String Hardskill14, 
   String Hardskill15, String Hardskill16, String Hardskill17, String Hardskill18,
   String Hardskill19, String Hardskill20, String Hardskill21,String Hardskill22,String Hardskill23,
   String Hardskill24,String Hardskill25,String Hardskill26,String Softskill1, String Jobtitle1, 
   String Jobtitle2, String Jobtitle3, String Jobtitle4, String Jobtitle5, 
   String Jobtitle6, String Jobtitle7, String Jobtitle8, String Jobtitle9, 
   String Jobtitle10, String Jobtitle11, String Jobtitle12, String Jobtitle13, 
   String Jobtitle14, String Jobtitle15, String CourseName) throws InterruptedException
  {  	
  	 page.click(hardSkills);
  	 page.waitForLoadState();
	 page.hover("(//div[@class=' card w-100 mb-3 d-flex justify-content-center'])[10]");
	 if(page.isVisible("//label[text()='Application Programming Interface (API)']"))
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
	 if(page.isVisible("//label[text()='Artificial Intelligence']"))
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
	 if(page.isVisible("//label[text()='Big Data']"))
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
			page.click(Hardskill4);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='C++ (Programming Language)']"))
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
	 if(page.isVisible("//label[text()='Cloud Computing']"))
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
			page.click(Hardskill7);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Data Science']"))
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
	 if(page.isVisible("//label[text()='Dataframe']"))
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
	 if(page.isVisible("//label[text()='Deep Learning']"))
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
			page.click(Hardskill11);
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
			page.click(Hardskill12);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Emerging Technologies']"))
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
	 if(page.isVisible("//label[text()='High Performance Computing']"))
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
	 if(page.isVisible("//label[text()='Image Segmentation']"))
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
			page.click(Hardskill16);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Linux']"))
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
	 if(page.isVisible("//label[text()='Machine Learning']"))
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
	 if(page.isVisible("//label[text()='Network Planning And Design']"))
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
	 if(page.isVisible("//label[text()='Nvidia CUDA']"))
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
			page.click(Hardskill21);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Python (Programming Language)']"))
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
			page.click(Hardskill23);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Satellite Imagery']"))
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
	 page.click(hardSkills);
	 page.waitForLoadState();
	 if(page.isVisible("//label[text()='Text Classification']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
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
	 if(page.isVisible("//label[text()='Workflow Management']"))
		{
		System.out.println("HardSkill already exist");
		}
		else {
			Thread.sleep(1000);
			page.click(addHardSkillIcon);
			Thread.sleep(500);
			page.click(addHardSkillField);
			Thread.sleep(500);
			page.click(Hardskill26);
			Thread.sleep(500);
			page.click(saveHardSkillAndProceedButton);
		}
	 
	 page.click(softSkills);
		Thread.sleep(500);
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
  }
   @AfterSuite
   public void writeMessagesToExcelTest() {
       // Write all assertion failed messages to Excel
	 excelWriter.writeData("NVIDIA_DLI_Online_Training_Cata", assertionFailedMessages);
   } 	
}
