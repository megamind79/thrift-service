package com.baeldung.thrift;

public class Client {
    public static void main(String[] args)  {
        CrossPlatformServiceClient client = new CrossPlatformServiceClient();
        boolean ping_result = client.ping();
        System.out.println("ping res : " + ping_result);
    }
}
