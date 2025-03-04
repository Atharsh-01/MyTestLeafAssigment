package day7HA;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter your UserName");
		
	}
	public void enterPassword() {
		System.out.println("Enter your Password");
		
	}
	public static void main(String[] args) {
		LoginTestData l=new LoginTestData();
		l.navigateToHomePage();
		l.enterCredentials();
		l.enterUsername();
		l.enterPassword();
	}

}
