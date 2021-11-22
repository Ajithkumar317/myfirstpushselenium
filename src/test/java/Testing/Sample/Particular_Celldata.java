package Testing.Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Celldata {

	public static void main(String[] args) throws Throwable {
		File f =new File("C:\\Users\\User\\eclipse-workspace\\TestNGPractice\\TestingExcel.xlsx"); 
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(" The Particular Cell Value Is " + cell);
		FileOutputStream fos= new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\TestNGPractice\\TestingExcel.xlsx");
		Row NewRow = sheetAt.createRow(5);
		NewRow.createCell(0).setCellValue("Ajay");
		NewRow.createCell(1).setCellValue("@@@");
		wb.write(fos);
		wb.close();
	}

}
