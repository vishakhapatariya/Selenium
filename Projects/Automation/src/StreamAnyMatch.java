import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamAnyMatch {

	public static void main(String[] args) {

		// Merge two ArrayList and Sort it
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("Man");
		name1.add("Women");
		
		List<String> name2 = Arrays.asList("Amika","Krishna","Alekhya","Adam","Ram");
		
		Stream<String> newStream = Stream.concat(name1.stream(), name2.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		
		// Check whether text is present inside list
		Stream<String> newStream2 = Stream.concat(name1.stream(), name2.stream());
		boolean flag = newStream2.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	
	}

}
