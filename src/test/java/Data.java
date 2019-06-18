import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {

	public static Object[][] getdatatest(String sheetname) throws Exception {
		// TODO Auto-generated method stub
		//String filepath="C:\\Users\\NBhaskar\\eclipse-workspace\\New folder\\Redmi\\TestData\\ZohoCrmTestCase.xlsx";
		String pathDataZoho="./TestData/ZohoCrmTestCase.xlsx";
		FileInputStream fis=new FileInputStream(pathDataZoho);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet(sheetname);
		Object [][] datatype=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				datatype[i][k]=sheet.getRow(i+1).getCell(k).toString();
				
			}
			
			}
		return datatype;
		
		/*System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum()-1);
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			for(int k=0; k<=sheet.getRow(0).getLastCellNum()-1;k++) {
				//data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				System.out.println(sheet.getRow(i).getCell(k));
			}
			}
		
		*/
		
		
	}

}
