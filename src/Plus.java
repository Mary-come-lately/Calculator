public class Plus implements Operation{
    private int a;
    private int b;

    public Plus(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Plus(){}

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
        System.out.println("The result of operation plus is  " + (a + b));
    }
}
