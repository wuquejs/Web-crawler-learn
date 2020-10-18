package cc.wuque.jsoup.dom;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

/**
 * 使用组合选择器获取元素
 */
public class DomTest04 {
    public static void main(String[] args) throws Exception {
        //解析文件，获取对象
        Document document = Jsoup.parse(new File("Reptiles-first\\src\\main\\resources\\index.html"), "utf-8");

        //元素+ID
       // Element element = document.select("a#456").first();

        //元素+class
        //Element element = document.select("div.topbar").first();

        //元素+属性名
       // Element element = document.select("a[id]").first();

        //任意组合
        //Element element = document.select("a[id].x_name").first();

        //查找某个元素下子元素
        //Element element = document.select(".topbar-info a").first();

        //查找某个父元素下的直接子元素
        //Element element = document.select(".topbar-info > a > i").first();


        //查找某个父元素下所有直接子元素
        Elements elements = document.select(".container > .topbar-nav > *");

        System.out.println("获取到的内容是：" + elements.text());

    }
}
