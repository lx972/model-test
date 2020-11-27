package cn.lx.adaptor.v2;

import java.io.*;

/**
 * cn.lx.adaptor.v2
 *
 * @Author Administrator
 * @date 12:27
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //字节流
        FileInputStream fileInputStream = new FileInputStream("D:\\java学习\\saas多租户平台\\spring-test\\src\\main\\resources\\spring-context.xml");
        //典型的适配器模式，将字节流转化为字符流
        InputStreamReader reader = new InputStreamReader(fileInputStream);
        //字符流
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = bufferedReader.readLine();
        System.out.println(s);
    }
}
