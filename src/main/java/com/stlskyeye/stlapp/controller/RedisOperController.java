package com.stlskyeye.stlapp.controller;

import com.stlskyeye.stlapp.domain.Redis;
import com.stlskyeye.stlapp.server.impl.RedisServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RedisOperController {

    @Autowired
    private RedisServer redisServer;


    @RequestMapping(value = "redis/search", method = RequestMethod.GET)
    @ResponseBody
    public List<Redis> searchRedis(){
        List<Redis> result =  getList();
        return result;
    }

    @RequestMapping(value = "redis/insert", method = RequestMethod.GET)
    public void insert(){
        List<Redis> result =  getList();
        redisServer.insertRedisInfo(result.get(0));
    }

    public List<Redis>   getList(){
        List<Redis> result = new ArrayList<Redis>();
        for(int i=1;i<10;i++){
            Redis redis = new Redis();
            redis.setId(""+i);
            redis.setRedisName("js");
            redis.setCreateName("zqh");
            redis.setMemo("192.168.1.1 192.168.2.2");
            redis.setModifyName("zqh");
            redis.setPowerName("zqh");
            redis.setSwitchName("jsswitch");
            redis.setSwitchStatus("OFF");
            result.add(redis);
        }
        return result;
    }
}
