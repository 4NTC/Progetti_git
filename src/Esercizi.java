import java.util.Arrays;

public class Esercizi {

    public static Object[][] createArrV1(String str){

        str = removeBlank(str);

        Object[][] array = new Object[2][str.length()];
        for (int i = 0; i<str.length(); i++) {
           array[0][i] = str.charAt(i);
           array[1][i] = (int) str.charAt(i);
        }

        return array;

    }

    public static String removeBlank(String str) {

        String new_str = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                new_str += c;
            }
        }
        return new_str;
    }

    public static void main(String[] args) {

        String str = "AA 2 Z  A";

        System.out.println(Arrays.deepToString(createArrV1(str)));

    }
}
