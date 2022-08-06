package com.gxs.type;

import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) {
        try{
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            InetAddress net = InetAddress.getByName("192.168.10.14");
            System.out.println(net);
            InetAddress net1 = InetAddress.getByName("www.atguigu.com");
            System.out.println(net1);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
