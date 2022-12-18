package com.company.design.singleton;

/**
 * packageName : com.company.design.singleton
 * className : SocketClient
 * user : jwlee
 * date : 2022/12/15
 */
public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){}        // 기본 생성자를 생성하지 못하도록 private 처리

    public static SocketClient getInstance() {
        if(socketClient == null) {
           socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
