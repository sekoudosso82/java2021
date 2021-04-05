package serializationPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("Sekou");
        person.setLastName("Dosso");
        person.setEmail("sekou@gmail.com");
        person.setSsn("123");

        try {
            FileOutputStream fos = new FileOutputStream("\\person.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
