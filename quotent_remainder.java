import java.util.Scanner;
public class quotent_remainder {
    public static void main(String[] args){
        Scanner number=new Scanner (System.in);
        int no=number.nextInt();
        number.close();
        int Q=no/2;
        double R=no%2;
        System.out.println("Quotent is "+Q);
        System.out.println("Remainder is "+R);

    }
}
