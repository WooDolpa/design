package com.company.design.adapter;

/**
 * packageName : com.company.design.adapter
 * className : HairDryer
 * user : jwlee
 * date : 2022/12/15
 */
public class HairDryer implements Electronic110V{

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 100v on");
    }

}
