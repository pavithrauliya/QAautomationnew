package Com.excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutility {
public static String getTestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
	
	// create file
	
	File file= new File("");
	//Create book
	XSSFWorkbook book= new XSSFWorkbook(file);
	
	//create sheet
Sheet sheet=	book.getSheetAt(0);
	// create row and cell number

return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
}	

}