package polymorphismPackage;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        System.out.println("Animal type " + myDog.hasFur); //here myDog refer to Animal type
//        System.out.println("Animal type " + myDog.bark()); // can't call bark in Animal class
        Dog myDog1 = new Dog();
        System.out.println("dog type " + myDog1.hasFur);
    }

}
class Animal{
    public boolean hasFur = false;
    public void eat(){
        System.out.println("I eat food");
    }
}

class Dog extends Animal{
    public boolean hasFur = true;

    public void eat(){
        System.out.println("I eat kibble");
    }
    public void bark(){
        System.out.println("woof");
    }
}
