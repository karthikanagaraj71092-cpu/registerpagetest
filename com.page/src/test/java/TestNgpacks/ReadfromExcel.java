package TestNgpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadfromExcel {

	public static void main(String[] args) throws IOException {

		String filloc = "C:\\Users\\vrkka\\eclipse-workspace\\com.page\\src\\Login Details.xlsx"; 
		XSSFWorkbook wbook = new XSSFWorkbook(filloc);
		XSSFSheet esheet = wbook.getSheetAt(0);
		
		  XSSFRow row = esheet.getRow(3);
		  XSSFCell cell = row.getCell(0);
		 String stringCellValue = cell.getStringCellValue();
		if(stringCellValue.equalsIgnoreCase("chandrukan@rediff.com")) {
			cell.setCellValue("karthik@gmail.com");
		}
		System.out.println(stringCellValue);
		FileOutputStream out = new FileOutputStream(filloc);
		wbook.write(out);
		System.out.println("Changed the Existing Row");
		
	}	
		
		
		
		
		/*for (int i = 1; i <= 2; i++) {
			XSSFRow row = esheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
wbook.close();
	}
*/
}
