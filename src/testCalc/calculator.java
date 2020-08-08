package testCalc;

class calculator {
    public static int Calculations(int num1, char oper, int num2){
        int result = 0;
        if ((num1>10)||(num2>10)) {
            System.out.println("Введенное число больше 10");
            System.exit(1);
        }


        switch (oper){
            case '+':result=num1+num2;
                break;
            case '-':result=num1-num2;
                break;
            case '/':
                if((num1==0)||(num2==0)){
                    System.out.println("нельзя делить на 0");
                    System.exit(1);
                }
                else{
                result=num1/num2;
                break;}
            case '*':result=num1*num2;
                break;

        }
        return result;
    }

}
