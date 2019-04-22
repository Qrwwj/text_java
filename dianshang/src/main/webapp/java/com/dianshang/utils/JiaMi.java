package com.dianshang.utils;

import com.thoughtworks.xstream.core.util.Base64Encoder;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
public class JiaMi {

    /*
    * 定义一个加密的方法
    *   相当于加上一把锁  加锁的同时还需要一把钥匙---解密
    *   1  图纸---一切按照”图纸“来设计
    *   2 设计
    *   3 生产
    *
    * */
//    首先定义一个方法
//    设计加密因子  "abcd"---随便
    public static String seed="abcd";
    public static SecureRandom random=new SecureRandom(seed.getBytes());
    public static  String encodeStr(String str){
        String result="";
        try {
//            生成图纸
            KeyGenerator keyGenerator=KeyGenerator.getInstance("DES");  /*单例模式   DES---加密规则*/
            keyGenerator.init(random);       /*进行初始化*/

//            生成图纸后 需要按照图纸去做相应设计
            Cipher cipher=Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE,keyGenerator.generateKey());
//            开始加密
            byte[]bytes=cipher.doFinal(str.getBytes());
            Base64Encoder base64Encoder=new Base64Encoder();
            result=base64Encoder.encode(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return result;
    }
    /*解密*/
    public static String decodeStr(String str){
        String result="";

        //            生成图纸
        KeyGenerator keyGenerator= null;  /*单例模式   DES---加密规则*/
        try {
            keyGenerator = KeyGenerator.getInstance("DES");
            keyGenerator.init(random);       /*进行初始化*/

//            生成图纸后 需要按照图纸去做相应设计
            Cipher cipher=Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE,keyGenerator.generateKey());
            Base64Encoder base64Encoder=new Base64Encoder();
            byte[] bytes=base64Encoder.decode(str);
            result=new String(cipher.doFinal(bytes));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }


        return  result;

    }

    public static void main(String[] args) {
        System.out.println(decodeStr("B2f+4yHHTgM="));


    }
}
