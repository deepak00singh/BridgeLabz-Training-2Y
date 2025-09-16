import java.util.Scanner;

public class Problem5_Palindrome {
    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not Palindrome");
    }
}