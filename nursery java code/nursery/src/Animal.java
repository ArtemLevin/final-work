import java.util.ArrayList;
import java.util.List;

public class Animal extends Parent_class {
    private String animalType;

    public Animal(String animalClass, String name, int age, String gender, String photoPath, String action, List<String> actionList, String animalType) {
        super(animalClass, name, age, gender, photoPath, action, actionList);
        this.animalType = animalType;
    }
}
