import java.util.Arrays;

public class SecondSmallestElement {
    public static void main(String[] args){
        int arr[]={10,1,5,7,2,8};

        Arrays.sort(arr);

        int smallest= arr[0];
        int secondsmallest=-1;

        for(int i=1;i<= arr.length;i++){
            if(arr[i]!=smallest);
            secondsmallest=arr[i];
            break;
        }
        if(secondsmallest==-1){
            System.out.println("There is no second smallest element");
        }
        else{
            System.out.println("The second smallest element is: "+secondsmallest);
        }
    }
}
