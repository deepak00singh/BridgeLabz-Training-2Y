import java.util.*;
public class NextGreaterFrequency {
    public static int[] solve(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (freq.containsKey(val)) {
                freq.put(val, freq.get(val) + 1);
            } else {
                freq.put(val, 1);
            }
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && freq.get(arr[i]) > freq.get(arr[st.peek()])) {
                int index = st.pop();
                res[index] = arr[i];
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 2, 1};
        System.out.println(Arrays.toString(solve(arr)));
    }
}