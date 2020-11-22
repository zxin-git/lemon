package com.zxin.java.spring.spel;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author zxin
 */
public class SpELTest {

    @Test
    public void test1(){
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello World'");
//        Expression exp = parser.parseExpression("'Hello World'.concat('!')");
//        Expression exp = parser.parseExpression("'Hello World'.bytes");
//        Expression exp = parser.parseExpression("'Hello World'.bytes.length");
        String message = (String) exp.getValue();
        System.out.println(message);
    }

}
