package JavaPrograms;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class WorkingExcel {

	public static void main(String[] args) throws IOException {

		try {  // start
		FileInputStream file = new FileInputStream("C:\\Users\\prave\\OneDrive\\Desktop\\Praveen.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sheet = wb.getSheet("Sheet1");

		int RC = sheet.getLastRowNum();
		int CC = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= RC; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			for (int j = 0; j <= CC; j++) {
				System.out.println(currentRow.getCell(j));
			}//inner
		}//outer
		}  //end
		 catch (FileNotFoundException e) {
			System.out.println("Excel not found so script got failed");
			
		}
			
		}
				
	}
