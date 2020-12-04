package com.example.demo.utils;
import org.springframework.stereotype.Service;
@Service
public class Printer{
    public void accept(Object t) {
       IConsumer<String> c = System.out::println;
       c.accept((String)t);
    }
   
}
