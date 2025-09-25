import java.util.Scanner;
public class PrimeNoRange{
    public static void main(String[] args){
        int num1;
        int num2;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Staring number: ");
        num1=input.nextInt();

        System.out.println("Enter the ending number: ");
        num2=input.nextInt();

        System.out.println("The prime numbers between "+ num1+" and "+num2+" are:");
        for(int i=num1;i<=num2;i++){
            if(isprime(i)){
                System.out.println(i + " ");
            }
        }
    }//end main

    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
