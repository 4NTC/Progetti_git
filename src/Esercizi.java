import java.util.Arrays;
import java.util.Calendar;

public class Esercizi {

    public static Object[][] createArrV1(String str){

        String new_str = removeBlank(str);

        Object[][] array = new Object[2][new_str.length()];
        for (int i = 0; i<new_str.length(); i++) {
           array[0][i] = new_str.charAt(i);
           array[1][i] = (int) new_str.charAt(i);
        }

        return array;

    }

    public static void createArrV2(String str){

        int blanks = 0;

        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' || c == '\n') {
                blanks += 1;
            }
        }

        String new_str;

        if (blanks > 0) {
            new_str = removeBlank(str);
        } else {
            new_str = str;
        }

        Object[][] array = new Object[2][new_str.length()];

        for (int i = 0; i<new_str.length(); i++) {
            array[0][i] = new_str.charAt(i);
            array[1][i] = (int) new_str.charAt(i);
        }

        System.out.println(Arrays.deepToString(array));
        if (blanks > 0) {
            Object[][] blank_arr = saveBlank(str, blanks);
            System.out.println(Arrays.deepToString(blank_arr));
        }
    }

    public static Object[][] saveBlank(String str, int blanks) {

        Object[][] blank_arr = new Object[2][blanks];

        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            /*
            switch (c) {
                case ' ':
                    blank_arr[0][index] = "\' \'";
                    blank_arr[1][index] = (int) c;
                    index += 1;
                    break;
                case '\n':
                    blank_arr[0][index] = "\\n";
                    blank_arr[1][index] = (int) c;
                    index += 1;
                    break;
                case '\t':
                    blank_arr[0][index] = "\\t";
                    blank_arr[1][index] = (int) c;
                    index += 1;
                    break;
                default:
                    break;
            }
            */

            if ((Character.toString(c)).isBlank()) {

                blank_arr[0][index] = "' '";
                blank_arr[1][index] = (int) c;
                index += 1;
            }
        }

        return blank_arr;
    }

    public static String removeBlank(String str) {

        String new_str = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(Character.toString(c).isBlank())) {
                new_str += c;
            }
        }
        return new_str;
    }

    public static void main(String[] args) {

        String str = "AA 2 Z  \nA";

        System.out.println(Arrays.deepToString(createArrV1(str)));
        createArrV2(str);
    }
}
