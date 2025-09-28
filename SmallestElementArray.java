public class SmallestElementArray {
    public static void main(String[] args){
        int myarray[]={10,20,6,9,2,91};
        int min=myarray[0];

        for(int i=0;i< myarray.length;i++){
            if(min>myarray[i]){
                min=myarray[i];
            }
        }
        System.out.println("The smallest element is: "+ min);
    }
}
