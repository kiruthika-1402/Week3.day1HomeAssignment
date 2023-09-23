package week3.day1HomeAssignments;
        
       // Child class

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		
		System.out.println("Username : Kiruthika");
	}
	
	public void password() {
		
		System.out.println("Password : kl@123");

	}

	public static void main(String[] args) {
		
		LoginTestData ltd = new LoginTestData();
		
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterUsername();
		ltd.password();

         

	}

}
