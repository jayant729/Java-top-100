import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        int n;
        int sum=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of elements in a array: ");
        n=input.nextInt();

        int myarray[]=new int[n];

        System.out.println("Enter the "+ n +" Elements");
        for(int i=0;i<n;i++){
            myarray[i]=input.nextInt();
            sum+=myarray[i];
        }
        System.out.println("The sum of array is: "+sum);
    }

}
