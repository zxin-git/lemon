package com.zxin.java.http.convert;

import java.io.IOException;

/**
 * 反序列化器
 * O output
 */
public interface IDeserializer<O> extends IConverter<String, O>{


    O convert(String content) throws IOException;

}
