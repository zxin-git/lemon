package com.zxin.java.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@FeignClient(name = "uke-eupheme", path = "/business", url = "http://localhost:8888")
public interface BusFeignService {

    @PostMapping("/register")
    Result<String> result(@RequestParam String name);

}
