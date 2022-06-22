import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            options();
            int n = kb.nextInt();

            if (powerOff(n)) break;

            System.out.println("Enter two numbers");
            double a = kb.nextDouble();
            double b = kb.nextDouble();

            operations(n, a, b);
        }
    }
    //    M. options
    public static void options () {
        System.out.println("1=(+)\n2=(-)\n3=(*)\n4=(/)\n5=(off)");
    }

    //     M. powerOff
    public static boolean powerOff(int option) {
        if (option == 5) {
            System.out.println("Power off");
            return true;
        } else if (option > 5) {
            System.out.println("Power off");
            return true;
        }
        return false;
    }
    //    M. Conditional
    public static void operations(int n, double a, double b) {
        if (n == 4) {
            if (b == 0) {
                System.out.println("Can not be divided by zero");
            } else {
                System.out.println(divide(a,b));
            }
        } else if (n == 1) {
            System.out.println(sum(a,b));
        } else if (n == 2) {
            System.out.println(subtract(a,b));
        } else if (n == 3) {
            System.out.println(multiply(a,b));
        }
    }
    //    M. operations
    public static double divide(double a, double b) {return a / b;}
    public static double sum(double a, double b) {return a + b;}
    public static double subtract(double a, double b) {return a - b;}
    public static double multiply(double a, double b) {return a * b;}
}
