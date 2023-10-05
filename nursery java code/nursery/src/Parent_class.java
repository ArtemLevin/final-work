import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parent_class {
    private String animalClass;
    private String name;
    private int age;
    public String action;
    ArrayList<String> actionList = new ArrayList<>();

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass() {
        Scanner input = new Scanner(System.in);
        boolean Flag = true;
        while (Flag == true){
            System.out.print("Enter animal class (domestic, pack): ");
            String newAnimalClass = input.nextLine();
            try {
                if (newAnimalClass.equals("domestic") | newAnimalClass.equals("pack")) {
                    animalClass = newAnimalClass;
                    Flag = false;
                } else {
                    throw new AnimalClassException("Enter correct animal class");
                }
            } catch (AnimalClassException e) {
                System.out.println("Enter correct animal class!");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setAnimalName() {
        Scanner input = new Scanner(System.in);
        boolean Flag = true;
        while (Flag){
            System.out.print("Enter animal name: ");
            String newAnimalName = input.nextLine();
            try {
                if (!newAnimalName.isEmpty()) {
                    name = newAnimalName;
                    Flag = false;
                } else {
                    throw new AnimalNameException("Enter correct animal name");
                }
            } catch (AnimalNameException e) {
                System.out.println("Enter correct animal name!");
            }
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        Scanner input = new Scanner(System.in);
        boolean Flag = true;
        while (Flag == true){
            System.out.print("Enter animal age: ");
            String newAnimalAge = input.nextLine();
            try
            {
                int newIntAnimalAge = Integer.parseInt(newAnimalAge.trim());
                age = newIntAnimalAge;
                Flag = false;
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }
        }
    }


    public String getAction() {
        return action;
    }

    public void setAction() {
        Scanner input = new Scanner(System.in);
        boolean Flag = true;
        while (Flag == true){
            System.out.print("Enter animal action: ");
            String newAnimalAction = input.nextLine();
            try {
                if (!newAnimalAction.isEmpty()) {
                    action = newAnimalAction;
                    actionList.add(action);
                    Flag = false;
                } else {
                    throw new AnimalActionException("Enter correct animal action");
                }
            } catch (AnimalActionException e) {
                System.out.println("Enter correct animal action!");
            }
        }
    }

    public List<String> getActionList(){
        System.out.print("This animal can: ");
        return actionList;
    }

}
