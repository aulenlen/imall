package com.mall.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {
    @GetMapping("/{page}.html")
    public String testPage(@PathVariable("page") String page) {
        return page;
    }
}
