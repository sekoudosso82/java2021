package marshallingPackage;

import javax.xml.bind.annotation.XmlElement;
// set class as the root XML node
@XmlRootElement
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private transient String ssn;

    @XmlElement // set a property firstName as an XML element
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    @XmlElement // set a property lastName as an XML element
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @XmlElement // set a property email as an XML element
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @XmlTransient // set a property ssn as an XML element
    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }
}
