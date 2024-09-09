import java.net.InetAddress;
import java.util.Random;

public class DomainEvasionExample {
    public static void main(String[] args) {
        try {
            Random random = new Random();
            String domain = "www.random" + random.nextInt(1000) + ".com";
            
            // Simulate DNS resolution
            InetAddress address = InetAddress.getByName(domain);
            System.out.println("Resolved IP for domain " + domain + ": " + address.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
