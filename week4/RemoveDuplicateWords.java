package week4;

import java.util.Arrays;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] textArr = text.split(" ");
		System.out.println(Arrays.toString(textArr));

		for (int i = 0; i < textArr.length - 1; i++) {

			for (int j = i + 1; j < textArr.length; j++) {

				if (textArr[i].equalsIgnoreCase(textArr[j])) {
					
					textArr[j] = "";
				}

			}

		}
		System.out.println(Arrays.toString(textArr));

	}

}
