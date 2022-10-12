public class Pet {
    
}
class Cat extends Pet {}
class Dog extends Pet {}

class Driver {
    public static void main(String[] args) {
        Cat c; 
        c = new Cat(); 

        Pet p; 
        p = new Cat();
        p = new Dog(); 

        Object myPet; 
        myPet = new Cat();
        myPet = new Dog();
        myPet = "hello"; 
    }
}
