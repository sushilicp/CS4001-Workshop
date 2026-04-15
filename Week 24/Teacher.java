import java.io.Serializable;

public class Teacher implements Serializable {
    long salary;
    int age;
    String name;

    float rating;

    Teacher(String name,long salary,int age,float rating){
        this.name=name;
        this.salary=salary;
        this.age=age;
        this.rating=rating;
    }
}
