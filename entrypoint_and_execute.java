public class ThreadExecutionExample {
    public static void main(String[] args) {
        Runnable maliciousTask = () -> {
            System.out.println("Executing malicious code...");
            // Malicious code goes here
        };

        Thread thread = new Thread(maliciousTask);
        thread.start(); // This simulates starting a new thread with malicious code
    }
}
