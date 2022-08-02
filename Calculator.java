public class Calculator {

    //attributes
    private boolean isPowerOn;
    private double result;
    private double digitOne;
    private double digitTwo;
    private String operator;

    public Calculator(){
        this.isPowerOn= true;
        this.digitOne = 0;
        this.result = 0;
    }

    //methods

    public boolean getIsPowerOn() {
        return this.isPowerOn;
    }

    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public double getResult() {
        return this.result;
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

    // split operation
    public void splitOperation(String a){
        String[] array = a.split(" ");
        if (array.length == 3){
            digitOne = Double.parseDouble(array[0]);
            operator = array[1];
            digitTwo = Double.parseDouble(array[2]);
        } else if (array.length == 2) {
            digitOne = this.result;
            operator = array[0];
            digitTwo = Double.parseDouble(array[1]);
        }
    }

    //    M. Conditional
    public void operate() {
        if (this.operator.equals("/")) {
            if (this.digitTwo == 0) {
                System.out.println("Can not be divided by zero");
            } else {
                this.result = divide(this.digitOne, this.digitTwo);
                System.out.println(this.result);
            }
        } else if (this.operator.equals("+")) {
            this.result = sum(this.digitOne, this.digitTwo);
            System.out.println(this.result);
        } else if (this.operator.equals("-")) {
            this.result = subtract(this.digitOne, this.digitTwo);
            System.out.println(this.result);
        } else if (this.operator.equals("*")) {
            this.result = multiply(this.digitOne, this.digitTwo);
            System.out.println(this.result);
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

    //     M. powerOff
    public boolean isPowerOff(String option) {
        if (option.equals("bye")) {
            this.isPowerOn = false;
            System.out.println("Power off");
        }
        return !this.isPowerOn;
    }
}