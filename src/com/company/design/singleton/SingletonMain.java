package com.company.design.singleton;

/**
 * packageName : com.company.design.singleton
 * className : SingletonMain
 * user : jwlee
 * date : 2022/12/18
 */
public class SingletonMain {

    public static void main(String[] args) {

        // singleton
        Aclazz aclazz = new Aclazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aclazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

    }
}
