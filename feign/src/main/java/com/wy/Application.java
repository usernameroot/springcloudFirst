package com.wy;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author WangYing
 * @create 2019-04-11-16:18
 */
@SpringCloudApplication
@EnableFeignClients      //开启openfeign
@EnableHystrixDashboard  //开启熔断器的监控器
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet ss=new HystrixMetricsStreamServlet();
        ServletRegistrationBean bean=new ServletRegistrationBean(ss);
        bean.setLoadOnStartup(1);
        bean.addUrlMappings("/hystrix.stream");
        bean.setName("HystrixMetricsStreamServlet");
        return bean;

    }

}
