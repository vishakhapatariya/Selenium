import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		// Conditional statements
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 150 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;
			} else {
				System.out.println(arr[i] + " is not multiple of 2");
			}
		}

		// ArrayList
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vishakha");
		al.add("Patariya");
		al.add("Selenium");
		System.out.println(al.get(2));
		al.remove(1);
		System.out.println(al.get(1));

		// print ArrayList
		System.out.println("Printing ArrayList");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("Printing ArrayList using forEach loop");
		for (String a : al) {
			System.out.println(a);
		}

		// Item is present in ArrayList
		System.out.println(al.contains("Vishakha"));

		// Converting Array to ArrayList
		String[] name = { "Good", "Morning" };
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Morning"));
	}
}
