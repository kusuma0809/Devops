package Dev_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Dev_java.App;

public class Apptest {
	@Test
	public void testLogin1 ()
	{
		App myapp=new App();
			Assert.assertEquals(1,myapp.userLogin("abc","ab123"));
		}
	@Test
public void testLogin2 ()
		{
			App myapp2=new App();
			Assert.assertEquals(1, myapp2.userLogin("abc","ab123"));
	}

}
