public class Cat extends AnimalBase {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}