package com.company.design.adapter;

/**
 * packageName : com.company.design.adapter
 * className : AirConditioner
 * user : jwlee
 * date : 2022/12/15
 */
public class AirConditioner implements Electronic220V{

    @Override
    public void connect() {
        System.out.println("에어컨 220v on");
    }
}
