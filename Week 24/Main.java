import java.io.*;

public class Main {
    public static void main(String[] args) {
        readFromFile();
    }

    private static void writeToFile() {
        Teacher teacher = new Teacher("Sushil",1000L,45,7.1f);

        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("teacher.dat")))
        {
            os.writeObject(teacher);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void readFromFile() {
       Teacher teacher;

        try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("teacher.dat")))
        {
            teacher = (Teacher)os.readObject();
            System.out.println(teacher.name+" "+teacher.age+" "+teacher.rating);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
