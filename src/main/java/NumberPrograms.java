import java.util.ArrayList;
import java.util.List;

public class NumberPrograms {
    public static void main(String[] args) {
        int num = 12345;
        int reversenum = reversingNumber(num);
        System.out.println(String.format("Reversing of a Given String : %s", reversenum));

        //Polindrom or not


        List<String> list = new ArrayList<String>();
        list.add("Ganesh");

    }

    public static int reversingNumber(int num) {
        int reverse = 0;
        int digit = 0;
        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
}
