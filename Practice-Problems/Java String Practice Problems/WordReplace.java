public class WordReplace {
    public static void main(String[] args) {
        String sentence = "I love Java programming";
        String wordToReplace = "Java";
        String newWord = "Python";
        String result = sentence.replaceAll(wordToReplace, newWord);
        System.out.println("Modified: " + result);
    }
}