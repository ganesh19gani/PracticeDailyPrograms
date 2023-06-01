public class RemoveDigitsSpecial {
    public static void main(String[] args) {
        String str ="Ganesh!@##$1223Mahesh)Balu";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                result = result+str.charAt(i);
            }

        }
        System.out.println(result);

    }
}
