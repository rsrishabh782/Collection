package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class removeDuplicate {

	public static void main(String[] args) {


		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,5,6,7,8,9,10, 5,6,7,8,9,10));

		LinkedHashSet<Integer> linkhashset = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(linkhashset);
		
		System.out.println(numbers1);
		
		
		
		ArrayList<Integer> marklist = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,5,6,7,8,9,10, 5,6,7,8,9,10));
		
		List<Integer> mark =  marklist.stream().distinct().collect(Collectors.toList());

		System.out.println(mark);
	}

}
