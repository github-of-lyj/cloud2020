package com.atguigu.springcloud.service.imlp;

import com.atgui.springcloud.entities.Payment;
import com.atguigu.springcloud.dao.PaymentMapper;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(long id){
        return paymentDao.getPaymentById(id);
    }
}
