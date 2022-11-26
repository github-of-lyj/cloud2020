package com.atguigu.springcloud.Service;


import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService {

    public String paymentInfo_OK(Integer ID);

    public String paymentInfo_TimeOut(Integer ID);

    public String paymentInfo_TimeOutHandler(Integer id);

    public String paymentCircuitBreaker(@PathVariable("id") Integer id);


}
