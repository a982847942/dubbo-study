package edu.nuaa;

import edu.nuaa.sercice.impl.OrderServiceImpl;
import edu.nuaa.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author brain
 * @version 1.0
 * @date 2023/5/14 21:49
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderServiceImpl orderService = applicationContext.getBean(OrderServiceImpl.class);
        orderService.initOrder("1");
        System.out.println("调用完成....");
        System.in.read();
    }
}
