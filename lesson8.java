public class lesson8 {
    public static void main(String[] args)
    {
        char[] arr = new char[10];
        int start = 0;

        for (char c = 'A'; c <= 'Z'; c++)
        {
            if (c != 'A' && c != 'E' && c != 'I')
            {
                arr[start++] = c;
                if (start == 10) break;
            }
        }

        for (char c : arr)
        {
            System.out.print(c + " ");
        }
    }
}
