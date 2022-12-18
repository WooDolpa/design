package com.company.design.adapter;

/**
 * packageName : com.company.design.adapter
 * className : SocketAdapter
 * user : jwlee
 * date : 2022/12/15
 */
public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
