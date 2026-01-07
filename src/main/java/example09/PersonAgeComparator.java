package example09;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person2> {
    @Override
    public int compare(Person2 p1, Person2 p2) {
        // 나이를 비교할 때는 단순히 정수 비교 수행
        // p1이 작으면 음수, 같으면 0, 크면 양수 반환
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}