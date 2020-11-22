package com.zxin.java.http.convert.impl;

import com.zxin.java.http.convert.IDeserializer;

import java.io.IOException;

/**
 * Singleton
 * @author zxin
 */
public class StringDeserializer implements IDeserializer<String> {

    private static final StringDeserializer INSTANCE = new StringDeserializer();

    private StringDeserializer(){}

    @Override
    public String convert(String content) throws IOException {
        return content;
    }

    public static StringDeserializer getInstance(){
        return INSTANCE;
    }
}
