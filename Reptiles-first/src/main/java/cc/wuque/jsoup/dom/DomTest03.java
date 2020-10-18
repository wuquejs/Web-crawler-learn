package cc.wuque.jsoup.dom;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

/**
 * 使用元素选择器获取元素
 */
public class DomTest03 {
    public static void main(String[] args) throws Exception {
        //解析文件，获取对象
        Document document = Jsoup.parse(new File("Reptiles-first\\src\\main\\resources\\index.html"), "utf-8");

        //通过标签查找元素
//        Elements elements = document.select("span");
//        for (Element element : elements) {
//            System.out.println(element.text());
//        }

        //通过ID查找元素
//        Element elements1 = document.select("#test").first();
//        System.out.println("ID获取到的结果是:" + elements1.text());


        //通过class名称查找元素
//        Element element = document.select(".class_a").first();
//        System.out.println("class获取到的元素是：" + element.text());

        //利用属性查找元素
//        Element element1 = document.select("[abc]").first();
//        System.out.println("属性获取到的元素是:" + element1.text());

        //利用属性值查找元素
        Elements elements = document.select("[class=container]");
        for (Element element : elements) {
            System.out.println("利用属性查找元素: " + element.text());
        }



    }
}
