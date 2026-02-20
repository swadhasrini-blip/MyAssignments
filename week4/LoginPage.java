package week4;

 class basepage {

	void findElement() {
		System.out.println("This is findElement method");

	}

	void enterText() {
		System.out.println("This is enterText method");

	}

	void performCommonTasks() {
		System.out.println("This is baseclass performCommonTasks method");
	}

	void clickElement() {
		System.out.println("This is clickElement method");
	}

}

 public class LoginPage extends basepage {

	void performCommonTasks() {

		System.out.println("This is LoginPage performCommonTasks method");

	}

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.clickElement();
		lp.enterText();
		lp.findElement();
		lp.performCommonTasks();

	}

}