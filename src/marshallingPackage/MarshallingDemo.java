package marshallingPackage;
import javax.xml.bind.JAXBContext;

public class MarshallingDemo {

    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("Sekou");
        person.setLastName("Sekou");
        person.setEmail("Sekou");
        person.setSsn("123");

        try{
            JAXBContext jaxb = JAXBContext.newInstance(Person.class);
            Marshaller m = jaxb.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATED_OUTPUT, true);

            m.marshal(p, System.ouut);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
