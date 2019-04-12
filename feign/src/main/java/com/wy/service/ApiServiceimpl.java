package com.wy.service;

import org.springframework.stereotype.Component;

/**
 * @author WangYing
 * @create 2019-04-12-13:42
 */
//添加到spring容器里
@Component
public class ApiServiceimpl implements ApiService {
    @Override
    public String index() {
        return "服务器发生故障";
    }
}
