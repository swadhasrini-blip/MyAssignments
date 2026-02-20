package week4;

public class LoginTestData extends TestData {
	
	void enterUsername()
	{
		System.out.println("This is LoginTestData class enterUsername method");
	}
	
	void enterPassword()
	{
		System.out.println("This is LoginTestData class enterPassword method");
	}
	
	

	public static void main(String[] args) {
		
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterPassword();
		ltd.enterUsername();
		ltd.navigateToHomePage();

	}

}
