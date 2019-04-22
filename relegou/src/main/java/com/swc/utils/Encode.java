package com.swc.utils;

import com.thoughtworks.xstream.core.util.Base64Encoder;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Encode {
//    加密和解密共有的部分放到静态代码块
    public static String seed="abcd";
    public static Cipher cipher=null;
    public static Key key=null;
    static {
//        图纸
    try {
        KeyGenerator keyGenerator=KeyGenerator.getInstance("DES");
        SecureRandom random=new SecureRandom("SHA1PRNG".getBytes());
        random.setSeed(seed.getBytes());
        keyGenerator.init(random);
        key = keyGenerator.generateKey();
//        设计
        cipher=Cipher.getInstance("DES");
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    } catch (NoSuchPaddingException e) {
        e.printStackTrace();
    }

    }
//    创建一个加密的方法
    public static String encodestr(String str){
        String result="";
//        设计
        try {
            cipher.init(cipher.ENCRYPT_MODE,key);
            byte[] bytes = cipher.doFinal(str.getBytes());
//            生产
            Base64Encoder base64Encoder=new Base64Encoder();
            result = base64Encoder.encode(bytes);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }

        return result;
    }
//    创建一个解密的方法
    public static String decodestr(String str){
        String result="";
        try {
//            设计
            cipher.init(cipher.DECRYPT_MODE,key);
//            生产
            Base64Encoder base64Encoder=new Base64Encoder();
            byte[] bytes = base64Encoder.decode(str);
            byte[] bytes1 = cipher.doFinal(bytes);
            result=new String(bytes1);

        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encodestr("123456"));
    }
}
