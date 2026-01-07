package example09;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 1. Consumer - 출력 (메서드 참조 적용)
        names.forEach(System.out::println);

        System.out.println("---");

        // 2. Predicate - 이름 길이 5 이상 필터링 (람다 적용)
        names.stream()
                .filter(s -> s.length() >= 5)
                .forEach(System.out::println);

        System.out.println("---");

        // 3. Function - 이름을 대문자로 변환 (메서드 참조 적용)
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}