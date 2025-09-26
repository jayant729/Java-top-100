import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args){
        int num;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number: ");
        num=input.nextInt();
        System.out.println("The factors of "+ num+ " are:");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
