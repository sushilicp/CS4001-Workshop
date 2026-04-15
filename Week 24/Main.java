import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    private static void writeToFile() {
        Teacher teacher = new Teacher("Sushil",1000L,45,7.1f);
        Teacher teacher1 = new Teacher("Sushil1",1000L,45,7.1f);
        Teacher teacher2 = new Teacher("Sushil2",1000L,45,7.1f);
        Teacher teacher3 = new Teacher("Sushil3",1000L,45,7.1f);
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("teacher.dat")))
        {
            os.writeObject(teachers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void readFromFile() {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("teacher.dat")))
        {
            teachers = (ArrayList<Teacher>) os.readObject();
           for(Teacher t:teachers){
               System.out.println(t);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
