package io.netty.handler.ipfilter;

import org.junit.Test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author zxin
 */
public class IpSubnetFilterRuleTest {

    @Test
    public void match() {
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.47.236");
            InetSocketAddress srcSocketAddress = new InetSocketAddress("192.168.47.235", 35670);
            IpSubnetFilterRule ipSubnetFilterRule = new IpSubnetFilterRule(inetAddress, 32, IpFilterRuleType.ACCEPT);
            boolean access = ipSubnetFilterRule.matches(srcSocketAddress);
            System.out.println(access);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
