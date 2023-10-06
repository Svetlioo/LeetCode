package TopInterview150Easy;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(Solution("anagram", "nagaram"));
        System.out.println(Solution("rat", "car"));
    }

    public static boolean Solution(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
