package com.curtain;

import com.curtain.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ：Curtain
 * @date ：Created in 2021/3/17 17:42
 * @description：TODO
 */
@SpringBootTest
public class ConsumerServerApplicationTests {
    
    @Autowired
    UserService userService;
    
    @Test
    void contextLoads(){
        userService.buyTicket();
    }
}
