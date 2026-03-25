import java.util.*;

public class NextGreaterFrequency {

    public static int[] solve(int[] arr) {

        // ✅ 1. Frequency count (simple tarika)
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            if (freq.containsKey(val)) {
                freq.put(val, freq.get(val) + 1);
            } else {
                freq.put(val, 1);
            }
        }

        // ✅ 2. Result array (manually fill -1)
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }

        // ✅ 3. Stack (same)
        Stack<Integer> st = new Stack<>();

        // 🔥 Main logic (same as yours)
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