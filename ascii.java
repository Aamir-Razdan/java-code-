
import java.util.Scanner;
public class ascii{
    public static void main(String[] args){

        Scanner charecter=new Scanner(System.in);
        
        System.out.println("enter new charecter as your wish");
        char newch=charecter.next().charAt(0);
        charecter.close();
        int ascii=newch;

        System.out.println("ASCII value of the charecter is "+newch+" is "+ascii);

    }
}
