public class Calculator {
    //attributes

    private String options;
    private boolean isOn;
    private double result;
    private double digitOne;
    private double digitTwo;
    private String operator;

    //methods

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getDigitOne() { return this.digitOne; }

    public void setDigitOne(double digitOne) {
        this.digitOne = digitOne;
    }

    public double getDigitTwo() {
        return this.digitTwo;
    }

    public void setDigitTwo(double digitTwo) {
        this.digitTwo = digitTwo;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    // split operations
    public void splitOperation(String a){
        String[] array = a.split("");
        digitOne = Double.parseDouble(array[0]);
        operator = array[1];
        digitTwo = Double.parseDouble(array[2]);
    }
    //    M. Conditional
    public void operate(String n, double a, double b) {
        if (n.equals("/")) {
            if (b == 0) {
                System.out.println("Can not be divided by zero");
            } else {
                System.out.println(divide(a,b));
            }
        } else if (n.equals("+")) {
            System.out.println(sum(a,b));
        } else if (n.equals("-")) {
            System.out.println(subtract(a,b));
        } else if (n.equals("*")) {
            System.out.println(multiply(a,b));
        }
    }
    //    M. operations
    public double divide(double a, double b) {
        return a / b;
    }

    public double sum(double a, double b) {return a + b;}

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}