import java.util.Scanner;
public class CalculatorBuilder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Power on");
        System.out.println("Type bye to turn off the calculator");
        while (true) {
            String op = kb.nextLine();
            if (calculator.isPowerOff(op)) break;
            calculator.splitOperation(op);
            calculator.operate();
        }
    }
}
