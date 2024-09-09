import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class EncryptionExample {
    public static void main(String[] args) throws Exception {
        // Generate a key for encryption
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();

        // Create a Cipher for encryption
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Encrypt data
        String originalText = "Malicious Code";
        byte[] encryptedText = cipher.doFinal(originalText.getBytes());
        System.out.println("Encrypted Code: " + new String(encryptedText));

        // Decrypt data (to simulate executing malicious code at runtime)
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedText = cipher.doFinal(encryptedText);
        System.out.println("Decrypted Code: " + new String(decryptedText));
    }
}
