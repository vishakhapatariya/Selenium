import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		regularMethod();
		streamFilter();
		
	}
	
	
	public static void regularMethod() {
		
		// Creating an ArrayList and print names starts with 'A'
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amika");
		names.add("Krishna");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count = 0;
		
		for(int i=0;i<names.size();i++) {
			String name = names.get(i);
			if(name.startsWith("A")) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void streamFilter() {
		
		// Creating Collection
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amika");
		names.add("Krishna");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		// Apply Stream and filter method to Collection 
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		
		// Create Stream directly and apply filter
		Long d = Stream.of("Amika","Krishna","Alekhya","Adam","Ram").filter(s->s.startsWith("A")).count();
		System.out.println(d);
		
		
		// Print all the elements of ArrayList
		names.stream().forEach(s->System.out.println(s));
		
		// Print names from ArrayList where length is greater than 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		// Print first name from ArrayList where length is greater than 4
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
						
	}

}
