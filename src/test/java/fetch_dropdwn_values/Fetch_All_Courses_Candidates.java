package fetch_dropdwn_values;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetch_All_Courses_Candidates {

	public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
	 WebDriverManager.chromedriver().setup();
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to your webpage
        driver.get("https://testing-d-academy-frontend.azurewebsites.net/candidateLogin");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jeiyeiralebroi-4120@yopmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anish@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[@href='/learning'])[1]")).click();
        Thread.sleep(5000);
      driver.findElement(By.xpath("//button[text()='All']")).click();
      WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
       List<WebElement> optionsinDropdown=  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='home_page__learning__course__card']")));
       Thread.sleep(2000);
        
 //       List<WebElement> optionsinDropdown = driver.findElements(By.xpath("//div[@class=' css-j9ez5e']/div/div/div"));
        // Fetch the dropdown options	       
        System.out.println("Dropdown Options:" +  optionsinDropdown);
        for (WebElement option : optionsinDropdown) {
            String optionText = option.getText();
  //          System.out.println(optionText);
        }
        
     // Create a new Excel workbook and sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("All Courses");
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Option Value");

        // Write options to Excel sheet
        for (int i = 0; i < optionsinDropdown.size(); i++) {
            Row row = sheet.createRow(i + 1);
            String optionText = optionsinDropdown.get(i).getText();
            row.createCell(0).setCellValue(optionText);
            System.out.println(optionText);
        }

        // Save workbook to a file
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Rhibhus\\eclipse-workspace\\Abodoo\\src\\test\\java\\fetch_dropdwn_values\\DropdownOptions.xlsx")) {
            workbook.write(fos);
        }

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
}
}
