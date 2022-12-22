
import java.util.Scanner;
public class positiveornegative {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=x.nextInt();
        x.close();
        if(no>0){
            System.out.println(no +" is a positive number ");
        }
        else if(no<0){
            System.out.println(no+"is a negative number");
        }
        else if(no==0){
            System.out.println(no+"is zero ");
        }
        else{

            System.out.println(no+" is not a number please enter a number");
        }

    }
}
