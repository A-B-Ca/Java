package octoberClass;

public class Student <T,V>{
    T id;
    V name;

    public Student(T id, V name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public V getName() {
        return name;
    }
}
