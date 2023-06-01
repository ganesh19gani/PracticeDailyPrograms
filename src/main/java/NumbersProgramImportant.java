import java.util.Arrays;
import java.util.List;

public class NumbersProgramImportant {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,90,9,5,32);
        list.stream().map(ele -> String.valueOf(ele)).filter(ele -> ele.startsWith("1")).forEach(System.out::println);

    }
}
