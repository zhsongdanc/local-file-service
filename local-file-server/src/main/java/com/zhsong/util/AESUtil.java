package com.zhsong.util;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.KeyManager;
import org.apache.logging.log4j.util.Base64Util;
import sun.misc.BASE64Encoder;

/*
 * @Author: demussong
 * @Description:
 * @Date: 2023/11/3 17:03
 */
public class AESUtil {

    public static String getRandomStrKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256, new SecureRandom(String.valueOf(System.currentTimeMillis()).getBytes(StandardCharsets.UTF_8)));
        SecretKey secretKey = keyGenerator.generateKey();
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

//    public static String getSpecifyStrKey(String originKey) {
//
//    }

    public static SecretKey strKey2SecretKey(String strKey) {
        byte[] decode = Base64.getDecoder().decode(strKey.getBytes(StandardCharsets.UTF_8));
        return new SecretKeySpec(decode,"AES");
    }


    public static byte[] encrypt(byte[] plainText, SecretKey key)
            throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException {

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        return cipher.doFinal(plainText);
    }

    public static String encrypt2Base64Str(byte[] plainText, SecretKey key) {


    }


    public static byte[] decrypt(byte[] cipher, SecretKey key) {

    }

    public static byte[] decryptFromBase64Str(String cipher, SecretKey key) {

    }


}
