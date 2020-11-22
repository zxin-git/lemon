package com.zxin.java.http;

import lombok.Data;

/**
 * @author zxin
 */
//@Component
//@ConfigurationProperties(prefix = "hz.hhub.http.okhttp")
@Data
public class HttpClientProperties {

    private static final long DEFAULT_TIMEOUT = 1000L;

    private long connectTimeout;

    private long readTimeout;

    private long writeTimeout;


    private int maxIdle;

    private long keepAliveSecond;



}
