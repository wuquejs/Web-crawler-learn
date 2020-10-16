package cc.wuque.jsoup;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;

/**
 *使用Jsoup解析文件
 */
public class JsoupTest03 {
    public static void main(String[] args) throws Exception{


        //解析文件
        Document document = Jsoup.parse(new File("C:\\Users\\无缺\\Desktop\\index.html"), "utf-8");

        String s = document.getElementsByTag("title").first().text();

        //打印结果
        System.out.println(s);
    }
}
