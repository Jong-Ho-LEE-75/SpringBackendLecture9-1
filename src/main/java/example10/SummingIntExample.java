package example10;

import java.util.Arrays;
import java.util.List;
// import java.util.stream.Collectors;

public class SummingIntExample {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(5, 12, 18, 7);
        List<Double> doubles = Arrays.asList(1.3, 2.0, 3.4, 4.2, 5.0);
        List<Long>  longs = Arrays.asList(1L, 2L, 3L, 4L, 5L);

        // TODO 타입에 맞추어 각 sum 구현
        int intSum = ints.stream().mapToInt(Integer::intValue).sum();
        double doubleSum = doubles.stream().mapToDouble(Double::doubleValue).sum();
        long longSum = longs.stream().mapToLong(Long::longValue).sum();

        System.out.println("intSum = " + intSum);
        System.out.println("doubleSum = " + doubleSum);
        System.out.println("longSum = " + longSum);
    }
}