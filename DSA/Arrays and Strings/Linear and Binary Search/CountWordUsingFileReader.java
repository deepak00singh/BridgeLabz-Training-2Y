import java.io.*;

class CountWordUsingFileReader {
    public static void main(String[] args) throws Exception {
        String target = "java";
        int count = 0;

        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String w : words) {
                if (w.equals(target))
                    count++;
            }
        }

        System.out.println("Count: " + count);

        br.close();
        fr.close();
    }
}
