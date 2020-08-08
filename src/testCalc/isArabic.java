package testCalc;

public class isArabic {
    public static boolean isArabic(String num) {
        try {
            int i = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
