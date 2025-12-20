import java.util.Scanner;

public class lesson4While
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int x = Math.min(n1, n2);
        int y = Math.max(n1, n2);
        int i = x;
        while (i <= y) {
            System.out.print(i + " ");
            i++;
        }
        in.close();
    }
}