package com.atguigu.springcloud.Service.impl;

import com.atguigu.springcloud.Service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer ID){
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_OK" + ID + "\t" + "^_^";
    }

    @Override
    public String paymentInfo_TimeOut(Integer ID) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_OK" + ID + "\t" + "^_^";
    }
}
