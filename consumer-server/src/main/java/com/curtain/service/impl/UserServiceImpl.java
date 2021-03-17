package com.curtain.service.impl;

import com.curtain.service.TicketService;
import com.curtain.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author ：Curtain
 * @date ：Created in 2021/3/17 17:40
 * @description：TODO
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Reference
    TicketService ticketService;


    @Override
    public void buyTicket() {
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到=》" + ticket);
    }
}
