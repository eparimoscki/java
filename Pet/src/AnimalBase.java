import java.util.List;

public abstract class AnimalBase implements Animal {
    private String name;

    public AnimalBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("The animal makes a generic sound");
    }
}
