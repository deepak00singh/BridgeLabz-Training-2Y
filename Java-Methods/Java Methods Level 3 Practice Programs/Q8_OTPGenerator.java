import java.util.*;
class Q8_OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    public static boolean allUnique(int[] arr) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int v: arr) s.add(v);
        return s.size() == arr.length;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = generateOTP();
        System.out.println(Arrays.toString(arr));
        System.out.println(allUnique(arr));
    }
}
