public class SumInRange {
    public static void main(String[] args){
        int start=5;
        int end=10;
        int sum=0;

        for(int i=start;i<=end;i++){
            sum+=i;
        }
        System.out.println("The sum is " +sum);
    }
}
