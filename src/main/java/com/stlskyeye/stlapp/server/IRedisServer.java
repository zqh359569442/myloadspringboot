package com.stlskyeye.stlapp.server;

import com.stlskyeye.stlapp.domain.Redis;

public interface IRedisServer {

    /**
     * 新增redis集群信息
     */
    public void insertRedisInfo(Redis json);


    public void setKey(String key,String value);

}
