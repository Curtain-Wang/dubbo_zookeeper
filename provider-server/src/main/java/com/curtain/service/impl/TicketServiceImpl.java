package com.curtain.service.impl;

import com.curtain.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author ：Curtain
 * @date ：Created in 2021/3/16 15:07
 * @description：TODO
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "<<Curtain说Java>>";
    }
}
