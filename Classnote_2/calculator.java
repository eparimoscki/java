public class calculator {
    double weight;
    double height;

    public calculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculatoribm() {
        return weight / (height * height);
    }
}