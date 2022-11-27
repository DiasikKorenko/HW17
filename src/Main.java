import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Здаствуйте!Введите ваш IP: ");
        String input = scanner.nextLine();

        boolean result = input.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
        if (result) {
            System.out.println("It is ip address");
        } else {
            System.out.println("It is not a ip address!");
        }
    }
}