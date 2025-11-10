public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Running background task...");
        Thread thread = new Thread(job);
        thread.start();
    }
}
