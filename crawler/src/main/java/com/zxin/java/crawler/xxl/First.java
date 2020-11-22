package com.zxin.java.crawler.xxl;

import com.xuxueli.crawler.XxlCrawler;
import com.xuxueli.crawler.annotation.PageFieldSelect;
import com.xuxueli.crawler.annotation.PageSelect;
import com.xuxueli.crawler.parser.PageParser;
import lombok.Data;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.List;

/**
 * @author zxin
 */
public class First {

    public static void main(String[] args) {
        XxlCrawler crawler = new XxlCrawler.Builder()
                .setUrls("https://my.oschina.net/xuxueli/blog")
                .setWhiteUrlRegexs("https://my\\.oschina\\.net/xuxueli/blog/\\d+")
                .setThreadCount(1)
                .setPageParser(new APageParser())
                .build();

        crawler.start(true);
    }

    public static class APageParser extends PageParser<PageVo>{

        @Override
        public void parse(Document html, Element pageVoElement, PageVo pageVo) {
            // 解析封装 PageVo 对象
            String pageUrl = html.baseUri();
            System.out.println(pageUrl + "：" + pageVo.toString());
        }
    }

    // PageSelect 注解：从页面中抽取出一个或多个VO对象；
    @PageSelect(cssQuery = "body")
    @Data
    public static class PageVo {

        @PageFieldSelect(cssQuery = ".blog-heading .title")
        private String title;
        @PageFieldSelect(cssQuery = "#read")
        private int read;
        @PageFieldSelect(cssQuery = ".comment-content")
        private List<String> comment;
        // set get

    }
}
