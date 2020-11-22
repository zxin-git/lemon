package io.netty.handler.ipfilter;

import io.netty.channel.ChannelHandlerContext;

import java.net.InetSocketAddress;

/**
 * @author zxin
 */
public class RuleBasedIpFilter {

    private final IpFilterRule[] rules;

    public RuleBasedIpFilter(IpFilterRule... rules) {
        if (rules == null) {
            throw new NullPointerException("rules");
        }

        this.rules = rules;
    }

    public boolean accept(String requestIp) throws Exception {
        InetSocketAddress remoteAddress = new InetSocketAddress(requestIp, 0);

        for (IpFilterRule rule : rules) {
            if (rule == null) {
                break;
            }

            if (rule.matches(remoteAddress)) {
                return rule.ruleType() == IpFilterRuleType.ACCEPT;
            }
        }

        return true;
    }
}
