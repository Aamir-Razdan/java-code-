public class methodin_java {

    public int sum(int a,int b){
        return a+b;
    }
    public static int subtract(int a,int b){
        int minus=a-b;
        return minus;
    }
    public static int multiply(int a,int b){
        int multi=a*b;
        return multi;
    }
    public static String reversestr(String userinput){
        String string_return="";
        int no=userinput.length();
        for(int i=0;i<no;i++){
            string_return=userinput.charAt(i)+string_return;   
             }
        return string_return;
    }
    public static void main(String[] args){
        methodin_java neww=new methodin_java();
        int add=neww.sum(23,7);
        String name="hello";
        System.out.println(reversestr(name));
        System.out.println(subtract(45,30));
        System.out.println(add);
        System.out.println(multiply(30,5));

    }
}
