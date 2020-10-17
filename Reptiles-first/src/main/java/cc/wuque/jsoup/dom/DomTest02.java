package cc.wuque.jsoup.dom;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.Set;

/**
 * 使用Dom获取元素中的数据
 */
public class DomTest02 {
    public static void main(String[] args) throws Exception {
        //解析文件
        Document document = Jsoup.parse(new File("C:\\Users\\无缺\\Desktop\\index.html"), "utf-8");

        //根据id获取元素
        Element element = document.getElementById("test");

        String s = "";

        //从元素中获取id
        s = element.id();

        //从元素中获取ClassName

        //获取全部的className
        s = element.className();

        //以集合的方式获取所有的ClassName并以空格为区分界限
/*        Set<String> classNames = element.classNames();
        for (String str : classNames) {
            System.out.println(str);
        }*/

        //从元素中获取属性的值
        s = element.attr("id");

        //从元素中获取所有属性attributes
        Attributes attributes = element.attributes();
        System.out.println(attributes.toString());

        //从元素中获取文本内容text
        s = element.text();

        System.out.println("获取到的数据是: " +s);
    }
}
