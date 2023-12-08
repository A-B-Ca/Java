package codewithjohn;

public class GenTest {
        public static void main (String[] args) {
            System.out.println(checkEquality(10.5,10.5));
        }
        public static <T> boolean checkEquality(T a, T b){
            if(a.equals(b)){
                return true;
            }
            else{
                return false;
            }
        }

        // implement the checkEquality() method that takes 2 values as input parameters and it returns
        // a boolean value whether the values are mathcing or not
    }

