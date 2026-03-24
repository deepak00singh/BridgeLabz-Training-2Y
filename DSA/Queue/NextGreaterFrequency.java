import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterFrequency {
    public static int[] findNextGreaterFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : arr) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty()
                    && frequency.get(arr[i]) > frequency.get(arr[stack.peek()])) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 2, 1};
        int[] result = findNextGreaterFrequency(arr);

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Next Greater Frequency: " + Arrays.toString(result));
    }
}
