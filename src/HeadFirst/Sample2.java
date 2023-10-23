package HeadFirst;

public class Sample2 {
    Sample2(){
        System.out.println("Sample2");
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
