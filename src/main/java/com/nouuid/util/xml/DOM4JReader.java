package com.nouuid.util.xml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * DOM4J实现方法
 * Created by bl07637 on 2015/4/30.
 */
public class DOM4JReader {
    public void test(File file) {
        long lasting = System.currentTimeMillis();
        try {
            SAXReader reader = new SAXReader();
            Document doc = reader.read(file);
            Element root = doc.getRootElement();
            Element foo;
            for (Iterator i=root.elementIterator("Student"); i.hasNext(); ) {
                foo = (Element) i.next();
                System.out.print("编号："+ foo.elementText("ID"));
                System.out.print(" 姓名："+ foo.elementText("Name"));
                System.out.println(" 性别："+ foo.elementText("Sex"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("运行时间：" +(System.currentTimeMillis() - lasting) + "毫秒");
    }
}

