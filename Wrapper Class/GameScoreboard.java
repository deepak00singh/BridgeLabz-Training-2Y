public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 30, 50, null, 40};

        int nullCount = 0, total = 0;

        for (Integer s : scores) {
            if (s == null) nullCount++;
            else total += s;
        }

        System.out.println("Players not played: " + nullCount);
        System.out.println("Total valid score: " + total);
    }
}
