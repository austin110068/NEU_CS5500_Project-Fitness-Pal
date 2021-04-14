package edu.neu.fitnesspal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author valentinzhao
 * @since 2021/4/8
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "This is ok.";
    }

}
