package com.chryl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2021/1/3.
 *
 * @author Chr.yl
 */
@RestController
public class ServiceController {

    @GetMapping("/elk_show")
    public Object show() {

        int i = 1 / 0;
        return "success";
    }
}
