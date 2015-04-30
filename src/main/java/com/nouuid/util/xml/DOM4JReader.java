package com.nouuid.util.xml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * DOM4Jʵ�ַ���
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
                System.out.print("��ţ�"+ foo.elementText("ID"));
                System.out.print(" ������"+ foo.elementText("Name"));
                System.out.println(" �Ա�"+ foo.elementText("Sex"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("����ʱ�䣺" +(System.currentTimeMillis() - lasting) + "����");
    }
}

