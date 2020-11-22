package com.zxin.java.lemon.dis.id;

import org.bson.types.ObjectId;
import org.springframework.util.Base64Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;

/**
 * @author zxin
 */
public class ObjectIdGen {

    public static void main(String[] args) {
//        byte[] bytes = new byte[1];
//        bytes[0] = (byte) 0x01;
//        System.out.println(Base64Utils.encodeToString(bytes));
        LocalDateTime localDateTime = LocalDateTime.now();
//        Integer time = (int) localDateTime.toEpochSecond(ZoneOffset.of("+8"));
        Integer time = (int) 111;
        System.out.println(localDateTime);
        System.out.println(time);
        System.out.println(Integer.toOctalString(time));
        System.out.println(Integer.toHexString(time));

//        ObjectId objectId = new ObjectId();
//        System.out.println(objectId.toHexString());
//        System.out.println(objectId.toString());
    }

}
