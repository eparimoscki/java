public class Dog extends AnimalBase {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof woof!");
    }
}