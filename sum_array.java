public class avg_array{
    public static void main(String[] args){
        double[] number={3.23,54.3,1.3};
        int i;
        double sum=0;
        for(i=0;i<=number.length-1;i++){
           // sum=0;
            sum+=number[i];

        }
        System.out.printf("sum of your number is %.2f",sum);
    }
}