package com.company.design.adapter;

/**
 * packageName : com.company.design.adapter
 * className : Cleanner
 * user : jwlee
 * date : 2022/12/15
 */
public class Cleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("청소기 220v on");
    }
}
