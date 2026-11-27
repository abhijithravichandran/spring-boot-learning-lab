package com.CodingShuttleBean.Explanation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void pay(){
        System.out.println("Paying...");
    }

//  This is used in Initailize step in bean lifecycle
    @PostConstruct
    public void afterInit(){
        System.out.println("Before paying..");
    }

    @PreDestroy
    public void afterDestroy(){
        System.out.println("After paying... ");
    }
}
