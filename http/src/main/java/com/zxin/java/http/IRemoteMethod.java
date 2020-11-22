package com.zxin.java.http;

import java.io.IOException;

/**
 * remote method invocation
 * @author zxin
 */
public interface IRemoteMethod<I, O> {

    O invocate(I i) throws IOException;

}
