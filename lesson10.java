import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson10 {
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
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int num : arr)
        {
            System.out.print(num + " ");
        }

        in.close();
    }


}
