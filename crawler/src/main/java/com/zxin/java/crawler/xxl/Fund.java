package com.zxin.java.crawler.xxl;

import com.xuxueli.crawler.XxlCrawler;
import com.xuxueli.crawler.annotation.PageFieldSelect;
import com.xuxueli.crawler.annotation.PageSelect;
import com.xuxueli.crawler.parser.PageParser;
import com.xuxueli.crawler.parser.strategy.NonPageParser;
import lombok.Data;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.List;

/**
 * @author zxin
 */
public class Fund {

    public static void main(String[] args) {
        XxlCrawler crawler = new XxlCrawler.Builder()
                .setUrls("http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=zq&rs=&gs=0&sc=1nzf&st=desc&sd=2019-03-14&ed=2020-03-14&qdii=041|&tabSubtype=041,,,,,&pi=1&pn=50&dx=1&v=0.9217203048993265")
                .setThreadCount(1)
                .setPageParser(new FirstPageParser())
                .build();

        crawler.start(true);
    }

    public static class FirstPageParser extends NonPageParser {

        @Override
        public void parse(String url, String pageSource) {
            System.out.println(pageSource);
        }
    }

}
