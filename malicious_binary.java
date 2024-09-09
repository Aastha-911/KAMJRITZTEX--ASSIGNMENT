import java.nio.ByteBuffer;

public class MemoryInjectionExample {
    public static void main(String[] args) {
        // Example of writing bytes (representing malicious code) into memory
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String maliciousCode = "Injected Malicious Code";
        buffer.put(maliciousCode.getBytes());

        System.out.println("Code injected into memory: " + new String(buffer.array()));
    }
}
