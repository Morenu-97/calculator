public class Calculator {
    //attributes

    private String options;
    private boolean isOn;
    private double result;

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

    public double divide(double a, double b) {
        return a / b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double sqrt(double c) {
        return  Math.sqrt(c);
    }

    public double absoluteValue(double c) {
        return  Math.abs(c);
    }
}