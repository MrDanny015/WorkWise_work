package com.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@RabbitListener(queues = "queuecc")
public class ReceiveMsg {

//    private Logger logger = LoggerFactory.getLogger(ReceiveMsg.class);
//
//    @Resource
//    private LeaveMapper leaveMapper;
//
//
//    @RabbitHandler//处理消息   消费消息
//    public void receive(Leave leave) {
//        logger.info("================消息被消费了" + leave);
//        leaveMapper.insert(leave);
//    }
}
