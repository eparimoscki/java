import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = sc.nextLine(); // Correção: Deve ser uma string, não um inteiro.

        System.out.println("Type your weight: ");
        double weight = sc.nextDouble();

        System.out.println("Type your height: ");
        double height = sc.nextDouble();

        calculator calculator = new calculator(weight, height); // Correção: Use o construtor correto.

        double ibm = calculator.calculatoribm(); // Correção: Chame o método corretamente.

        System.out.println(name + ", your IBM is: " + ibm); // Correção: Adicione uma vírgula após o nome.
    }
}