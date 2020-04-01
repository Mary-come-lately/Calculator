public class Minus implements Operation{
    private int a;
    private int b;

    public Minus(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Minus(){}

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void calculate(int a, int b) {
        System.out.println("The result of operation minus is  " + (a - b));
    }
}
