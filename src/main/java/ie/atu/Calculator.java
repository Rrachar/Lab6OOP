package ie.atu;

public class Calculator {

    public int add(int a, int b) {
        if(a == Integer.MAX_VALUE || b == Integer.MAX_VALUE)
        {
            throw new ArithmeticException("Value out of range");
        }
        return a + b;
    }

    public int sub(int i, int i1) {
        if(i == Integer.MIN_VALUE || i1 == Integer.MIN_VALUE)
        {
            throw new ArithmeticException("Value out of range");
        }
        return i - i1;
    }

    public int mul(int i, int i1) {
        if(i == Integer.MAX_VALUE || i1 == Integer.MAX_VALUE)
        {
            throw new ArithmeticException("Value out of range");
        }
        return i * i1;
    }

    public int div(int i, int i1) {
        if(i1 == 0){
            throw new ArithmeticException("/ by zero");
        }
        return i / i1;
    }
}
