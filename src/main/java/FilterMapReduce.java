import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilterMapReduce {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ganesh","Mahesh","Suresh","Ganesh");

        // distinct
       // list.stream().distinct().forEach(System.out::println);


        // filter
        //list.stream().filter(x-> x.startsWith("M")).forEach(System.out::println);

        //map
      //  list.stream().distinct().filter(x-> x.startsWith("M")).map(x-> x.toUpperCase()).forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(1,20,50);
        long a = list1.stream().mapToInt(x-> x.intValue()).limit(2).count();
        System.out.println(a);
    }
}
