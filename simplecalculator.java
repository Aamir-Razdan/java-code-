import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args){
        Scanner symbol=new Scanner(System.in);
        System.out.println("enter what you want + _ * /");
        char operator=symbol.next().charAt(0);
        double number1=symbol.nextDouble();
        double number2=symbol.nextDouble();
        symbol.close();
        switch(operator){
            case '+':
            double sum=number1+number2;
            System.out.println("sum of "+number1 +"+"+number2 + "= "+ sum);
            break;
            case '-':
            double subtract=number1-number2;
            System.out.println("subtract  of "+number1 +"-"+number2 + "= "+ subtract);
            break;

            case '*':
            double multiply=number1*number2;
            System.out.println("Multiply of "+number1 +"*"+number2 + "= "+ multiply);
            break;

            case '/':
            double divide=number1/number2;
            System.out.println("divide of "+number1 +"/"+number2 + "= "+ divide);
            break;

            default:
            System.out.println("operator is not present try again");



        }

        
    }
}
