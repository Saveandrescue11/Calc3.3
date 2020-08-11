package testCalc;
import java.util.Map;
import java.util.LinkedHashMap;

public class ArabicToRoman {
    public static String RomanNumerals(int Int) {
        LinkedHashMap<String, Integer> roman = new LinkedHashMap<String, Integer>();
        roman.put("M", 1000);
        roman.put("CM", 900);
        roman.put("D", 500);
        roman.put("CD", 400);
        roman.put("C", 100);
        roman.put("XC", 90);
        roman.put("L", 50);
        roman.put("XL", 40);
        roman.put("X", 10);
        roman.put("IX", 9);
        roman.put("V", 5);
        roman.put("IV", 4);
        roman.put("I", 1);
        String resultat = "";
        for (Map.Entry<String, Integer> entry : roman.entrySet()) {
            int matches = Int / entry.getValue();
            resultat += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return resultat;
    }

    public static String repeat(String s, int num) {
        if (s == null) {
            return null;
        }
        final StringBuilder stbuild = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stbuild.append(s);
        }
        return stbuild.toString();
    }
}
