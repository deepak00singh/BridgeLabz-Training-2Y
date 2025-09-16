public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "abcabcabc";
        String sub = "abc";
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        System.out.println("Occurrences: " + count);
    }
}