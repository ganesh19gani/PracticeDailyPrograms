

public class JavaEightFeatures {
    public static void main(String[] args) {

        FunctionalDemo fun = (int a, int b) -> {
            System.out.println("Ganesh "+ (a+b));
            String.format("Ganesh Sum is : %s ", (a+b));

        };
        fun.add(10, 30);
    }
}
