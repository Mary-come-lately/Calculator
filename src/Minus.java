public class Minus implements Operation{

    public Minus(){}

    @Override
    public void calculate(int a, int b) {
        System.out.println("The result of operation minus is  " + (a - b));
    }
}
