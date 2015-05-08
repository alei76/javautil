package com.nouuid.util.xml;

import java.io.File;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * SAXʵ�ַ�����˳��ģʽ
 * Created by nouuid on 2015/4/30.
 */
class MyHandler extends DefaultHandler
{
    private Stack<String> stack = new Stack<String>();
    private String id;
    private String name;
    private String sex;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        stack.push(qName);
        for(int i = 0; i < attributes.getLength(); i++) {
            String attrName = attributes.getQName(i);
            String attrValue = attributes.getValue(i);
            System.out.println(attrName + "=" + attrValue);
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        String tag = stack.peek();
        if("ID".equals(tag)) {
            id = new String(ch, start,length);
        }  else if("Name".equals(tag)) {
            name = new String(ch, start, length);
        } else if("Sex".equals(tag)) {
            sex = new String(ch, start, length);
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        stack.pop(); //��ʾ��Ԫ���Ѿ�������ϣ���Ҫ��ջ�е���
        if("Student".equals(qName))  {
            System.out.print("��ţ�" + id);
            System.out.print(" ������" + name);
            System.out.println(" �Ա�" + sex);
        }

    }
}

public class SAXReader {
    public void test(File file) {
        long lasting = System.currentTimeMillis();
        try {
            SAXParserFactory sf = SAXParserFactory.newInstance();
            SAXParser sp = sf.newSAXParser();
            MyHandler reader = new MyHandler();
            sp.parse(file, reader);
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("����ʱ�䣺" +(System.currentTimeMillis() - lasting) + "����");
    }
}

