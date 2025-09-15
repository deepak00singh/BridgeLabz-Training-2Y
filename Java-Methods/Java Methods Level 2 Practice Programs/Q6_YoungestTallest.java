import java.util.*;
class Q6_YoungestTallest {
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[minIndex]) minIndex = i;
        return minIndex;
    }
    public static int findTallest(int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[maxIndex]) maxIndex = i;
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();
        int y = findYoungest(ages);
        int t = findTallest(heights);
        String[] names = {"Amar","Akbar","Anthony"};
        System.out.println("Youngest: " + names[y]);
        System.out.println("Tallest: " + names[t]);
    }
}