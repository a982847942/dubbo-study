package edu.nuaa.sercice.impl;

import edu.nuaa.bean.UserAddress;
import edu.nuaa.service.OrderService;
import edu.nuaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 * @author brain
 * @version 1.0
 * @date 2023/5/14 20:52
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    @Override
    public void initOrder(String userId) {
        System.out.println("用户id：" + userId);
        //Auto-generated method stub
        //1.查询用户的收获地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
    }
}
