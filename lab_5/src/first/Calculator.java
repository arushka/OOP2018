package first;

public class Calculator {
    private int min;
    private int max;
    private int sum;

    public Calculator(int value) {
        min = max = sum = value;
    }

    public int getMin() { return min; }
    public void setMin(int min) { this.min = min; }

    public int getMax() { return max; }
    public void setMax(int max) { this.max = max; }

    public int getSum() { return sum; }

    public void alterSum(int delta) { sum += delta; }
}