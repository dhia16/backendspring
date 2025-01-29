package Formation.Formation.jwt;

import java.util.Base64;
import java.security.SecureRandom;
public class JwtSecretGenerator  {

	public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[32]; // 256 bits
        secureRandom.nextBytes(key);
        String secretKey = Base64.getEncoder().encodeToString(key);
        System.out.println("Clé secrète générée : " + secretKey);
    }
}