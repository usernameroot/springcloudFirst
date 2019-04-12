package com.wy.handler;

import com.wy.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author WangYing
 * @create 2019-04-12-13:45
 */
@RestController
public class ApiHandler {
    @Resource
    private ApiService apiService;

    @RequestMapping("index")
    public String index() {
        return apiService.index();
    }

}
