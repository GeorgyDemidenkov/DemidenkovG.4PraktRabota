import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int result = exit(number, 1, 0);
        System.out.println(result);
    }

    private static int exit(int number, int a, int b) {
        if (number < 0) return b;
        else return ruleThreeFour(number, a, b);
    }

    private static int ruleThreeFour(int number, int a, int b) {
        if (number >= 0) {
            a = 2 * number * a;
            b = (2 * number + 1) * b;
            return exit(--number, b, a + b);
        } else return exit(number, b, a + b);
    }
}
