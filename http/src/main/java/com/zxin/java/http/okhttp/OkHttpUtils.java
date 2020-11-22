package com.zxin.java.http.okhttp;

import com.zxin.java.http.Result;
import com.zxin.java.http.ResultException;
import com.zxin.java.http.convert.IResponseExtractor;
import com.zxin.java.http.convert.impl.StringResponseExtractor;
import com.zxin.java.http.enums.HttpMethod;
import com.zxin.java.http.enums.HttpStatus;
import okhttp3.ConnectionPool;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author zxin
 */
public class OkHttpUtils {


    public static <T> Result<T> send(OkHttpClient httpClient, Request request, IResponseExtractor<T> responseExtractor) throws ResultException {
        try {
            Response response = call(httpClient, request);

            HttpStatus httpStatus = HttpStatus.valueOf(response.code());
            if(HttpStatus.OK.equals(httpStatus)){
                Result<T> result = responseExtractor.extractData(response);
                return result;
            }else{
                Result<String> result = StringResponseExtractor.getInstance().extractData(response);
                throw new ResultException(result);
            }
        } catch (IOException e) {
            throw new ResultException(request.url().toString(), e);
        }
    }


    public static Response call(OkHttpClient httpClient, Request request) throws IOException{
        Response response = httpClient.newCall(request).execute();
        return response;
    }

    public static Request request(String url, HttpMethod method, Headers headers, RequestBody body){
        Request.Builder builder = new Request.Builder();
        builder.url(url).method(method.name(), body);
        if(headers != null){
            builder.headers(headers);
        }
        return builder.build();
    }

    public static Headers headers(Map<String, String> headerMap){
        Headers.Builder builder = new Headers.Builder();
        if(headerMap != null){
            for (Map.Entry<String, String> entry: headerMap.entrySet()) {
                builder.add(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }

    public static RequestBody content(String content){
        return RequestBody.create(null, content);
    }


    public static OkHttpClient httpClient(int maxIdle, long keepAlive, long connectTimeout, long socketTimeout){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectionPool(connectionPool(maxIdle, keepAlive));

        builder.connectTimeout(connectTimeout, TimeUnit.MILLISECONDS);
        builder.readTimeout(socketTimeout, TimeUnit.MILLISECONDS).writeTimeout(socketTimeout, TimeUnit.MILLISECONDS);
        return builder.build();
    }

    public static ConnectionPool connectionPool(int maxIdle, long keepAlive){
        ConnectionPool pool = new ConnectionPool(maxIdle, keepAlive, TimeUnit.SECONDS);
        return pool;
    }





}
