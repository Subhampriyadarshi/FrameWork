
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingToExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	 //get the java representative object of the physical file	
     FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
     //create the workbook or open the excel in read mode
     Workbook wb=WorkbookFactory.create(fis);
     //get the control of the sheet,then row,then cell and type the data   
     wb.getSheet("CreateCustomer").getRow(2).getCell(4).setCellValue("pass");
     //get the physical file of the java representative object
     FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
     //save the workbook or open the excel in write mode
     wb.write(fos);
     //close the workbook
     wb.close();
	}

}
