package testCalc;

public class toSymbols {
    public static String[] massive(String addd) {
        String[] subStr;
        subStr = addd.split("[-+/*]");
        return subStr;
    }
}
