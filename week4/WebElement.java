package week4;

class WebElement {

	public void click() {
		System.out.println("This is webelement class click method");
	}

	public void setText(String text) {
		System.out.println("This is webelement class setText method with text:" + text);

	}

}

class Button extends WebElement {
	void submit() {
		System.out.println("This is Button class submit method");
	}

}

class TextField extends WebElement {
	void getText() {
		System.out.println("This is TextField class getText method");
	}
}

class CheckBoxButton extends Button {
	void clickCheckButton() {
		System.out.println("This is CheckBoxButton class clickCheckButton method");
	}
}

class RadioButton extends Button {
	void selectRadioButton() {
		System.out.println("This is RadioButton class selectRadioButton method");
	}
}


