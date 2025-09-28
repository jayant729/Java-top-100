public class SmallestAndLargestElement {
    public static void main(String[] args) {
        int myarray[] = {10, 30, 50, 70, 5, 100, 47};
        int max = myarray[0];
        int min = myarray[0];


        for (int i = 0;i<myarray.length;i++){
            if(max<myarray[i]){
                max=myarray[i];
            }
        }
        System.out.println("The largest element in a array is: "+max);

        for(int i=0;i<myarray.length;i++){
            if(min>myarray[i]){
                min=myarray[i];
            }
        }
        System.out.println("The smallest element in a array is: "+min);

    }
}