import java.util.Scanner;

public class ExEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNum = scanner.nextInt();
        String str1 = Integer.toString(firstNum);

        System.out.println("Введите второе число: ");
        int secondNum = scanner.nextInt();

        int result1 = Math.max(firstNum, secondNum);
        System.out.println("max = " + result1);

        double result2 = Math.min(firstNum, secondNum);
        System.out.println("min = " + result2);
    }
}
