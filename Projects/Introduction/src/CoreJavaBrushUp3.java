public class CoreJavaBrushUp3 {

	public static void main(String[] args) {

		// String

		// creates only one object
		String s1 = "Hello";
		String s2 = "Hello";

		// creates two objects
		String s3 = new String("World");
		String s4 = new String("World");

		String s = "Hello Vishakha Patariya";

		// split method
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);

		// trim method
		String[] splittedString2 = s.split("Vishakha");
		System.out.println(splittedString2[0]);
		System.out.println(splittedString2[1]);
		System.out.println(splittedString2[1].trim());

		// Iterate through String
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		// Reverse String
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
