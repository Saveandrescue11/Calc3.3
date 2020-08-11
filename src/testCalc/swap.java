package testCalc;

public class swap {
    public static void swap() {
        int num1=0;
        int num2=0;
        String text = dataRead.reader().toLowerCase(); //получит пример
        String[] substringText= toSymbols.massive(text); // разбивает на символы
        int selections = select.sel(substringText); // рим или араб
        char oper = Operations.operator(text); // определяет операцию
        if(selections == 2){
            num1=roman.romanToNum(substringText[0]);
            num2=roman.romanToNum(substringText[1]);
        }
        else{
            if(selections==1){
                num1= Integer.parseInt(substringText[0]);
                num2= Integer.parseInt(substringText[1]);
            }
        }
        int result = calculator.Calculations(num1,oper,num2);
        String resultat;

        if (selections == 2) {
            resultat =  ArabicToRoman.RomanNumerals(result);
            System.out.println(resultat);
        }
        else {System.out.println(result);
        }
    }
}
