package com.inspur.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: YANG
 * Date: 2019/6/11-12:28
 * Description: No Description
 */
@RestController
@Slf4j
public class OrderController {

    @RequestMapping("/orderIndex")
    public String orderIndex(){
        log.info("日志打印成功");
        return "orderIndex";
    }

}
