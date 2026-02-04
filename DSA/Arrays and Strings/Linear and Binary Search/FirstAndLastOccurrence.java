class FirstAndLastOccurrence {
    static int findFirst(int[] arr, int target) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                ans = mid;
                r = mid - 1;
            } else if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return ans;
    }

    static int findLast(int[] arr, int target) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                ans = mid;
                l = mid + 1;
            } else if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        int target = 2;

        System.out.println(findFirst(arr, target));
        System.out.println(findLast(arr, target));
    }
}
