package Dev_test;

import org.testng.Assert;

import Dev_java.App;

public class Apptest {
	public void testLogin1 ()
	{
		App myapp=new App();
			Assert.assertEquals(0,myapp.userLogin("abc","ab123"));
		}
public void testLogin2 ()
		{
			App myapp2=new App();
			Assert.assertEquals(1, myapp2.userLogin("abc","ab123"));
	}

}
