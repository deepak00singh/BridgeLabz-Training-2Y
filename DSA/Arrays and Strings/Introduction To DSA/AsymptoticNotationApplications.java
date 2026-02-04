package IntroductionToDSA;
import java.util.Arrays;

public class AsymptoticNotationApplications {

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Merge Sort
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, l, temp.length);
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 8, 4, 2};

        int[] a1 = data.clone();
        bubbleSort(a1);
        System.out.println("Bubble Sort: " + Arrays.toString(a1));

        int[] a2 = data.clone();
        insertionSort(a2);
        System.out.println("Insertion Sort: " + Arrays.toString(a2));

        int[] a3 = data.clone();
        mergeSort(a3, 0, a3.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(a3));
    }
}
