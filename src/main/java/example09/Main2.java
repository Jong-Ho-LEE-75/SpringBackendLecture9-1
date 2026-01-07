package example09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        // Person 객체를 담을 리스트 생성
        List<Person2> people = new ArrayList<>();
        people.add(new Person2("Alice", 30));
        people.add(new Person2("Charlie", 25));
        people.add(new Person2("Bob", 20));
        people.add(new Person2("David", 40));

        System.out.println("=== 정렬 전 (원본 리스트) ===");
        System.out.println(people);

        List<Person2> sortedByAge = people.stream()
                .sorted(new PersonAgeComparator())
                .collect(Collectors.toList());
        System.out.println("=== 나이 기준 오름차순 정렬 (Stream + PersonAgeComparator) ===");
        System.out.println(sortedByAge);
    }
}