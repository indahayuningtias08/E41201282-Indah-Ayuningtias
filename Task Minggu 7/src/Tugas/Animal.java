
package Tugas;

/**
 *
 * @author Asus
 */
public class Animal {
    public void makeNoise(){
        System.out.println("talk");
    }
    
}

 class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}

 class SuaraHewan{
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.makeNoise();
        
        Dog dog = new Dog();
        dog.makeNoise();
        
        Animal animalDog = new Dog();
        animalDog.makeNoise();
        
        if(animal instanceof Animal){
            System.out.println("animal is Animal");
        }
        if(dog instanceof Animal){
            System.out.println("dog is Animal");
        }
        if(animalDog instanceof Animal){
            System.out.println("animalDog is Animal");
        }
        if(animal instanceof Animal) {
            System.out.println("animal is Animal");
        }
    }
}



