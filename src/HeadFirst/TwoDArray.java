package HeadFirst;

public class TwoDArray {
    public static void main(String[] args){
        String cars[] []={{"a","b","c"}, {"d","e","f"},{"g","h","i"}};
        for(int i=0;i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j] + "  ");
            }
        }

    }
}
