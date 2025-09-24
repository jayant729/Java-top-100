import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        int n;
        int sum=0;

        Scanner input=new Scanner(System.in);
        n=input.nextInt();

        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum is " + sum);

    }
}
