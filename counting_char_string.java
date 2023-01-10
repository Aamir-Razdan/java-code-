import java.util.*;

class reverse_string{
    public static void main(String[] args){
        System.out.println("enter a sentence");
        Scanner sentenceinput=new Scanner(System.in);
        String name=sentenceinput.nextLine();
        char charecter=sentenceinput.next().charAt(0);
        // String name="hello a worla aamir razdan";
        sentenceinput.close();
        int no=name.length();
        System.out.println("no of the charecter in the string is "+no);
        int count=0;
        for(int i=0;i<no;i++){
            if(name.charAt(i)==charecter){
                count++;
            }
        }
        System.out.println("no of a "+charecter+" is "+count);


    }
}