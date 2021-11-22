package Testing.Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.functors.WhileClosure;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.UsernameAndPassword;

public class dataDriven {
	static	List  <String>usernamelist = new ArrayList<String>();
	static	List<String>passwordlist = new ArrayList<String>();
		
	
	public void reading() throws Throwable {
		

		File f =new File("C:\\Users\\User\\eclipse-workspace\\MavenSample1\\src\\test\\java\\Testing\\Sample\\TestingExcel.xlsx"); 
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Iterator<Row> rowsize = sheetAt.iterator();
		while (rowsize.hasNext()) {
			Row row = (Row) rowsize.next();
			 Iterator<Cell> column = row.iterator();
			 int i =2;
			 while(column.hasNext()) {
				 if(i%2==0){
					 usernamelist.add(column.next().getStringCellValue());
					 
				 }else {
					 passwordlist.add(column.next().getStringCellValue());
				 }
				 i++;
			 }
		}

			 }

		public static void main(String[] args) throws Throwable {
			dataDriven data=new dataDriven();
			data.reading();
			System.out.println(" user namesare "+  usernamelist  );
			System.out.println(" passwords are " +  passwordlist);

				
				

				
			}
	}



