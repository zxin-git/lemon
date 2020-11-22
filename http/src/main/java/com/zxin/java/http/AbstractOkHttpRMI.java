package com.zxin.java.http;

import com.zxin.java.http.convert.impl.AbstractResponseExtracctor;
import com.zxin.java.http.convert.IDeserializer;
import com.zxin.java.http.convert.IResponseExtractor;
import com.zxin.java.http.convert.ISerializer;
import com.zxin.java.http.enums.HttpMethod;
import com.zxin.java.http.okhttp.OkHttpUtils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;

/**
 * @author zxin
 */
public abstract class AbstractOkHttpRMI<I, O> implements IRemoteMethod<I, O> {

    @Override
    public O invocate(I i) throws IOException {
        Result<O> result = OkHttpUtils.send(httpClient(), request(i), responseExtractor());
        return result.getBody();
    }

    protected Request request(I i) throws IOException {
        String body = serializer().convert(i);
        Request request = requestBuilder().method(httpMethod().name(), RequestBody.create(null, body)).build();
        return request;
    }

    protected IResponseExtractor<O> responseExtractor(){
        return new AbstractResponseExtracctor<O>() {
            @Override
            public IDeserializer<O> deserializer() {
                return deserializer();
            }
        };
    }

    protected OkHttpClient httpClient(){
        return new OkHttpClient();
    }

    protected abstract Request.Builder requestBuilder();

    protected abstract HttpMethod httpMethod();

    protected abstract ISerializer<I> serializer();

    protected abstract IDeserializer<O> deserializer();


}
