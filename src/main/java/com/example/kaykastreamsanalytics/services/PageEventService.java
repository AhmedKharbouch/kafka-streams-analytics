package com.example.kaykastreamsanalytics.services;

import com.example.kaykastreamsanalytics.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Service
public class PageEventService {

    //deploye a consumer to get data and show it
    @Bean
    public Consumer<PageEvent> pageEventConsumer() {
        return (input) -> {
            System.out.println("********************");
            System.out.println(input.toString());
            System.out.println("********************");
        };
    }
    //deploye generate data every 1000 ms
    @Bean
    public Supplier<PageEvent> pageEventSupplier() {
        return () -> new PageEvent(null,
                Math.random() > 0.5 ? "P1" : "P2",
                Math.random() > 0.5 ? "U1" : "U2",
                new Date(),
                new Random().nextInt(9000));
    }
    //get PageEvent data modify it and return it
    @Bean
    public Function<PageEvent, PageEvent> pageEventFunction() {
        return (input) -> {
            input.setUser_name(input.getUser_name().toUpperCase()+"-MODIFIED");
            return input;
        };
    }
}
