package FetchToExcel;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class FetchDataToExcel {
		
		
	    private String filePath;
	    private int rowIndex = 0; // Initialize rowIndex
	    private int columnIndex = 0; // Initialize columnIndex
	    
	    public FetchDataToExcel(String filePath) {
	        this.filePath = filePath;
	    }

	    public void writeData(String sheetName,/* int rowIndex, int columnIndex, */List<String> assertionFailedMessages) {
	        try {
	            FileInputStream inputStream = new FileInputStream(new File(filePath));
	            Workbook workbook = new XSSFWorkbook(inputStream);
	            Sheet sheet = workbook.getSheet(sheetName);

	            if (sheet == null) {
	                sheet = workbook.createSheet(sheetName);
	            }
	            for (int i = 0; i < assertionFailedMessages.size(); i++) {
	                Row row = sheet.createRow(i); // Create a new row for each message
	                Cell cell = row.createCell(0); // Create a cell in the first column
	                cell.setCellValue(assertionFailedMessages.get(i)); // Set the message as cell value
	            }

//	            Row row = sheet.getRow(rowIndex);
//	            if (row == null) {
//	                row = sheet.createRow(rowIndex);
//	            }
//	            
//
//	            Cell cell = row.getCell(columnIndex);
//	            if (cell != null && !cell.toString().isEmpty()) {
//	                columnIndex = row.getLastCellNum(); // Get the index of the last cell in the row
//	                cell = row.createCell(columnIndex); // Create a new cell at the end of the row
//	            }
//	            rowIndex++;
//	  //          columnIndex++;
	            FileOutputStream outputStream = new FileOutputStream(filePath);
	            workbook.write(outputStream);
	            workbook.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


