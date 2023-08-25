import java.util.Scanner;

public class InputZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input; // Ввод пользователя

        while (true) {
            input = scanner.nextInt();
            if (input == 0){
                break;
            }
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}