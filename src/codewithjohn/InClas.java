package codewithjohn;

public class InClas {
    int x =1;
    static class StatCla {
        public void Hello() {
            System.out.println("1324");
        }

    }


    }
class Maaain {
    public static void main(String[] args) {
        //InClas ic= new InClas();
        InClas.StatCla cc = new InClas.StatCla();

        cc.Hello();
    }
}

