import java.util.Scanner;

public class timus1005 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            w[i] = in.nextInt();
            count += w[i];
        }
        int half = count / 2;
        boolean[] del = new boolean[half + 1];
        del[0] = true;
        for (int weight : w)
        {
            for (int k = half; k >= weight; k--)
            {
                if (del[k - weight])
                {
                    del[k] = true;
                }
            }
        }
        int max = 0;
        for (int i = half; i >= 0; i--)
        {
            if (del[i])
            {
                max = i;
                break;
            }
        }
        System.out.println(count - 2 * max);
        in.close();
    }
}
