package week3.day1HomeAssignments;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks() {
		System.out.println("Performing the common tasks 2");
		super.performCommonTasks();
	}
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
		
	}

}
