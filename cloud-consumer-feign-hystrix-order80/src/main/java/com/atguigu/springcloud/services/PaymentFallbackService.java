package com.atguigu.springcloud.services;


import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "This is paymentInfo_OK --- PaymentFallbackService fall back,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "This is paymentInfo_TimeOut --- PaymentFallbackService fall back,o(╥﹏╥)o";
    }
}
