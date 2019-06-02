import com.util.Lib.redmi.DataHandler;

public class Prac {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		DataHandler data=new DataHandler();
		String da=data.getDataForExcelFile("MyTestCase", 15, 1);
		System.out.println(da);
		
		

	}

}
