package org.javatop.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-02 11:58
 * @description :
 */
@RequestMapping("/product")
@Controller
public class ProductController {

    @GetMapping("/info")
    public String info() {
        return "product/info";
    }
}
