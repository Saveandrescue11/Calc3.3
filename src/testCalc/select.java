package testCalc;

public class select {
    public static int sel(String[] substringText){
        String num1 = substringText[0];
        String num2 = substringText[1];
        int selection = 0;
        boolean isArabic1= isArabic.isArabic(num1);
        boolean isArabic2=isArabic.isArabic(num2);
        boolean isRoman1 = isRoman.isRoman(num1);
        boolean isRoman2 = isRoman.isRoman(num2);
        if(!isArabic1 || !isArabic2){
            if(!isRoman1||!isRoman2){
                System.out.println("Не верный ввод");
                System.exit(1);
            }
        }
        if(isArabic1&&isArabic2){selection=1;}
        else{selection=2;}

        return selection;
    }
}
