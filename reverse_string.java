public class reverse_string {
    public static void main(String[] args){
        String newi="";
        String name="hello this is hulk";
        for(int i=name.length()-1;i>=0;i--){
            newi=newi+name.charAt(i);
        }
        System.out.println(newi);

    }
}
