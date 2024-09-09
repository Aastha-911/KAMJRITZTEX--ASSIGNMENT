public class SandboxEvasionExample {
    public static void main(String[] args) {
        // Check system resources (e.g., memory and CPU cores)
        long freeMemory = Runtime.getRuntime().freeMemory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();

        if (freeMemory < 200 * 1024 * 1024 || availableProcessors < 2) {
            System.out.println("Possible Sandbox Detected!");
            System.exit(0); // Exit if sandbox detected
        } else {
            System.out.println("System resources are normal.");
        }
    }
}
