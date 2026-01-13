import java.util.Random;
import java.util.Scanner;

public class lesson9 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        for (int num : arr)
        {
            if (num < min) min = num;
        }

        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы: ");
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == min)
            {
                System.out.print(i + " ");
            }
        }

    }
}
