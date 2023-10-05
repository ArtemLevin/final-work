
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Nursery {
    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal() {
        Counter.add();
        Animal animal = new Animal();
        animal.setAnimalClass();
        animal.setAnimalType();
        animal.setAnimalName();
        animal.setAge();
        animal.setAction();
        animals.add(animal);
    }


    public void printAllAnimals() {
        if (!animals.isEmpty()) {
            System.out.println("Class        Type        Name        Age        Actions");
            for (Animal animal : animals) {
                animal.printInfo();
            }
        }
        else{
            System.out.println("Animal list is empty!");
        }
    }

    public void removeAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose from the list below. ");
        printAllAnimals();
        System.out.print("Enter animal name to delete from the list ------>  ");
        String animalName = input.nextLine();
        Iterator<Animal> iterator = animals.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animalName.equals(animal.getName())) {
                System.out.println("Removing " + animal.getName() + "...");
                counter ++;
                iterator.remove();
            }
        }
        if (counter == 0){
            System.out.println("There is no animal with such name!");
        }
    }

    public void printAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose from the list below. ");
        printAllAnimals();
        if (!(animals.size() == 0)) {
            System.out.println("Enter animal name to print info");
            String animalName = input.nextLine();
            for (Animal animal : animals) {
                if (animalName.equals(animal.getName())) {
                    animal.printInfo();
                }
            }
        }
    }

    public void newAction(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose from the list below. ");
        System.out.println();
        printAllAnimals();
        System.out.print("Enter animal name to teach ------>  ");
        String animalName = input.nextLine();
        Iterator<Animal> iterator = animals.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animalName.equals(animal.getName())) {
                animal.setAction();
                System.out.println("Teaching " + animal.getName() + "...");
                counter += 1;
            }
        }
        if (counter == 0){
            System.out.println("There is no animal with such name!");
        }
    }

}
