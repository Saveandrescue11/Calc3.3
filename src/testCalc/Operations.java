package testCalc;

public class Operations {
    public static char operator(String text) {
        String[] stringArray = text.split("");
        String min = "-";
        String plus = "+";
        String mult = "*";
        String del = "/";
        char oper = ' ';
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(min)) {
                oper = '-';
            } else if (stringArray[i].equals(plus)) {
                oper = '+';
            } else if (stringArray[i].equals(mult)) {
                oper = '*';
            } else if (stringArray[i].equals(del)) {
                oper = '/';
            }

        }
        return oper;
    }
}
