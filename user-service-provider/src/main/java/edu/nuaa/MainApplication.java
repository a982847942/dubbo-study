package edu.nuaa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author brain
 * @version 1.0
 * @date 2023/5/14 21:24
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
//        System.out.println(MainApplication.class.getClassLoader().getResource(""));
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("edu/nuaa/provider.xml");
        ioc.start();
        System.in.read();
    }
}
