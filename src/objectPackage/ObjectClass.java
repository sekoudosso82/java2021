package objectPackage;

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }
    // override toString() methods
    public String toString(){
        return "hi, i'm "+this.name;
    }
    public String getName() { return name ;}
    public void setName(String name) { this.name = name ; }
}
public class ObjectClass {
    public static String print(Person o){
//        return o.getName();
        return o.toString();
    }



    public static void main(String[] args) {
        Person someone = new Person("Sekou");
        Person someone1 = new Person("Sekou");
        System.out.println(print(someone));
    }
}

