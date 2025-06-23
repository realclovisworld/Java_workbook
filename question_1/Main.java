import java.util.List;
import java.util.ArrayList;

//Abstract class Animal
abstract class Animal {
    // Abstarct method to make sound
    public abstract void makeSound();
    //Abstract method to check if the animal can fly
    public abstract boolean canFly();
}
// concrete subclass:Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("woof");
    }
    @Override
    public boolean canFly() {
        return false;//Dogs cannot fly
    }
}
// concrete subclass:Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
    @Override
    public boolean canFly() {
        return false;//Cats cannot fly
    }
}
// concrete subclass:Bird
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet");
    }
    @Override
    public boolean canFly(){
        return true; // Birds can fly
    }
}
// Zoo class to manage animals
class Zoo {
    private List<Animal>animals;
//constructor to initialize the list of animals
    public Zoo() {
        this.animals = new ArrayList<>();
    }
//Method to add an animal to the zoo
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
//Method to display sounds of the animals
    public void displaySounds(){
        System.out.println("Animal Sounds:");
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }
//Method to display animals that can fly
    public void displayFlyers(){
        System.out.println("\nAnimals that can fly:");
        for(Animal animal : animals){
            if(animal.canFly()) {
                System.out.println(animal.getClass().getSimpleName());
            }
        }
    }
}
// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args){
        //create instances of animals
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        //create a zoo instance
        Zoo zoo = new Zoo();

        //add animals to the zoo
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(bird);

        //display sounds of all animals
        zoo.displaySounds();

        //display the animals that can fly
        zoo.displayFlyers();
    }
}
/*You are tasked with designing a system for a zoo
 that tracks the behavior of different animals. Each animal can make a sound, but the type of
  sound depends on the specific animal.
  Additionally, some animals can fly, while others cannot. You decide to use polymorphism to 
  implement this system efficiently.*/


/*
 
pseudocode:

1. Define an abstract class Animal:
    - Abstract method: makeSound()
    - Abstract method: canFly()

2. Define Dog class (inherits Animal):
    - Implement makeSound(): print "woof"
    - Implement canFly(): return false

3. Define Cat class (inherits Animal):
    - Implement makeSound(): print "meow"
    - Implement canFly(): return false

4. Define Bird class (inherits Animal):
    - Implement makeSound(): print "Tweet"
    - Implement canFly(): return true

5. Define Zoo class:
    - List to store Animal objects
    - Method addAnimal(animal): add animal to list
    - Method displaySounds():
        - For each animal in list, call makeSound()
    - Method displayFlyers():
        - For each animal in list, if canFly() is true, print animal type

6. In Main:
    - Create Dog, Cat, Bird objects
    - Create Zoo object
    - Add animals to zoo
    - Call zoo.displaySounds()
    - Call zoo.displayFlyers()
 * 
 */