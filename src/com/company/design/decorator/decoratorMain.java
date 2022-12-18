package com.company.design.decorator;

/**
 * packageName : com.company.design.decorator
 * className : decoratorMain
 * user : jwlee
 * date : 2022/12/18
 */
public class decoratorMain {

    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();
        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
    }
}
