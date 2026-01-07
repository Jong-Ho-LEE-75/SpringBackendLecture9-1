package example09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// import java.util.stream.Collectors;

public class ToSetExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Banana");

        // TODO 구현
//        Set<String> uniqueFruits = fruits.stream()
//                .collect(Collectors.toSet());

        Set<String> uniqueFruits = new HashSet<>(fruits);

        System.out.println("Unique fruits: " + uniqueFruits);
    }
}
