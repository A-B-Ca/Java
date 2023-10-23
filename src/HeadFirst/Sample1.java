package HeadFirst;

public class Sample1 {
    Sample1(){
        System.out.println("Sample1");
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 123;
    }
}
