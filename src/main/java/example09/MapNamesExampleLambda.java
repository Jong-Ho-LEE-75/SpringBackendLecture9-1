package example09;

import java.util.Arrays;
import java.util.List;

public class MapNamesExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .map(s -> {
                    String upper = s.toUpperCase(); // 대문자로 변환
                    return upper + " (Length: " + upper.length() + ")"; // 문자열과 길이를 결합
                })
                .forEach(System.out::println);
    }
}