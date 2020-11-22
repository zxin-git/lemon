package com.zxin.java.cat;

import com.dianping.cat.Cat;
import com.dianping.cat.message.Event;
import com.dianping.cat.message.Transaction;

/**
 * @author zxin
 */
public class QuickStart {

    public static void main(String[] args) {
        CustomException customException = null;
        Exception exception = new Exception("except");
        try{
//            exception.printStackTrace();
            throw exception;
        }catch (Exception e){
            customException = new CustomException("custom", e);
        }
//        customException.printStackTrace();

        Transaction t = Cat.newTransaction("URL", "pageName");

        try {
            Cat.logEvent("URL.Server", "serverIp", Event.SUCCESS, "ip=${serverIp}");
            Cat.logMetricForCount("metric.key");
            Cat.logMetricForDuration("metric.key", 5);
            Cat.getProducer().logError("", customException);
//            yourBusiness();

            t.setStatus(Transaction.SUCCESS);
        } catch (Exception e) {
            t.setStatus(e);
            Cat.logError(e);
        } finally {
            t.complete();
        }
    }
}
