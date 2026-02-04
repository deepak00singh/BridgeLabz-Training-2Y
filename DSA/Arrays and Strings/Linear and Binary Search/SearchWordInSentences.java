class SearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is easy",
            "DSA is important",
            "I love coding"
        };

        String word = "DSA";
        String result = "Not Found";

        for (String s : sentences) {
            if (s.contains(word)) {
                result = s;
                break;
            }
        }

        System.out.println(result);
    }
}
