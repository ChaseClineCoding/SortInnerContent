import java.util.Arrays;

public class Kata {

    public static String sortTheInnerContent(String words) {
        String[] splitWords = words.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].length() > 2) {
                splitWords[i] = splitWords[i].substring(0,1) + reverseSort(splitWords[i].substring(1,splitWords[i].length() - 1).toCharArray()) + splitWords[i].substring(splitWords[i].length()-1);
            }
        }
        return String.join(" ", splitWords);
    }

    private static String reverseSort(char[] arr) {
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            result.append(arr[i]);
        }
        return result.toString();
    }
}
