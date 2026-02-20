package week4;

public class Elements extends Button{

	public static void main(String[] args) {
		Elements obj = new Elements();

        obj.click();       
        obj.setText("Hello");
        obj.submit();       

        CheckBoxButton cb = new CheckBoxButton();
        cb.clickCheckButton();

        RadioButton rb = new RadioButton();
        rb.selectRadioButton();

        TextField tf = new TextField();
       tf.getText();

	}

}
