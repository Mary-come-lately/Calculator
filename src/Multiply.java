public class Multiply implements Operation {

    public Multiply(){}

    @Override
    public void calculate(int a, int b) {
        System.out.println("The result of operation multiply is  " + (a * b));
    }
}
