package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		
		File myFile= new File("D:\\Velocity\\Java Class\\9thApr Even\\myexcel.xlsx");
		
		Workbook mybook = WorkbookFactory.create(myFile);
		Sheet mySheet = mybook.getSheet("Sheet1");
		
		int totalRows = mySheet.getLastRowNum()+1;
		System.out.println("Total rows are "+totalRows);
		
		short lastcell = mySheet.getRow(0).getLastCellNum();
		System.out.println("Total cells are "+lastcell);

		
		CellType type = mySheet.getRow(0).getCell(1).getCellType();
		System.out.println("Cell type is "+type);
		
		String myValue = mySheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data is "+myValue);
	}

}
