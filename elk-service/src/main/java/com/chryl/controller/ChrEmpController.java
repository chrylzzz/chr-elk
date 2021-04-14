package com.chryl.controller;

import com.chryl.common.CommonPage;
import com.chryl.common.CommonResult;
import com.chryl.service.ChrEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2021/4/12.
 *
 * @author Chr.yl
 */
@RestController
@RequestMapping("emp")
public class ChrEmpController {

    @Autowired
    private ChrEmpService chrEmpService;

    @GetMapping("selectEmpAll")
    public Object selectEmpAll() {
        return CommonResult.success(CommonPage.restPage(chrEmpService.selectEmpAll()));
    }


}
