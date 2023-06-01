import java.util.StringJoiner;

public class StringRelatedPrograms {
    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        stringJoiner.add("A").add("B");

        StringJoiner stringJoiner1 = new StringJoiner(":");
        stringJoiner1.add("P").add("Q");


        StringJoiner merge = stringJoiner.merge(stringJoiner1);
        System.out.println(merge);


    }
}
