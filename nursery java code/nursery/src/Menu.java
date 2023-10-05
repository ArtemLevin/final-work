import java.util.Scanner;



public class Menu {

    public boolean initQuestion() {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to choose?");
        System.out.println(" 1 - Add animal");
        System.out.println(" 2 - Get all animals");
        System.out.println(" 3 - Print all animals info");
        System.out.println(" 4 - Remove animal");
        System.out.println(" 5 - Remove animal");
        System.out.println(" 6 - Print animal");
        System.out.println(" 7 - Exit");
        String choice = input.nextLine();
        if (choice.equals("1")) {
            Animal animal = new Animal();
            animal.setAnimalClass();
            animal.setAnimalName();
            animal.setAge();
            animal.setAction();
            animal.setAnimalType();

        }
    }
}
