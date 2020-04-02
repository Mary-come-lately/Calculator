import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Start");
        run();
        System.out.println("Finish");
    }

    private void run() {
        while (true){
            Operation calc = operation();
            if (calc == null) {
                break;
            }
            System.out.print("Enter the numbers --> ");
            calc.calculate(scanner.nextInt(),scanner.nextInt());
            return;
        }
    }

    private Operation operation() {
        showMenu();
        System.out.print("Make your choise -->  ");
        switch (scanner.nextInt()){
            case 1: return new Plus();
            case 2: return new Minus();
            case 3: return new Division();
            case 4: return new Multiply();
            case 0: return null;
            default:
                System.out.println("Unidentified number. Please, try again");
                return operation();
        }
    }

    private void showMenu() {
        System.out.println("select operation");
        System.out.println("1 - plus");
        System.out.println("2 - minus");
        System.out.println("3 - division");
        System.out.println("4 - multiply");
        System.out.println("0 - exit");
    }

}
