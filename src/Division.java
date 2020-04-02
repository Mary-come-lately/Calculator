public class Division implements Operation{

    public Division(){}

    @Override
    public void calculate(int a, int b) {
        System.out.println("The result of operation division is  " + (a / b));
    }
}
