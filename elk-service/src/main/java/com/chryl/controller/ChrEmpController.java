package com.chryl.controller;

import com.chryl.common.CommonPage;
import com.chryl.common.CommonResult;
import com.chryl.service.ChrEmpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Api(tags = "ChrEmpController", description = "Emp管理")
public class ChrEmpController {

    @Autowired
    private ChrEmpService chrEmpService;

    @ApiOperation(value = "测试异常")
    @GetMapping("/elk_show")
    public Object show() {

        int i = 1 / 0;
        return "success";
    }

    @ApiOperation(value = "测试查询所有")
    @GetMapping("selectEmpAll")
    public Object selectEmpAll() {
//        log.info("日志打印:" + CommonPage.restPage(chrEmpService.selectEmpAll()));
        return CommonResult.success(CommonPage.restPage(chrEmpService.selectEmpAll()));
    }


}
