import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        int num;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();

        if(num%2==0){
            System.out.println("Even number!");
        }
        else{
            System.out.println("Odd number!");
        }
    }
}
