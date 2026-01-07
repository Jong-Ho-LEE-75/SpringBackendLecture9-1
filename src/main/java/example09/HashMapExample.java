package example09;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        // 키-값 쌍 추가
        scores.put("김", 90);
        scores.put("이", 85);
        scores.put("박", 95);
        System.out.println("After put: " + scores);

        // 기존 키에 다른 값 할당
        scores.put("이", 88);
        System.out.println("After updating '이': " + scores);

        // 특정 키의 값 조회
        int parkScore = scores.get("박");
        System.out.println("박의 점수: " + parkScore);

        // 키 존재 여부
        System.out.println("Contains '김' ? " + scores.containsKey("김"));

        // 요소 제거
        scores.remove("김");
        System.out.println("After remove '김': " + scores);

        // 모든 키 조회
        System.out.println("All keys: " + scores.keySet());

    }
}
