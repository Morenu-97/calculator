import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            options();
            int n = kb.nextInt();
            if (powerOff(n)) break;
            if (n < 5){
                System.out.println("Enter two numbers");
                double a = kb.nextDouble();
                double b = kb.nextDouble();
                operations(n,a,b);
            } else if (n == 5 || n == 6) {
                System.out.println("Enter one number");
                double c = kb.nextDouble();
                operations2(n,c);
            }
        }
    }
    //    M. options
    public static void options () {
        System.out.println("1=(+)\n2=(-)\n3=(*)\n4=(/)\n5=(√)\n6=(∣a∣)\n7=(off)");
    }

    //     M. powerOff
    public static boolean powerOff(int option) {
        if (option == 7) {
            System.out.println("Power off");
            return true;
        } else if (option > 7) {
            System.out.println("Power off");
            return true;
        }
        return false;
    }
    //    M. Conditional
    public static void operations(int n, double a,double b) {
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
    //    M. Conditional
    public static void operations2(int n, double c) {
        if (n == 5) {
            System.out.println(sqrt(c));
        } else if (n == 6) {
            System.out.println(absoluteValue(c));
        }
    }
    //    M. operations
    public static double divide(double a, double b) {return a / b;}
    public static double sum(double a, double b) {return a + b;}
    public static double subtract(double a, double b) {return a - b;}
    public static double multiply(double a, double b) {return a * b;}
    public static double sqrt(double c) {return  Math.sqrt(c);}
    public static double absoluteValue(double c) {return  Math.abs(c);}
}
