package com.zxin.java.spring.core;

import org.junit.Test;
import org.springframework.core.NestedCheckedException;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.core.NestedRuntimeException;
import org.springframework.data.redis.connection.PoolException;

/**
 * @author zxin
 */
public class NestedCheckExceptionTest {

    @Test
    public void causedBy() {
        NestedRuntimeException nestedRuntimeException = null;
        CustomException customException = null;
        Exception exception = new Exception("except");
        try{
//            exception.printStackTrace();
            throw exception;
        }catch (Exception e){
            nestedRuntimeException = new PoolException("pool", e);
            customException = new CustomException("custom", e);
        }
        nestedRuntimeException.printStackTrace();
        customException.printStackTrace();
    }

}
