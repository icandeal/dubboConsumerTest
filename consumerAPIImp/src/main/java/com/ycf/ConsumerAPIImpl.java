package com.ycf;

import com.ycf.inter.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sniper on 16-8-11.
 */
@Component
public class ConsumerAPIImpl implements ConsumerAPI {

    @Autowired
    IConsumerService consumerService;

    public void testConsumerAPI(String str){
        consumerService.getInit(str);
    }
}
