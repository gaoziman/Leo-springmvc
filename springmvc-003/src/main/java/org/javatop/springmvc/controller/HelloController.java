package org.javatop.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-06 20:33
 * @description :
 */
@Controller
public class HelloController {
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
