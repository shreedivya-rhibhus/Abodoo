package com.qa.abodoo.testscript;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Listeners;

import com.microsoft.playwright.Browser;
	import com.microsoft.playwright.BrowserType;
	import com.microsoft.playwright.Page;
	import com.microsoft.playwright.Playwright;
	import com.qa.abodoo.listeners.TestReport;
	@Listeners(TestReport.class)

	public class BaseTest {
		
		public static Page page;
		public static Browser browser;
		static String url = "https://testing-d-academy-frontend.azurewebsites.net";
		static String username = "//input[@name='username']";
		static String password = "//input[@name='password']";
		static String loginButton = "//button[text()='Log In']";
		static String myPassport = "(//a[text()='My Passport'])[1]";
		static List<String> hardSkillXPaths = new ArrayList<>();

		public static Page launchBrowser() throws InterruptedException{
		Playwright playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
	     page = browser.newPage();
	     page.navigate(url);
	     page.fill(username, "nummummaummigi-3584@yopmail.com");
	     page.fill(password, "Chirag@1234");
	     page.click(loginButton);
	     Thread.sleep(3000);
	     page.click(myPassport);
	     return page;	     
		}
	     
	
	public void closeBrowser() {
		page.close();
	}
}
//		 for (int i = 1; i <= n; i++) {
//	            hardSkillXPaths.add("(//label[@class='card-title'])[" + i + "]");
//	        }
//
//	        // Get text from elements
//	        List<String> hardSkillTexts = new ArrayList<>();
//	        for (String xpath : hardSkillXPaths) {
//	            hardSkillTexts.add(page.textContent(xpath));
//	        }
//
//	        // Write text to Excel
//	        writeToExcel(hardSkillTexts);
//
////	        return page;
//	    }
//		
//	public static void closeBrowser() {
//		browser.close();
//	}
//		
//	    private static void writeToExcel(List<String> hardSkillTexts) {
//	        String excelFilePath = "C:\\Users\\Rhibhus\\eclipse-workspace\\Abodoo\\src\\main\\java\\excel\\HardSkills.xlsx";
//	        try (Workbook workbook = new XSSFWorkbook(); 
//	        	FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
//	            Sheet sheet = workbook.createSheet("Data");
//
//	            // Create header row
//	            Row headerRow = sheet.createRow(0);
//	            for (int i = 0; i < hardSkillTexts.size(); i++) {
//	                headerRow.createCell(i).setCellValue("Hard Skill " + (i + 1));
//	            }
//
//	            // Create data row
//	            Row row = sheet.createRow(1);
//	            for (int i = 0; i < hardSkillTexts.size(); i++) {
//	                row.createCell(i).setCellValue(hardSkillTexts.get(i));
//	            }
//
//	            workbook.write(outputStream);
//	            System.out.println("Data has been written to Excel successfully!");
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
	

