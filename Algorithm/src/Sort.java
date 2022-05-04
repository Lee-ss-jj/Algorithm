import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	
    public static void main(String[] args) {
    	ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted : " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted : " + numbers);

    }
}