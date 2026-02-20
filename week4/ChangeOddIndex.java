package week4;

import java.util.Arrays;

public class ChangeOddIndex {

	public static void main(String[] args) {

		String original = "changeme";
		String finalString = "";
		char[] originalArr = original.toCharArray();
		System.out.println(Arrays.toString(originalArr));

		for (int i = 0; i < originalArr.length; i++) {
			if (i % 2 != 0) {
				finalString = finalString + String.valueOf(originalArr[i]).toUpperCase();

			} else {
				finalString = finalString + String.valueOf(originalArr[i]);
			}
		}
		System.out.println(finalString);
	}

}
