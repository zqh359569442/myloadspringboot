package com.stlskyeye.stlapp;

import com.stlskyeye.stlapp.server.IRedisServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class RedisSwitchManageController {
    @Autowired
    private IRedisServer redisServer;

    @RequestMapping(value="/redis/{mmm}",method = RequestMethod.GET)
    @ResponseBody
    public String  setRedis(@PathVariable("mmm") String page){
        redisServer.setKey(page,"sssss");
        return "success";
    }
}
