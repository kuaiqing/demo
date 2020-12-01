package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value = "/demo/{id}")
    public String demo(@PathVariable(value = "id") String id,
//                       @CookieValue(value = "JSESSIONID") String cookValue,
             @RequestHeader(value = "Accept-Encoding") String aa){
        logger.info("id{}----"+id);
//        logger.info("JSESSIONID{}----"+cookValue);
        logger.info("aa{}----"+aa);
        return id;

    }
}
