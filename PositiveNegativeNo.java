import java.util.Scanner;

public class PositiveNegativeNo {
    public static void main(String[] args){
        int num;

        Scanner input=new Scanner(System.in);
        num=input.nextInt();

        if(num>=0){
            System.out.println("The number is positive!");
        }
        else{
            System.out.println("The number is negative!");
        }
    }
}
