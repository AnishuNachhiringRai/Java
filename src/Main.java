import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("Anishu.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person = new Person();
        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputSystem("Anish.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        person1.getName();
        person1.getAge();

    }
}