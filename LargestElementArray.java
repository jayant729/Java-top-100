public class LargestElementArray {
    public static void main(String[] args){
        int arr[]={10,20,50,70,67};

        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest element in a array is: "+ max);
    }
}
