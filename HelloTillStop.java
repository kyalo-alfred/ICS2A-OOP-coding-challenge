import java.util.Scanner;

public class HelloTillStop {
    public static void main(String[] args) {
        HelloTillStop hello = new HelloTillStop();
        hello.showHello();
    }

    Scanner sc = new Scanner(System.in);

    void showHello() {
        String choice;

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next();
        while ("h".equals(choice)) {
            System.out.println("Hello");
            choice = sc.next();
        }
    }
}
