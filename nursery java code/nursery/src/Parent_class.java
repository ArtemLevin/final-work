import java.util.ArrayList;
import java.util.List;

public class Parent_class {
    private String animalClass;
    private String name;
    private int age;
    private String gender;
    private String photoPath;
    public String action;
    List<String> actionList;

    public Parent_class(String animalClass, String name, int age, String gender, String photoPath, String action, List<String> actionList) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.photoPath = photoPath;
        this.action = action;
        this.action = animalClass;
        this.actionList = actionList;
    }

    public String animalClass() {
        return name;
    }

    public void animalClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void addAction(){
        actionList.add(action);
    }

    public void printInfo(){
        System.out.println(getClass());
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getAction());
        System.out.println(getPhotoPath());
    }

}
