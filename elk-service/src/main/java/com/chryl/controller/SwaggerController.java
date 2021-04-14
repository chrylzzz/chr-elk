package com.chryl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * swagger 接口
 *
 * @author chryl
 */
@Controller
@RequestMapping("/tool/swagger")
public class SwaggerController {
    @GetMapping()
    public String index() {
        return "redirect:/swagger-ui.html";
    }

}
