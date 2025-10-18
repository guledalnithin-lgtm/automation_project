package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Nithin
 */
public class ExcelUtility {
	
	/**
	 * This method is used to read string data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName, int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	}
	
	/**
	 * This method is used to read boolean data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getBooleanCellValue();
	}
	
	/**
	 * This method is used to read numeric data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumberDataFromExcel(String sheetName, int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
	}
	
	/**
	 * This method is used to read date and time from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getDateAndTimeFromExcel(String sheetName, int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getLocalDateTimeCellValue();
	}

}
