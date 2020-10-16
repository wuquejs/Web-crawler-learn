package cc.wuque.jsoup;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.net.URL;

/**
 *使用Jsoup解析字符串
 */
public class JsoupTest02 {
    public static void main(String[] args) throws Exception{
        //使用工具类读取文件，获取字符串
        String content = FileUtils.readFileToString(new File("C:\\Users\\无缺\\Desktop\\index.html"), "utf-8");

        //解析字符串
        Document doc = Jsoup.parse(content);

        String s = doc.getElementsByTag("title").first().text();

        //打印字符串
        System.out.println(s);

    }
}
