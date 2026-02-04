import java.util.*;

class LinearAndBinarySearchChallenge {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        boolean[] present = new boolean[arr.length + 1];

        for (int x : arr) {
            if (x > 0 && x <= arr.length)
                present[x] = true;
        }

        int missing = 1;
        for (int i = 1; i < present.length; i++) {
            if (!present[i]) {
                missing = i;
                break;
            }
        }

        Arrays.sort(arr);
        int target = 3;
        int index = Arrays.binarySearch(arr, target);

        System.out.println("Missing: " + missing);
        System.out.println("Index: " + index);
    }
}
