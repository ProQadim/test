package how;

import java.util.Scanner;

import static how.Gate.CAT;
import static how.Gate.DOG;

class Dog extends Animal {

    @Override
    public void job() {
        hefazat();
    }

    @Override
    public String voice() {
        return "Hop!!Hop!!";
    }

    public Dog(String type, String name) {
        super(type, name);
    }
    protected static void hefazat() {
        System.out.println("Begiresh");
    }
}

class Cat extends Animal{

    @Override
    public void job() {
        tanbali();

    }

    @Override
    public String voice() {
        return "Mew!Meeu!";
    }

    public Cat(String type, String name) {
        super(type, name);
    }
    protected static void tanbali() {
        System.out.println("pishte");
    }
}
abstract class Animal {
    public abstract void job(); {
    }

    public abstract String voice(); {
    }
    private String type;
    private String name;


    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}


public class Gate {

    public static final String CAT = "cat";
    public static final String DOG = "dog";


    public static void main(String[] args) {
        Animal animal = readAnimal();
        String voice = animal.voice();
        System.out.println(voice);
        animal.job();

    }

    private static Animal readAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name animall:");
        String type = scanner.next();
        String name = scanner.next();
        Animal animal = null;

        switch (type.toLowerCase()) {
            case CAT:
                animal = new Cat(type, name);
                break;
            case DOG:
                animal = new Dog(type, name);
                break;

        }
        return animal;
    }

}