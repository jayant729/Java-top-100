import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        String str;

        System.out.println("Enter the data to check if its a palindrome:");
        str=input.nextLine();

        String reverse=new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.println("It is a palindrome!");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
