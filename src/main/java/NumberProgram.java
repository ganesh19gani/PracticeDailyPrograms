import java.util.*;
import java.util.stream.Collectors;

public class NumberProgram {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee s = new Employee(1,"Ganesh",20000);
        Employee s1 = new Employee(2,"Ganesh",20000);

        Employee s2 = new Employee(3,"Ganesh",30000);
        list.add(s);
        list.add(s1);
        list.add(s2);

        // groupby salary
        Map<Double,List<Employee>> lists = list.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList()));
        lists.entrySet().forEach(doubleListEntry -> System.out.println(doubleListEntry.getKey()+" "+doubleListEntry.getValue()));

        // max salary
        Optional<Employee> sal = list.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(sal.get());


//       List<Integer> list = Arrays.asList(1,3,5,67,8,9);
//
//       list.stream().max(
    }
}
