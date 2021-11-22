package Testing.Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven2 {

	public static void main(String[] args) throws Throwable {
		File f =new File("C:\\Users\\User\\eclipse-workspace\\TestNGPractice\\src\\test\\java\\Testing\\Sample\\TestingExcel.xlsx"); 
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
			int cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j<cellsize; j++) {
				Cell cell = row.getCell(j);
				 CellType cellType = cell.getCellType();
				 if (cellType.equals(CellType.STRING)) {
					 String stringCellValue = cell.getStringCellValue();
					 System.out.println(stringCellValue);
					
				}
				 else if( cellType.equals(CellType.NUMERIC)) {
					 String value = cell.getStringCellValue();
					 System.out.println( value);
					
				}
				}
			}
		}
	}


