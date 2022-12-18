package com.company.design.decorator;

/**
 * packageName : com.company.design.decorator
 * className : Audi
 * user : jwlee
 * date : 2022/12/18
 */
public class Audi implements ICar{
    
    private int price;

    public Audi(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("audi 의 가격은 " + this.price + "원 입니다.");
    }
}
