package cc.wuque.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URL;

/**
 *使用Jsoup解析网站网站标签内容
 */
public class JsoupTest01 {
    public static void main(String[] args) throws Exception{
        //解析url地址
        //第一个参数是访问url，第二个参数是访问时候的超时时间
        Document doc = Jsoup.parse(new URL("https://www.wuquejs.cn"), 10000);

        //使用标签选择器，获取title标签中的内容
        String s = doc.getElementsByTag("title").first().text();

        //打印结果
        System.out.println(s);
    }
}
