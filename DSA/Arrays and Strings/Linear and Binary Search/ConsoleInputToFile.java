import java.io.*;

class ConsoleInputToFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("output.txt");

        String input;
        while (true) {
            input = br.readLine();
            if (input.equals("exit"))
                break;
            fw.write(input + "\n");
        }

        fw.close();
        br.close();
    }
}
