import java.util.Scanner;
public class even_odd {
    public static void main(String[] args){
        Scanner number=new Scanner (System.in);
        int no=number.nextInt();
        number.close();
        if(no%2==0){
            System.out.println(no+" is a even number");

        }

            
        else{
            System.out.println(no+" is a odd number");
        }
    }
}
