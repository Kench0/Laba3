import java.util.Scanner;

public class lesson2If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String word = in.next().toLowerCase();

        if (word.equals("понедельник")) {
            System.out.println("1");
        } else if (word.equals("вторник")) {
            System.out.println("2");
        } else if (word.equals("среда")) {
            System.out.println("3");
        } else if (word.equals("четверг")) {
            System.out.println("4");
        } else if (word.equals("пятница")) {
            System.out.println("5");
        } else if (word.equals("суббота")) {
            System.out.println("6");
        } else if (word.equals("воскресенье")) {
            System.out.println("7");
        } else {
            System.out.println("Такого дня нет");
        }

    }
}

