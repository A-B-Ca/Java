public class CharArrays {
    public static void main(String[] args) {
        String s1="pragra";
        char[] charArray1= s1.toCharArray();

        int i=charArray1.length;
        //System.out.println(i);
        char[] charArray2 =new char[i];
        for (char c:charArray1){
            charArray2[i-1]=c;// charArray2[5]= p
            //charArray2[4]=r
            //charArray2[0]=a
            i--;

        }
        for(char e:charArray2){
            System.out.print(e);
        }
    }
}
