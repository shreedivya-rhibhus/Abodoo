package com.qa.abodoo.testscript;

	import java.util.ArrayList;
	import java.util.List;

	import org.testng.Assert;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;

	import FetchToExcel.Becoming_A_Cybersecurity_Consultant_Excel_Data;
	import FetchToExcel.FetchDataToExcel;

	public class SampleTest extends BaseTest {
		
		public ExtentReports extent;
		 String addHardSkillIcon = "//img[@src='/_next/static/media/plusIconWhite.a05ddce9.svg']";
		 String addHardSkillField = "//input[@placeholder='Start typing here']";
		 String addHardSkillButton = "//button[text()='Add Skills']";
		 String softSkills = "(//span[text()='Soft Skills'])[2]";
		 String addSoftSkillField = "//input[@placeholder='Start typing here']";
		 String saveSoftSkill = "//button[text()='Save']";
		
		 String clearAll = "//button[text()='Clear all']";
		 String learningMenu = "(//a[@href='/learning'])[1]";
		 String addDesiredJobTitleButton = "//button[@class='btn btn-light ']";
		 String addJobTitleField = "//input[@class='experience_input_field']";
		 String saveDesiredJobTitleButton = "//button[text()='Add Skills']";
		 String matched = "//button[text()='Matched']";
		 String courseNameExpected = "Becoming a Cybersecurity Consultant";

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
		public void course2Test(String Condition , String HS1 ,String Hardskill1, String Hardskill2 ,String HS2, 
				String Hardskill3 ,String HS3, String Hardskill4 ,String HS4, String Hardskill5 , 
				String HS5,	String Hardskill6 ,String HS6, String Softskill1 , String Softskill2 ,
				String Softskill3 , String Jobtitle1 , String Jobtitle2 ,
				String Jobtitle3 , String Jobtitle4 , String Jobtitle5 , String Course) throws InterruptedException {
			 int i=1;
			 String skillIdentifier = "HS" + i;
			 
			 for ( i = 1; i <= 6; i++) {
				    
				    System.out.println(skillIdentifier);
				    if (page.isVisible(skillIdentifier)) {
				        System.out.println("HardSkill " + skillIdentifier + " already exists");
				    } else {
				        try {
				        	System.out.println("Hardskill not exist");
				            Thread.sleep(1000);
				            page.click(addHardSkillIcon);
				            Thread.sleep(500);
				            page.click(addHardSkillField);
				            Thread.sleep(1000);

				            // Inner loop for clicking on "Hardskill1", "Hardskill2", etc.
				            for (int j = 1; j <= 1; j++) { // Inner loop runs only once
				                String hardskillXPath = "Hardskill" + j;
				                System.out.println(hardskillXPath);
				                Thread.sleep(5000);				             
				                page.click(hardskillXPath); // Clicking on "Hardskill" + j
				            }

				            Thread.sleep(500);
				            page.click(addHardSkillButton);
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
				    }
				}

			 
			 
			 
			 
			 
			 
				if(page.isVisible("//div[text()='Communications']"))
			{
				System.out.println("Softskill already exist");
			}
			else {
				
				page.click(addSoftSkillField);
				Thread.sleep(500);
				page.click(Softskill1);
				Thread.sleep(500);
				page.click(saveSoftSkill);
				Thread.sleep(500);	
			}
			
			if(page.isVisible("//div[text()='Innovation']"))
			{
				System.out.println("Softskill already exist");
			}
			else {
			page.click(addSoftSkillField);
			page.click(Softskill2);
			page.click(saveSoftSkill);
			}
			if(page.isVisible("//div[text()='Management']"))
			{
				System.out.println("Softskill already exist");
			}
			else {
			page.click(addSoftSkillField);
			page.click(Softskill3);
			page.click(saveSoftSkill);
			}
		
			Thread.sleep(500);
			page.click(learningMenu);
			Thread.sleep(500);
			String courseNameText = page.locator(Course).textContent();
			System.out.println(courseNameText);
			Thread.sleep(500);
			page.click(clearAll);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			page.click(Jobtitle1);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			
			if (page.isVisible(Course)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
			    System.out.println("Assertion failed: " + e.getMessage());
				   String jobtitletext = page.locator(Jobtitle1).textContent();
				   assertionFailedMessages.add("Assertion failed: " +" "+jobtitletext+" "+ e.getMessage());    
	        }
	    }
			page.click(clearAll);
			page.click(learningMenu);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			page.click(Jobtitle2);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			
			if (page.isVisible(Course)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
				String jobtitletext = page.locator(Jobtitle1).textContent();
				  assertionFailedMessages.add("Assertion failed: " +" "+jobtitletext+" "+ e.getMessage());    
	      }
		}    
		 	page.click(clearAll);
			page.click(learningMenu);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			page.click(Jobtitle3);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			
			if (page.isVisible(Course)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
				String jobtitletext = page.locator(Jobtitle1).textContent();
				assertionFailedMessages.add("Assertion failed: " +" "+jobtitletext+" "+ e.getMessage());    
	    }  
	 } 
			page.click(clearAll);
			page.click(learningMenu);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			page.click(Jobtitle4);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			
			if (page.isVisible(Course)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
				String jobtitletext = page.locator(Jobtitle1).textContent();
	   		    assertionFailedMessages.add("Assertion failed: " +" "+jobtitletext+" "+ e.getMessage());    
	    	}  
	 }        
			page.click(clearAll);
			page.click(learningMenu);
			page.click(addDesiredJobTitleButton);
			page.click(addJobTitleField);
			page.click(Jobtitle5);
			page.click(saveDesiredJobTitleButton);
			page.click(matched);
			Thread.sleep(2000);
			
			if (page.isVisible(Course)) {
	        try{
	        Assert.fail(courseNameText + " is visible");    
	            }
	 	
			catch(AssertionError e) {
				String jobtitletext = page.locator(Jobtitle1).textContent();
				assertionFailedMessages.add("Assertion failed: " +" "+jobtitletext+" "+ e.getMessage());    
	    }  
	 }        
		}
		 @AfterSuite
		    public void writeMessagesToExcel() {
		        // Write all assertion failed messages to Excel
			 excelWriter.writeData("Course2", assertionFailedMessages);
		    } 
	}
		 


