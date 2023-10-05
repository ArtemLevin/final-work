import java.util.Scanner;

public class Menu {

    Nursery nursery = new Nursery();

    public void initQuestion() {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to choose?");
        System.out.println(" 1 - Add animal");
        System.out.println(" 2 - Print all animals info");
        System.out.println(" 3 - Print animal info");
        System.out.println(" 4 - Teach animal");
        System.out.println(" 5 - Watch animal actions list");
        System.out.println(" 6 - Remove animal");
        System.out.println(" 0 - Exit");
        System.out.print(" You choice is -------> ");
        String choice = input.nextLine();
        if (choice.equals("1")) {
            nursery.addAnimal();
            System.out.println("------------------------------------------------------------------------");
            initQuestion();
        } else if (choice.equals("2")) {
            nursery.printAllAnimals();
            System.out.println("------------------------------------------------------------------------");
            initQuestion();
        } else if (choice.equals("3")) {
            nursery.printAnimal();
            initQuestion();
        } else if (choice.equals("4")) {
            nursery.newAction();
            System.out.println("------------------------------------------------------------------------");
            initQuestion();
        } else if (choice.equals("5")) {
            nursery.watchActionsList();
            System.out.println("------------------------------------------------------------------------");
            initQuestion();
        } else if (choice.equals("6")) {
            nursery.removeAnimal();
            System.out.println("------------------------------------------------------------------------");
            initQuestion();
        } else if (choice.equals("0")) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Leaving the nursery...");;
        } else {
            System.out.println("Enter correct answer");
            System.out.println("------------------------------------------------------------------------");
            initQuestion();
        }
        input.close();
    }

}
