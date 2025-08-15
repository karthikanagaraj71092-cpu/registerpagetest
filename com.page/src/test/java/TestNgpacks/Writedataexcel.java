package TestNgpacks;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedataexcel {
	
	public static void main(String[] args) throws IOException {
		
		String fileloc ="C:\\Users\\vrkka\\eclipse-workspace\\com.page\\src\\Login-data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileloc);
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int lastRow = sheet.getLastRowNum();
		System.out.println("No.of row count :"+lastRow);
		int physicalRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Inclusive Header: "+physicalRows);
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("No of colunm count "+lastCellNum);
		
		for (int i = 0; i <=lastRow; i++) {
			XSSFRow row = sheet.getRow(i);
			
			
			
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				//read all types of data
			//	DataFormatter dft = new DataFormatter();
			//	String formatCellValue = dft.formatCellValue(cell);
				

				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
		wbook.close();
		
		
	}

}
