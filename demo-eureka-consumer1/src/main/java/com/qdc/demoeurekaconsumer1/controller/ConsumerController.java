package com.qdc.demoeurekaconsumer1.controller;


import com.qdc.demoeurekaserver1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/userall")
    public String testalluser() {
        return restTemplate.getForObject("http://eureka-provider1/user/userall", String.class);
    }

    @RequestMapping(value = "/details/{userid}")
    public String testgetUserById(@PathVariable(value = "userid") String id) {
        System.out.println(id);
        return restTemplate.getForObject("http://eureka-provider1/user/details?userid=" + id, String.class);
    }

    @RequestMapping(value = "/adduser")
    @ResponseBody
    public ResponseEntity<String> testadduser(@RequestBody User user) {
        return restTemplate.postForEntity("http://eureka-provider1/user/adduser", user, String.class);
    }

    @RequestMapping(value = "/port")
    public String testport(){
        return restTemplate.getForObject("http://eureka-provider1/port/userall",String.class);
    }
}