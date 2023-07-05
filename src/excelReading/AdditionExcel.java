package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AdditionExcel {

	static double myvalue=0;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile= new File("D:\\Velocity\\Java Class\\9thApr Even\\myexcel.xlsx");
		
		Workbook mybook = WorkbookFactory.create(myFile);
		Sheet mySheet = mybook.getSheet("Sheet1");

		//outer --> for rows 0-->4
		for(int i=0;i<=4;i++)
		{
			//inner --> cells--> fix 1
			Cell mycell = mySheet.getRow(i).getCell(0);
			
			if(mycell.getCellType()==CellType.NUMERIC)
			{
				myvalue=myvalue+ mycell.getNumericCellValue();//123,456
					
			}
			
		}
		System.out.println(myvalue);
		
		
	}

}
