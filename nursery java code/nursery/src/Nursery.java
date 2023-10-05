import java.util.ArrayList;
import java.util.List;

public class Nursery{
    private List<Animal> animals;

    public void setAnimalsList() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void printAllAnimals() {
        for (Animal animal : animals) {
            animal.printInfo();
        }
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void printAnimal(Animal animal) {
        if (animal != null) {
            animal.printInfo();
        }
    }

    public void savePetToDatabase() {
        // Здесь можно реализовать сохранение животного в базу данных
    }

    public boolean isValidPet(String animalClass, String name, int age, String gender, String photoPath, String action, List<String> actionList) {
        // Проверка правильности введенных данных
        return true;
    }
}
