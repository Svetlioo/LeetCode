package TopInterview150Medium;

public class ReverseWordsinaString {
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder a = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            a.append(arr[i]);
            if (i > 0) {
                a.append(" ");
            }
        }

        return a.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  the  sky  is  blue     "));
    }
}
