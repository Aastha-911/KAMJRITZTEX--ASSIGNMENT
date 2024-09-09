import java.io.IOException;

public class ProcessCreationExample {
    public static void main(String[] args) {
        try {
            // Create a new process (e.g., notepad.exe)
            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
            Process process = processBuilder.start();
            System.out.println("Process started: " + process.pid());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
