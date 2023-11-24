import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Totó"));
        animals.add(new Cat("Kat"));

        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": ");
            animal.makeSound();
        }
    }
}