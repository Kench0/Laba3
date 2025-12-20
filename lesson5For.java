import java.util.Scanner;

public class lesson5For
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");

        int n = in.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; count < n; i++) {
            if (i % 5 == 2 || i % 3 == 1)
            {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }
        System.out.println("\nСумма: " + sum);
        in.close();
    }
}
