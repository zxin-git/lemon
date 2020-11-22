package com.zxin.java.http.convert.impl;

import com.zxin.java.http.Result;
import com.zxin.java.http.convert.IDeserializer;
import com.zxin.java.http.convert.IResponseExtractor;
import com.zxin.java.http.enums.HttpStatus;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author zxin
 */
public abstract class AbstractResponseExtracctor<T> implements IResponseExtractor<T> {

    @Override
    public Result<T> extractData(Response response) throws IOException {
        String url = response.request().url().toString();
        HttpStatus httpStatus = HttpStatus.valueOf(response.code());
        String body = response.body().toString();

        Result<T> result = new Result(url, httpStatus, deserializer().convert(body));
        return result;
    }

    public abstract IDeserializer<T> deserializer();
}
