
// Write Program to remove duplicate elements in an array

//Description

//Get an array as input from the user and then remove all the duplicate elements in that array.
import java.util.Scanner;
public class day_48{
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        System.out.println("how many number you want to enter");
        int no=number.nextInt();
        int[] numberarr=new int[5];
        for(int i=0;i<no;i++){
            numberarr[i]=number.nextInt();
        }
        number.close();
        System.out.println("array is");
        for(int i=0;i<no;i++){
            System.out.print(numberarr[i]+" ");
        }
    }
}