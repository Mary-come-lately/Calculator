public class Plus implements Operation{

    public Plus(){}

    @Override
    public void calculate(int a, int b) {
        System.out.println("The result of operation plus is  " + (a + b));
    }
}
