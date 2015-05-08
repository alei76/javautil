package com.nouuid.util.xml;

import java.io.File;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * DOM4Jʵ�ַ���
 * Created by nouuid on 2015/4/30.
 */
public class DOM4JReader {

    public static final Log logger = LogFactory.getLog(DOM4JReader.class);

    private SAXReader reader;
    private Document doc;
    private Element rootElement;

    public DOM4JReader(File file) {
        reader = new SAXReader();
        try {
            doc = reader.read(file);
        } catch (DocumentException e) {
            logger.error("", e);
        }
        rootElement = (doc != null) ? doc.getRootElement() : null;
    }

    public Iterator getEelementIterator(String elementName) {
        return rootElement.elementIterator("Student");
    }


    public void test(File file) {

    }
}

