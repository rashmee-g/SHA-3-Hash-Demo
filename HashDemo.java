import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;

public class HashDemo {
    public static String hash(String algo, String msg) throws Exception {
        MessageDigest digest = MessageDigest.getInstance(algo);
        byte[] hash = digest.digest(msg.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String msg = "amount=100";

        System.out.println("Message: " + msg);
        System.out.println("SHA-256:     " + hash("SHA-256", msg));
        System.out.println("SHA3-256:    " + hash("SHA3-256", msg));

        String extended = msg + "&amount=10000";
        System.out.println("\nExtended Message: " + extended);
        System.out.println("SHA-256 Extended:  " + hash("SHA-256", extended));
        System.out.println("SHA3-256 Extended: " + hash("SHA3-256", extended));
    }
}
