public class Arra {
    public static void main(String[] args) {
        int[] arr= new int[10];
        int sum=10;
        for (int i=0;i< arr.length;i++){
            arr[i]=sum;
            sum=sum+10;
        }
        for(int y=0;y<arr.length;y++) {
            System.out.println(arr[y]);
        }
    }
}
