package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void tc01() {
		Reporter.log("hello java", true);
	}

}
