import sun.awt.image.IntegerInterleavedRaster;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaEightPractice {
    public static void main(String[] args) {

        // String of arr methods
       /* String arr[] = new String[5];
        arr[0] = "Ganesh";
        arr[1] = "Mahesh";
         List<String> s = Arrays.stream(arr).distinct().collect(Collectors.toList());
         System.out.println(s);
        */

        List<String> list = Arrays.asList("Ganesh","Mahesh","Jagadesh");
    //    list.stream().map(x-> x.toUpperCase()).filter(x-> x.startsWith("G")).collect(Collectors.toList()).forEach(System.out::println);

         // skip
//list.stream().skip(1).forEach(System.out::println);

        // limit
  //      list.stream().limit(2).forEach(System.out::println);


        // findFirst
//        Optional<String> s = list.stream().findFirst();
//        System.out.println(s.get());

        //count

//        Long length = list.stream().filter(x-> x.startsWith("G")).count();
//        System.out.println(length);
    }
}
