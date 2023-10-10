import java.util.Scanner;
public class MobMain {

    public static void main(String[] args){
        Mob mb= new Mob();
        System.out.println(mb.getBrand()+"\n"+mb.getColor()+"\n"+mb.getScreen()+"inch \n"+mb.getMemory()+"mb");
        Mob1 mb1= new Mob1();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the brand");
        String bran=scan.next();
        mb1.setBrand(bran);
        System.out.println("Enter the color");
        String col=scan.next();
        mb1.setColor(col);
        mb1.setMemory(512);
        mb1.setScreen(6.00);
        System.out.println(mb1.getBrand()+"\n"+mb1.getColor()+"\n"+mb1.getScreen()+"inch \n"+mb1.getMemory()+"mb");


    }
}
