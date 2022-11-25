package com.atguigu.springcloud.Service.impl;

import com.atguigu.springcloud.Service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer ID){
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_OK" + ID + "\t" + "^_^";
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler" , commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_TimeOut(Integer ID) {
//        int age = 10/0;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeOut" + ID + "\t" + "^_^";
    }


    @Override
    public String paymentInfo_TimeOutHandler(Integer ID){
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeOutHandler" + ID + "\t" + "o(╥﹏╥)o";

    }
}
