import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class timus1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int N = in.nextInt();
        int min = Math.min(1, N);
        int max = Math.max(1, N);
        long sum = (long)(max - min + 1) * (min + max) / 2;
        System.out.println(sum);
    }
}
