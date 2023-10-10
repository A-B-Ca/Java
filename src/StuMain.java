public class StuMain {
    public static void main(String[] args) {

       /* Student stu= new Student();
        System.out.println(stu.rollNo+stu.name);*/

        Student stu1= new Student(7);
        System.out.println(stu1.rollNo+stu1.name);

        String n="Asher";
        Student stu2= new Student(7, n);
        System.out.println(stu2.rollNo+stu2.name);
    }
}
