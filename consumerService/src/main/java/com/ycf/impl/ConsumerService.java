package com.ycf.impl;

import com.ycf.inter.IConsumerDAO;
import com.ycf.inter.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sniper on 16-8-11.
 */
@Service
public class ConsumerService implements IConsumerService {

    @Autowired
    IConsumerDAO consumerDAO;

    public void getInit(String str){
        consumerDAO.getResult(str);
    }
}
