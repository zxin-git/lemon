package com.zxin.java.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxin
 */
@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusFeignService feignService;

    @GetMapping("/result")
    public Result<String> result(@RequestParam String name){
        return feignService.result(name);
    }
}
