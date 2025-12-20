import java.util.Scanner;

public class lesson4For
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int x = Math.min(n1, n2);
        int y = Math.max(n1, n2);
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
        in.close();
    }
}
