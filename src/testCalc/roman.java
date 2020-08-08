package testCalc;

public class roman {
    public static int romanToNum(String num){
        int number=0;
        String a = num.toLowerCase();
        switch (a){
            case "i": number = 1;
                break;
            case "ii": number = 2;
                break;
            case "iii": number = 3;
                break;
            case "iv": number = 4;
                break;
            case "v": number = 5;
                break;
            case "vi": number = 6;
                break;
            case "vii": number = 7;
                break;
            case "viii":number= 8;
                break;
            case "ix": number = 9;
                break;
            case "x": number = 10;
                break;
        }
        return number;
    }
}
