import java.util.Scanner;

public class lesson6
{
    public static void main(String[] args)
    {
           Scanner in = new Scanner(System.in);
           int size = 0;
           while (size <= 0)
           {
               System.out.print("Введите размер: ");
               if (in.hasNextInt())
               {
                   size = in.nextInt();
                   if (size <= 0) System.out.println("Должно быть > 0!");
               }
               else
               {
                   System.out.println("Это не число!");
                   in.next();
               }
           }

           int[] number = new int[size];
           for (int i = 0; i < size; i++)
           {
               number[i] = 5 * i + 2;
           }

        System.out.print("Массив: ");
           for (int num : number)
           {
               System.out.print(num + " ");
           }
    }
}
