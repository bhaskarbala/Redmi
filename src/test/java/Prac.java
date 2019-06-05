import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.util.Lib.redmi.Setup;
@Listeners(com.util.Lib.redmi.ListernerImp.class)
public class Prac extends Setup {
@Test
	public static void loginmethods() {
		System.out.println("TestCAsePAssed");
		System.out.println(20/0);
		
	}

}
