public class ArrayEx {
    public static void main(String[] args) {
        int[] arr  = {2 ,3 ,4 ,10 ,20 ,3 ,4 ,45 ,23 ,3 ,25 ,6};
        int temp=0;
        for(int i=0;i< (arr.length-1);i++){
            if(arr[i]==3);
            {
                if(arr[i+1]==4){
                    arr[i+1]=0;

                }

            }

        }
        for(int x=0;x<arr.length;x++) {
            System.out.print(arr[x]+" ");
        }
    }
}
