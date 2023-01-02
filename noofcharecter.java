
import java.util.Scanner;
public class noofcharecter {
    public static void main(String[] args){
        System.out.println("enter your sentence");
        Scanner sentence=new Scanner(System.in);
        String newsen=sentence.nextLine();
        System.out.println("enter your charecter you want to count");

        char letter=sentence.next().charAt(0);
        sentence.close();
        int i;
        int k=newsen.length();
        int no_ofappearence=0;
        for(i=0;i<k;i++){
            if(newsen.charAt(i)==letter){
                 no_ofappearence++;

            }

        }
        System.out.println("your input is "+newsen +"no of charecter is "+k );
        System.out.println("no of "+letter+" appeared in sentence is  "+no_ofappearence);


    }
    
}
