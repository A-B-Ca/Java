public class maxArray {
    public static void main(String[] args) {
        int temp=0;
        int[] arr  = {10,-20,43,435,232,43,56};
        int x= arr.length;
        x=x-1;
        for(int i=0;i!=x;i++){
            temp=arr[x];
            arr[x]=arr[i];
            arr[i]=temp;
            x=x-1;
        }
        for(int y:arr){
            System.out.print(y+ " ");
        }
    }
}
