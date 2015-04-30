package com.nouuid.util;

/**
 * Created by bl07637 on 2015/4/28.
 */
public class SystemInfoUtil {
    public InetAddress getInetAddress() {
        try{
            return InetAddress.getLocalHost();
        }catch(UnknownHostException e){
            System.out.println("unknown host!");
        }
        return null;
    }

    public String getHostIp() {
        InetAddress netAddress = getInetAddress();
        if(null == netAddress){
            return null;
        }
        String ip = netAddress.getHostAddress(); //get the ip address
        return ip;
    }

    public String getHostName() {
        InetAddress netAddress = getInetAddress();
        if (null == netAddress) {
            return null;
        }
        String name = netAddress.getHostName(); // get the host address
        if(StringUtils.isBlank(name)) {
            name = getHostIp();
        }
        return name;
    }
}
