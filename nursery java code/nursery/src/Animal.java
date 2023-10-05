import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal extends Parent_class {
    private String animalType;

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType() {
        Scanner input = new Scanner(System.in);
        boolean Flag = true;
        while (Flag) {
            System.out.print("Enter animal type ---> " +
                    "dog, cat or hamster for domestic and" +
                    "horse, camel or donkey for pack ---> ");
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
                System.out.println("Enter correct animal type");
            }
        }
    }
    public void printInfo(){
        System.out.print(getAnimalClass() + "        ");
        System.out.print(getAnimalType() + "         ");
        System.out.print(getName() + "         ");
        System.out.print(getAge() + "         ");
        System.out.println(getActionList());
    }
}