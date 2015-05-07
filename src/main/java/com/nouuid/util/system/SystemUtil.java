package com.nouuid.util.system;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by bl07637 on 2015/4/28.
 */
public class SystemUtil {

    /**
     * ��ȡInetAddress
     * @return
     */
    public static InetAddress getInetAddress() {
        try{
            return InetAddress.getLocalHost();
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * ��ȡ����ip
     * @return
     */
    public static String getHostIp() {
        InetAddress netAddress = getInetAddress();
        if(null == netAddress){
            return null;
        }
        return netAddress.getHostAddress();
    }

    /**
     * ��ȡ������
     * @return
     */
    public static String getHostName() {
        InetAddress netAddress = getInetAddress();
        if (null == netAddress) {
            return null;
        }
        return netAddress.getHostName();
    }
}
