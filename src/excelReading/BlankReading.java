package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.examples.hssf.usermodel.CellTypes;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BlankReading {

	CellTypes blank;
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		
		File myFile= new File("D:\\Velocity\\Java Class\\9thApr Even\\myexcel.xlsx");
		
		Workbook mybook = WorkbookFactory.create(myFile);
		Sheet mySheet = mybook.getSheet("Sheet1");
		
		CellType type = mySheet.getRow(1).getCell(1).getCellType();

		
		if(CellType.BLANK==type)
		{
			System.out.println("Blank");
		}
		System.out.println("Cell type is "+type);
	}

}
