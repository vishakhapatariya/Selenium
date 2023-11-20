import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollection {

	public static void main(String[] args) {
		
		// collection method for grab everything into new list
		List<String> ls = Stream.of("Amika","Krishna","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
		
		// Print first element of new list
		System.out.println(ls.get(0));
		
		
		
		List<Integer> values = Arrays.asList(5,2,4,2,6,9,4,3);
		// Print unique number from Array
		values.stream().distinct().forEach(s->System.out.println(s));
		
		// Sort Array Elements
		values.stream().sorted().forEach(s->System.out.println(s));
		
		// Sort Array and print index 2
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
