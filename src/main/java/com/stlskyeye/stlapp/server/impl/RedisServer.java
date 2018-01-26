package com.stlskyeye.stlapp.server.impl;

import com.stlskyeye.stlapp.domain.Redis;
import com.stlskyeye.stlapp.mapper.RedisMapper;
import com.stlskyeye.stlapp.server.IRedisServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServer implements IRedisServer{
    @Autowired
    private RedisMapper redisMapper;
    @Autowired
    private StringRedisTemplate redislogTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * 新增
     * @param json
     */
    public void insertRedisInfo(Redis json){

        redisMapper.insertRedisInfo(json);
    }

    @Override
    public void setKey(String key, String value) {
        redislogTemplate.opsForValue().set(key,value);
        redisTemplate.opsForValue().set(key,value);
    }

}
