package Testing.Sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_OnExcel {

	public static void main(String[] args) throws Throwable {
		File f =new File("C:\\Users\\User\\eclipse-workspace\\TestNGPractice\\TestingExcel.xlsx");
		FileOutputStream fos =new FileOutputStream(f);
		
		Row NewRow = sheetAt.createRow(5);
		NewRow.createCell(0).setCellValue("Ajay");
		NewRow.createCell(1).setCellValue("@@@");
		wb.write(fos);
		wb.close();
	}

}
