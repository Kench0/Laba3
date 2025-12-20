import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел Фибоначии вывести?");
        int n = in.nextInt();

        long a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            if (i > 2) {
                long number = a + b;
                a = b;
                b = number;
            }
            System.out.print((i > 1 ? " " : "") + (i == 1 || i == 2 ? 1 : b));
        }
        in.close();
        System.out.println();
    }
}
