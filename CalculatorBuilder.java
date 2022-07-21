import java.util.Scanner;
public class CalculatorBuilder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Calculator gg = new Calculator();

        System.out.println("Type bye to turn off the calculator");
        while (true) {
            System.out.println("Power on");
            String op = kb.nextLine();
            if (gg.powerOff(op)) break;
            gg.splitOperation(op);
            double digitOne = gg.getDigitOne();
            String operator = gg.getOperator();
            double digitTwo = gg.getDigitTwo();
            gg.operate(operator,digitOne,digitTwo);
        }
    }
}
