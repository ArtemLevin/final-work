import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal extends Parent_class {
    private String animalType;

    public String getAnimalType() {
        return action;
    }

    public void setAnimalType() {
        Scanner input = new Scanner(System.in);
        boolean Flag = true;
        while (Flag == true) {
            System.out.print("Enter animal type: ");
            String newAnimalType = input.nextLine();
            try {
                if ((getAnimalClass().equals("domestic") && newAnimalType.equals("cat")) |
                        (getAnimalClass().equals("domestic") && newAnimalType.equals("dog")) |
                        (getAnimalClass().equals("domestic") && newAnimalType.equals("hamster")) |
                        (getAnimalClass().equals("pack") && newAnimalType.equals("horse")) |
                        (getAnimalClass().equals("pack") && newAnimalType.equals("camel")) |
                        (getAnimalClass().equals("pack") && newAnimalType.equals("donkey"))) {

                    animalType = newAnimalType;
                    Flag = false;
                } else {
                    throw new AnimalTypeException("Enter correct animal type");
                }
            } catch (AnimalTypeException e) {
                System.out.println("Enter correct animal name");
            }
        }
        input.close();
    }
}