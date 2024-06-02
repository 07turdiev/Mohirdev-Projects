package Collections;

import java.util.HashMap;

public class HashMepLesson {
    public static void main(String[] args) {
        HashMap<String, String> aa = new HashMap<>();

        aa.put("A", "Elbek");
        aa.put("C", "Turdiyev");
        aa.put("B", "Salom");

        aa.forEach((s, s2) -> {
            System.out.println(s + " " + s2);
        });
    }
}
