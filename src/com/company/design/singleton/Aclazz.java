package com.company.design.singleton;

/**
 * packageName : com.company.design.singleton
 * className : Aclazz
 * user : jwlee
 * date : 2022/12/15
 */
public class Aclazz {

    private SocketClient socketClient;

    public Aclazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() { return this.socketClient;}
}
