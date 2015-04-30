package com.nouuid.util.xml;

import java.io.File;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 * JDOMʵ�ַ���
 * �������ͽṹ�����ô�JAVA�ļ�����XML�ĵ�ʵ�ֽ��������ɡ����л��Լ����ֲ�����
 * Created by bl07637 on 2015/4/30.
 */
public class JDOMReader {
    public void test(File file) {
        long lasting = System.currentTimeMillis();
        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(file);
            Element foo = doc.getRootElement();
            List allChildren = foo.getChildren();
            for (int i = 0; i < allChildren.size(); i++) {
                System.out.print("��ţ�"+ ((Element) allChildren.get(i)).getChild("ID").getText());
                System.out.print(" ������"+ ((Element) allChildren.get(i)).getChild("Name").getText());
                System.out.println(" �Ա�"+ ((Element) allChildren.get(i)).getChild("Sex").getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("����ʱ�䣺" +(System.currentTimeMillis() - lasting) + "����");
    }
}
