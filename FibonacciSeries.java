public class FibonacciSeries {
    public static void main(String[] args){
        int first=0;
        int second=1;
        int next;
        int n=10;

        System.out.println("The fibonacci series for the first 10 numbers are:");
        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            next=first+second;
            first=second;
            second=next;
        }

    }
}
