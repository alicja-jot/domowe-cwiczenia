package szosty.testy.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> onlyOdd = new ArrayList<>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                onlyOdd.add(number);
                System.out.println("Parzysta: " + number);
            }
        }
        return onlyOdd;

    }
}
