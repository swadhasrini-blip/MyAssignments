package week4;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {

		int a[] = { 11, 13, 12, 15 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (a[i + 1] != a[i] + 1) {
				System.out.println("Missing: " + (a[i] + 1));
				break;
			}

		}

	}
}
