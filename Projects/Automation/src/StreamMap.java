import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamMap {

	public static void main(String[] args) {

		// Print names in UpperCase which has last letter 'a'
		Stream.of("Amika","Krishna","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
		
		
		// Converting Array into ArrayList
		List<String> names = Arrays.asList("Amika","Krishna","Alekhya","Adam","Ram");
		// Print names in UpperCase and sorted which have first letter as 'A'
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	}

}
