package com.nouuid.util.xml;

import java.io.File;

/**
 * Created by bl07637 on 2015/4/30.
 */
public class Main {
    public static void main(String[] agrs) {
        File file = new File("/opt/student.xml");
        System.out.println("DOM:");
        DOMReader dom = new DOMReader();
        dom.test(file);
        System.out.println("--------------------------------------------------------------");
        System.out.println("DOM4J:");
        DOM4JReader dom4j = new DOM4JReader();
        dom4j.test(file);
        System.out.println("--------------------------------------------------------------");
        System.out.println("JDOM:");
        JDOMReader jdom = new JDOMReader();
        jdom.test(file);
        System.out.println("--------------------------------------------------------------");
        System.out.println("SAX:");
        SAXReader sax = new SAXReader();
        sax.test(file);
    }
}

//    ����Դ��/opt/student.xml
//    <?xml version="1.0" encoding="ISO-8859-1"?>
//    <!DOCTYPE note SYSTEM "Note.dtd">
//    <Students>
//        <Student>
//            <ID>01</ID>
//            <Name>name1</Name>
//            <Sex>��</Sex>
//        </Student>
//        <Student>
//            <ID>02</ID>
//            <Name>name2</Name>
//            <Sex>Ů</Sex>
//        </Student>
//    </Students>

//���Խ����
//        DOM:
//        ��ţ�01 ������name1 �Ա���
//        ��ţ�02 ������name2 �Ա�Ů
//        ����ʱ�䣺28����
//        --------------------------------------------------------------
//        DOM4J:
//        ��ţ�01 ������name1 �Ա���
//        ��ţ�02 ������name2 �Ա�Ů
//        ����ʱ�䣺38����
//        --------------------------------------------------------------
//        JDOM:
//        ��ţ�01 ������name1 �Ա���
//        ��ţ�02 ������name2 �Ա�Ů
//        ����ʱ�䣺31����
//        --------------------------------------------------------------
//        SAX:
//        ��ţ�01 ������name1 �Ա���
//        ��ţ�02 ������name2 �Ա�Ů
//        ����ʱ�䣺2����
