package november;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StuMain {
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();

        list.add(new Student("Asher", 33));
        list.add(new Student("Tom", 33));
        list.add(new Student("Jerry", 59));
        list.add(new Student("Popeye",50));
        list.add(new Student("Raj", 39));

        //System.out.println("All those above 40 years of age ");
        Iterator<Student> iterator = list.iterator();


        while(iterator.hasNext()) {
            Student s= iterator.next();
            if(s.getAge()>40){
                System.out.println(
                        s.getName()
                );
            }


        }


       /* for(Student element: list){
            if(element.getAge()>40){
                System.out.println(element);
            }
        }*/
    }
}
