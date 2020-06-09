package util;

import java.security.MessageDigest;

/**
 * @author H2410780
 * @title: MD5
 * @projectName Algorithm
 * @description: TODO
 * @date 2019/6/13下午 04:00
 */
public class Md5 {
    /**
     * 16bit encryption method
     */
    public static String EncoderBymd516(String str){
        return EncoderBymd532(str).substring(8,24);
    }
    /**
     *
     * @param 32bit encryption method
     * @return
     */
    public static String EncoderBymd532(String str){
        MessageDigest md5;
        try {
            md5=MessageDigest.getInstance("MD5");
            byte[] md5Bytes=md5.digest(str.getBytes());
            StringBuffer strbuff=new StringBuffer();
            for(int i=0;i<md5Bytes.length;i++){
                int val=(md5Bytes[i]) & 0xff;
                if(val<16){
                    strbuff.append("0");
                }
                strbuff.append(Integer.toHexString(val));
            }
            return strbuff.toString().toUpperCase();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
    }

}