package com.nouuid.util.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * DOM实现方法：随机访问
 * 基于DOM的XML分析器将一个XML文档转换成一个对象模型的集合（通常称DOM树），应用程序正是通过对这个对象模型的操作，来实现对XML文档数据的操作。
 * 由于DOM分析器把整个XML文档转化成DOM树放在了内存中，因此，当文档比较大或者结构比较复杂时，对内存的需求就比较高。而且，对于结构复杂的树的遍历也是一项耗时的操作。
 * Created by bl07637 on 2015/4/30.
 */
public class DOMReader {
    public void test(File file) {
        long lasting = System.currentTimeMillis();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse(file);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        NodeList nl = doc.getElementsByTagName("Student");
        for(int i=0; i < nl.getLength(); i++) {
            System.out.print("编号："+ doc.getElementsByTagName("ID").item(i).getFirstChild().getNodeValue());
            System.out.print(" 姓名："+ doc.getElementsByTagName("Name").item(i).getFirstChild().getNodeValue());
            System.out.println(" 性别："+ doc.getElementsByTagName("Sex").item(i).getFirstChild().getNodeValue());
        }
        System.out.println("运行时间：" +(System.currentTimeMillis() - lasting) + "毫秒");
    }
}
