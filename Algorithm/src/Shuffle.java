import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unshuffled : " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

    }
}