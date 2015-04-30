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
 * DOMʵ�ַ������������
 * ����DOM��XML��������һ��XML�ĵ�ת����һ������ģ�͵ļ��ϣ�ͨ����DOM������Ӧ�ó�������ͨ�����������ģ�͵Ĳ�������ʵ�ֶ�XML�ĵ����ݵĲ�����
 * ����DOM������������XML�ĵ�ת����DOM���������ڴ��У���ˣ����ĵ��Ƚϴ���߽ṹ�Ƚϸ���ʱ�����ڴ������ͱȽϸߡ����ң����ڽṹ���ӵ����ı���Ҳ��һ���ʱ�Ĳ�����
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
            System.out.print("��ţ�"+ doc.getElementsByTagName("ID").item(i).getFirstChild().getNodeValue());
            System.out.print(" ������"+ doc.getElementsByTagName("Name").item(i).getFirstChild().getNodeValue());
            System.out.println(" �Ա�"+ doc.getElementsByTagName("Sex").item(i).getFirstChild().getNodeValue());
        }
        System.out.println("����ʱ�䣺" +(System.currentTimeMillis() - lasting) + "����");
    }
}
