package casting;

public class DownCastingExample {
    public static void main(String[] args) {
        Animal animalReference = new Dog();

        Dog dogReference = (Dog) animalReference;

//        Bird birdReference = (Bird) animalReference;
        // class casting.Dog cannot be cast to class casting.Bird
        // (casting.Dog and casting.Bird are in unnamed module of loader 'app')


        if (animalReference instanceof Dog)
//            dogReference = (Dog) animalReference;
            System.out.println("animalReference instanceof Dog");
        else
            System.out.println("animalReference does not point to a Dog object");

    }
}
class Animal{}
class Dog extends Animal{}
class Bird extends Animal{}
