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

//    数据源：/opt/student.xml
//    <?xml version="1.0" encoding="ISO-8859-1"?>
//    <!DOCTYPE note SYSTEM "Note.dtd">
//    <Students>
//        <Student>
//            <ID>01</ID>
//            <Name>name1</Name>
//            <Sex>男</Sex>
//        </Student>
//        <Student>
//            <ID>02</ID>
//            <Name>name2</Name>
//            <Sex>女</Sex>
//        </Student>
//    </Students>

//测试结果：
//        DOM:
//        编号：01 姓名：name1 性别：男
//        编号：02 姓名：name2 性别：女
//        运行时间：28毫秒
//        --------------------------------------------------------------
//        DOM4J:
//        编号：01 姓名：name1 性别：男
//        编号：02 姓名：name2 性别：女
//        运行时间：38毫秒
//        --------------------------------------------------------------
//        JDOM:
//        编号：01 姓名：name1 性别：男
//        编号：02 姓名：name2 性别：女
//        运行时间：31毫秒
//        --------------------------------------------------------------
//        SAX:
//        编号：01 姓名：name1 性别：男
//        编号：02 姓名：name2 性别：女
//        运行时间：2毫秒
