public class CoreJavaBrushUp1 {

	public static void main(String[] args) {

		// Variables & Data types
		int myNum = 5;
		String website = "youtube";
		char letter = 'r';
		double dec = 7.99;
		boolean myCard = true;

		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard);

		// Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(arr[2]);

		// For loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		String[] name = { "Vishakha", "Patariya", "Selenium" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// For Each loop
		for (String s : name) {
			System.out.println(s);
		}
	}
}
