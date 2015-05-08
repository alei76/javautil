package com.nouuid.util.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * DOMʵ�ַ������������
 * ����DOM��XML��������һ��XML�ĵ�ת����һ������ģ�͵ļ��ϣ�ͨ����DOM������Ӧ�ó�������ͨ�����������ģ�͵Ĳ�������ʵ�ֶ�XML�ĵ����ݵĲ�����
 * ����DOM������������XML�ĵ�ת����DOM���������ڴ��У���ˣ����ĵ��Ƚϴ���߽ṹ�Ƚϸ���ʱ�����ڴ������ͱȽϸߡ����ң����ڽṹ���ӵ����ı���Ҳ��һ���ʱ�Ĳ�����
 * Created by nouuid on 2015/4/30.
 */
public class DOMReader {

    public static final Log logger = LogFactory.getLog(DOMReader.class);

    private DocumentBuilder builder;

    public DOMReader() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            logger.error("", e);
        }
    }

    public Document getDocument(File file) {
        Document doc = null;
        try {
            doc = builder.parse(file);
        } catch (SAXException | IOException e) {
            logger.error("", e);
        }
        return doc;
    }

    public NodeList getNodeList(Document doc, String tagName) {
        return doc==null ? null : doc.getElementsByTagName(tagName);
    }

}
