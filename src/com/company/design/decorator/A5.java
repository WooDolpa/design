package com.company.design.decorator;

/**
 * packageName : com.company.design.decorator
 * className : A3
 * user : jwlee
 * date : 2022/12/18
 */
public class A5 extends AudiDecorator{

    public A5(ICar audi, String modelName) {
        super(audi, modelName, 3000);
    }
}
