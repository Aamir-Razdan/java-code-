import java.util.Scanner;
public class enterinteger_1{
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=number.nextInt();
        number.close();
        System.out.println("your entered number is :"+no);

    }
}