package org.javatop.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-01 22:30
 * @description :
 */
@Controller
public class HelloController {

    @GetMapping("/test")
    public String hello(){
        return "first";
    }
}
