public class DifferentMaxelement {

    public static void countDistanceDifference(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int max = arr[i];
            int maxIndex = i;

            for (int j = i; j < arr.length; j++) {

                // update max agar new element bada ho
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }

                int distFromStart = maxIndex - i;
                int distFromEnd = j - maxIndex;

                int diff = Math.abs(distFromStart - distFromEnd);

                System.out.println("[" + i + "," + j + "] -> " + diff);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 8};
        countDistanceDifference(arr);
    }
}