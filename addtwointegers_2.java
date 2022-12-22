import java.util.Scanner;
public class addtwointegers_2 {
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        System.out.println("enter first number ");
        int no1=number.nextInt();
        System.out.println("enter 2nd number ");
        int no2=number.nextInt();
        number.close();
        int sum=no1+no2;
        System.out.println("sum of the number is :"+sum);

    }
}
