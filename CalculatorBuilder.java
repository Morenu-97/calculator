import java.util.Scanner;
public class CalculatorBuilder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Type bye to turn off the calculator");
        while (true) {
            System.out.println("Power on");
            String op = kb.nextLine();
            calculator.setOn(false);
            if (calculator.powerOff(op)) break;
            calculator.splitOperation(op);
            calculator.operate(calculator.getOperator(), calculator.getDigitOne(),calculator.getDigitTwo());
        }
    }
}
