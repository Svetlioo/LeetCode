package TopInterview150Easy;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon ";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWordNoRegex(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");
        return arr[arr.length - 1].length();
    }

    public static int lengthOfLastWordNoRegex(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                return length;
            }
        }
        return length;
    }
}
