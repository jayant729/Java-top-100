import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        int n;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of elements in a array: ");
        n= input.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the " + n +" elements in an array");
        for(int i=0;i< arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("The revered array is:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
