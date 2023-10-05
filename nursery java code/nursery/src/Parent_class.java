import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parent_class {
    private String animalClass;
    private String name;
    private int age;

    public String action;
    List<String> actionList;

//    public Parent_class(String animalClass, String name, int age, String gender, String photoPath, String action, List<String> actionList) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.photoPath = photoPath;
//        this.action = action;
//        this.animalClass = animalClass;
//        this.actionList = actionList;
//    }

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
                System.out.println("Enter correct animal class");
            }
        }
        input.close();
    }

    public String getName() {
        return name;
    }

    public void setAnimalName() {
        Scanner input = new Scanner(System.in);
        boolean Flag = true;
        while (Flag == true){
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
                System.out.println("Enter correct animal name");
            }
        }
        input.close();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        Scanner input = new Scanner(System.in);
        boolean Flag = true;
        while (Flag == true){
            System.out.print("Enter animal name: ");
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
            System.out.print("Enter animal name: ");
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
                System.out.println("Enter correct animal name");
            }
        }
        input.close();
    }

    public void getActionList(){
        System.out.println("This animal can: ");
        for (String action : actionList){
            System.out.println(action);
        }
    }

    public void printInfo(){
        System.out.println(getClass());
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getAction());
    }

}
