import java.util.Arrays;
import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        char[] arr = new char[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = (char) ('а' + 2 * i);
        }
        System.out.print("Прямой порядок: ");
        for (char c : arr)
        {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Обратный порядок: ");
        for (int i = n - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        in.close();

    }
}
