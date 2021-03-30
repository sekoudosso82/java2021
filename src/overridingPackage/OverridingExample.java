package overridingPackage;

public class OverridingExample {
    public static void makeItTalk(Animal input){
        System.out.println("Make the animal  object speak:");
        input.speak();
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        System.out.println("Make the Animal object speak: ");
        makeItTalk(myAnimal);

        System.out.println("Make the Dog object speak with override method: ");
        makeItTalk(myDog);
    }
}
