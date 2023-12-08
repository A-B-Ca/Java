package octoberClass;

public class OuterClassDemo {
    public void Test() {
        System.out.println("Outer Class");
         class Intth {
            int x=10;
            public void prnt(){
                System.out.println(x);
            }

        }
        Intth i = new Intth();
        i.prnt();
    }
        public class InnerClass {
            public void Test1() {
                System.out.println("Inside Inner");
            }

        }
    public static void main(String[] args) {
        OuterClassDemo o= new OuterClassDemo();
        OuterClassDemo.InnerClass i = o.new InnerClass();
        o.Test();
        i.Test1();
    }




}

