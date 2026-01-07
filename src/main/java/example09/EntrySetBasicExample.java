package example09;

import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("korea", "seoul");
        capitals.put("Japan", "Tokyo");
        capitals.put("USA", "Washington D.C.");

        for (Map.Entry<String, String> entry: capitals.entrySet()) {
            System.out.println("Sountry: " + entry.getKey() + ", capital: " + entry.getValue());
        }
    }
}