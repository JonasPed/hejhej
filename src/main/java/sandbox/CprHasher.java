package sandbox;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CprHasher {
    private static final String SHA_1 = "SHA-1";


    public static String hash(String string) throws NoSuchAlgorithmException {
            MessageDigest digest = MessageDigest.getInstance(SHA_1);
            digest.reset();
            byte[] bytes = digest.digest(string.getBytes());
            return getHex(bytes);
    }

    public static String getHex(byte[] raw) {
        if (raw == null) {
            return null;
        }
        final StringBuilder hex = new StringBuilder(2 * raw.length);
        for (final byte b : raw) {
            hex.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hex.toString();
    }

    private static final String HEXES = "0123456789ABCDEF";

}
