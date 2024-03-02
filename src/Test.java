import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.Base64;

public class Test {
    public static void main(String[] args) {
        String md5 = transToMD5("123456");
        System.err.println("md5-->" + md5);
        boolean equals = md5.equals("4QrcOUm6Wau+VuBX8g+IPg==");
        System.err.println(md5.equals("4QrcOUm6Wau+VuBX8g+IPg=="));
        if (equals){
            System.err.println("登录成功");
        }else {
            System.err.println("登录失败");
        }
    }

    public static void WhatIsYouName(String name) {
        System.err.println("this name is " + name);
        System.out.println(name);
    }

    public static void HelloWorld(String charAlt) {
        System.err.println("this HelloWorld is " + charAlt);
    }

    //使用MD5对字符串进行加密
    private static String transToMD5(String password) {

        try {
            //获取消息摘要对象
            MessageDigest md = MessageDigest.getInstance("md5");
            //通过MD5计算摘要，返回byte数组形式
            byte[] b = md.digest(password.getBytes());
            /*
             * Base64算法将 byte数组转换成可保存的字符串（a-z A-Z 0-9 * /）形式
             */
            String str = Base64.getEncoder().encodeToString(b);
            return str;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
