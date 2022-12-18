package com.company.design.decorator;

/**
 * packageName : com.company.design.decorator
 * className : A3
 * user : jwlee
 * date : 2022/12/18
 */
public class A4 extends AudiDecorator{

    public A4(ICar audi, String modelName) {
        super(audi, modelName, 2000);
    }
}
