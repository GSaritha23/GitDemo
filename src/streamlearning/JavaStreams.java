package streamlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JList;

import org.testng.annotations.Test;

public class JavaStreams {

	@Test

	public void regular() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("adhvik");
		names.add("saritha");
		names.add("ayansh");
		names.add("arugula");
		names.add("hani");
		names.add("adhvith");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);

			if (actual.startsWith("a")) {

				count++;

			}
		}

		System.out.println(count);

	}

	@Test

	public void streamtest() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("adhvik");
		names.add("saritha");
		names.add("ayansh");
		names.add("arugula");
		names.add("hani");
		names.add("adhvith");

		long c = names.stream().filter(s -> s.startsWith("a")).count();

		System.out.println(c);

		long d = Stream.of("adhvik", "saritha", "ayansh", "arugula", "hani", "adhvith").filter(s ->

		{

			s.startsWith("a");
			return true;
		}).count();

		System.out.println(d);

		names.stream().filter(s -> length() > 4).forEach(s -> System.out.println(s));

		names.stream().filter(s -> length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

	private int length() {
		// TODO Auto-generated method stub
		return 0;
	}
    
	
	@Test
	public void map() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("adhvik");
		names.add("saritha");
		names.add("ayansh");

		
		
	Stream.of("adhvik", "saritha", "ayansh", "arugula", "hani", "adhvith").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));	
		
		
	List<String> names1= Arrays.asList("adhvik", "saritha", "ayansh", "arugula", "hani", "adhvith");	
		
names1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));	
		
	Stream<String> newStream=	Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
	}
	
	@Test
	public void list() {
	  	
				
		List<String> ls=Stream.of("adhvik", "saritha", "ayansh", "arugula", "hani", "adhvith").filter(s->s.endsWith("a"))	
		.map(s->s.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println(ls.get(1));
		
		
		List<Integer> li = Stream.of(1,5,3,2,9,1,7,6,9).distinct().sorted().collect(Collectors.toList());
		System.out.println(li.addAll(li));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
