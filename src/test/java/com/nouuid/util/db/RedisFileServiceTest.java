package com.nouuid.util.db;

import org.junit.Test;

/**
 * Created by nouuid on 2015/5/7.
 */
public class RedisFileServiceTest {

    @Test
    public void test() {
        String host = "127.0.0.1";
        int port = 6001;
        String password = "test123";//����(secret key)
        FileService fs = new RedisFileService(host, port, password);

    }
}
