package week1.day1;

public class Palindrome {

	public static void main(String[] args) {

		int number = 121;
		int reverse = 0;
		int original = number;

		while (number > 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;

		}

		if (reverse == original)
			System.out.println(reverse + " is a palindrome number");
		else
			System.out.println(reverse + " is not a palindrome number");

	}

}
