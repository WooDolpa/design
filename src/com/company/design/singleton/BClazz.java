package com.company.design.singleton;

/**
 * packageName : com.company.design.singleton
 * className : BClazz
 * user : jwlee
 * date : 2022/12/15
 */
public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() { return this.socketClient;}
}
