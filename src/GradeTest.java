public class GradeTest {
    public static void main(String[] args) {
        int x=-1;
        if(x<=100 && x>0) {
            if (x < 40) {
                System.out.println("Fail");
            } else if (x >= 40 && x < 60) {
                System.out.println("B Grade");
            } else if (x >= 60 && x < 80) {
                System.out.println("B+ Grade");

            } else if (x >= 80 && x < 90) {
                System.out.println("A Grade");
            } else if (x >= 90 && x <= 99) {
                System.out.println("A+ Grade");
            } else {
                System.out.println("You are out of this world");
            }
        }
        else{
            System.out.println("Entered a wrong value");
        }
    }
}
