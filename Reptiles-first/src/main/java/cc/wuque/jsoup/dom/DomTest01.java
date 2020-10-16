package cc.wuque.jsoup.dom;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * 使用dom的方式获取元素
 */
public class DomTest01 {
    public static void main(String[] args) throws Exception {
        //解析文件
        Document document = Jsoup.parse(new File("C:\\Users\\无缺\\Desktop\\index.html"), "utf-8");

        //根据id获取元素getElementById
        Element element = document.getElementById("notice");


        //根据标签获取元素getElementsByTag
        Element element1 = document.getElementsByTag("a").first();



        //根据class获取元素getElementsByClass
        Elements elements = document.getElementsByClass("topbar");


        //根据属性获取元素getElementsByAttribute
        Element element2 = document.getElementsByAttribute("abc").first();
        Element element3 = document.getElementsByAttributeValue("href", "http://www.jatc.edu.cn/").first();

        //打印元素的内容
        System.out.println("ID:" + element.text());
        System.out.println("标签:" + element1.text());
        System.out.println("class:" + elements.text());
        System.out.println("属性:" + element2.text());
        System.out.println("属性 + 元素:" + element3.text());
    }
}
