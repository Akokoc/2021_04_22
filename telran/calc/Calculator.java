package telran.calc;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        operator= '+';
        try {
            Integer number1 = getNumber(args[0]);
            System.out.println(args[0]);
            Integer number2 = getNumber(args[1]);
            System.out.println(args[1]);
        }catch (NumberFormatException e){
            System.out.println("Args not number");
        }

//        int first;
//        int second;
//        char operator;
//        first = 0;
//        second = 4;
//        operator = '-';
//        calculator(first, second, operator);
//        first = 4;
//        second = 0;
//        operator = '/';
//        calculator(first, second, operator);


    }

    public static void calculator(Integer number1, Integer number2, char operator) {
        switch (operator) {
            case '+':
                System.out.println("x= " + number1 + ", y= " + number2 + ", x + y = " + (number1 + number2));
                break;
            case '-':
                System.out.println("x= " + number1 + ", y= " + number2 + ", x - y = " + (number1 - number2));
                break;
            case '*':
                System.out.println("x= " + number1 + ", y= " + number2 + ", x * y = " + (number1 * number2));
                break;
            case '/':
                try
                    {
                        System.out.println(number1/number2);
                    }
                    catch(ArithmeticException e)// Check for divide by zero exception
                    {
                        System.out.println("Divide by zero");
                    }

//                if (second == 0) {
//                    System.out.println("You cannot divide by zero!");
//                } else {
//                    System.out.println("x= " + first + ", y= " + second + ", x / y = " + (first / second));
//                }
                break;
        }
    }
    private static boolean isNumber(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    private static Integer getNumber(String str){
        return Integer.parseInt(str);
    }
}

