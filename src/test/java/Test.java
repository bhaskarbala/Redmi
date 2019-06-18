import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String pathDataZoho="./TestData/ZohoCrmTestCase.xlsx";
		FileInputStream fis=new FileInputStream(pathDataZoho);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Sheet2");
		Object [][] datatype=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				datatype[i][k]=sheet.getRow(i+1).getCell(k).toString();
				System.out.println(datatype[i][k]);
			
				
			}
			
			}
		

	}

}
