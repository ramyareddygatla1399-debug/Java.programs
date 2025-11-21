package selenium_codes;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_data_into_excel 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Excel_Testdata\\write_data.xlsx");	
		XSSFWorkbook book = new XSSFWorkbook();
		
		  XSSFSheet sheet= book.createSheet("Data");
		  
		  XSSFRow row1 = sheet.createRow(0);
		   row1.createCell(0).setCellValue("Java");
		   row1.createCell(1).setCellValue(10);
		   row1.createCell(2).setCellValue("Java_Automation");
		   
		   XSSFRow row2 = sheet.createRow(1);
		   row2.createCell(0).setCellValue("Python");
		   row2.createCell(1).setCellValue(5);
		   row2.createCell(2).setCellValue("Python_Automation");
		  
		   XSSFRow row3 = sheet.createRow(2);
		   row3.createCell(0).setCellValue("C#");
		   row3.createCell(1).setCellValue(8);
		   row3.createCell(2).setCellValue("C#_Automation");
		  
		
            book.write(file);
            book.close();
            file.close();
            
            System.out.println("file created successfully....");
	}

}
