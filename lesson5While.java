import java.util.Scanner;

public class lesson5While
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = in.nextInt();

        int count = 0;
        int num = 1;
        int sum = 0;

        while (count < n)
        {
            if (num % 5 == 2 || num % 3 == 1)
            {
                System.out.print(num + " ");
                count++;
                sum += num;
            }
            num++;
        }
        System.out.println("\nСумма: " + sum);
    }
}
