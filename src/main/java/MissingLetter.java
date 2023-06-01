public class MissingLetter {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10};
        int sumOfNaturalNumbers = (10 * 11) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        System.out.println(String.format("The Missing letter is %s", (sumOfNaturalNumbers - actualSum)));
    }
}
