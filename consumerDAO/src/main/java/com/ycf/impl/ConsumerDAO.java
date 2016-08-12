package com.ycf.impl;

import com.ycf.inter.IConsumerDAO;
import org.springframework.stereotype.Component;

/**
 * Created by sniper on 16-8-11.
 */
@Component
public class ConsumerDAO implements IConsumerDAO {

    public void getResult(String str){
        System.out.println("The consumer result is : "+str);
    }
}
