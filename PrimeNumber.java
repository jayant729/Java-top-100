import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num=input.nextInt();

        if(isprime(num)){
            System.out.println(num +" is a prime number!");
        }
        else{
            System.out.println(num +" is not a prime number");
        }
    }//end main

    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
