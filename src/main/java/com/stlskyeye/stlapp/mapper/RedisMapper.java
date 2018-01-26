package com.stlskyeye.stlapp.mapper;

import com.stlskyeye.stlapp.domain.Redis;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RedisMapper {

    public void insertRedisInfo(Redis redis);
}
