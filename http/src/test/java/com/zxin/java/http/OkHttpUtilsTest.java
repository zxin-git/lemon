package com.zxin.java.http;

import com.zxin.java.http.enums.HttpMethod;
import com.zxin.java.http.okhttp.OkHttpUtils;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class OkHttpUtilsTest {

    @Test
    public void call() {
    }

    @Test
    public void request() {
//        String url = "http://127.0.0.1/aaa?a=b&b=c";
        String url = "http://10.100.249.215:30678/swagger-ui.htmlsdfasfs";
        Request request = OkHttpUtils.request(url, HttpMethod.GET, null, null);
        OkHttpClient okHttpClient = new OkHttpClient();
        try {
            Response response = OkHttpUtils.call(okHttpClient, request);
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void httpClient() {
    }

    @Test
    public void url(){
        try {
            URL url = new URL("https://baidu.com:4030/api/resource");
            URI uri = new URI("https://baidu.com:4030/api/resource");
            System.out.println(url);
            System.out.println(uri);
        } catch (MalformedURLException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void headers(){
        Headers.Builder builder = new Headers.Builder();
        builder.add("a", "a1");
        builder.add("b", "b1");
        builder.add("a", "a2");
        builder.set("b", "b2");
        System.out.println(builder);
    }
}
