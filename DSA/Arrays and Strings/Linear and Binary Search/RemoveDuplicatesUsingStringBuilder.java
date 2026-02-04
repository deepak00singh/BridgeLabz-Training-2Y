import java.util.HashSet;

class RemoveDuplicatesUsingStringBuilder {
    public static void main(String[] args) {
        String str = "programming";

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
