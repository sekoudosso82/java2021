package abstractPackage;
abstract class Animal{
    public void eat(){
        System.out.println("The animal munches some food");
    }
    abstract void move();
}
class Dog extends Animal{
    public void move(){
        System.out.println("The dog walk around");
    }

    public void beg(){
        System.out.println("The dog look cute to get food");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.beg();
        myDog.move();
    }
}
