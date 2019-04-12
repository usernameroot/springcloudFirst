package wy.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangYing
 * @create 2019-04-07-16:16
 */
@RestController
public class TestHandler {
    @Value("${server.port}")
    private int port;


    @RequestMapping("index")
    public String index(){

        return "HELLO WORLD！  端口是"+port;
    }

}
