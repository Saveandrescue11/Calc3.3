package testCalc;

import java.util.Arrays;

public class isRoman {
    public static boolean isRoman(String num) {
        boolean BoolRom = false;
        String[] romanNum = {"i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", "x"};
        if (Arrays.stream(romanNum).anyMatch(s -> s.equals(num))) {
            BoolRom = true;
        }
        return BoolRom;
    }
}
