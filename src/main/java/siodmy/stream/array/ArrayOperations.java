package siodmy.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::println);

        double srednia = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average().getAsDouble();

        return srednia;
    }

}
