import java.util.Scanner;
//import java.math.*;
public class leapyear {
    public static void main(String[] args){
        Scanner inputYear=new Scanner(System.in);
        System.out.println("enter a year");
        int year=inputYear.nextInt();
        inputYear.close();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year + "is a leap year");
                }
                else{
                    System.out.println(year + "is not a leap year");
                }

            }
            else{
            System.out.println(year + "is a leap year");

            }


        }
        else{
            System.out.println(year+"is not a leap year");
        }


    }
}
