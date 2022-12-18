package com.company.design.strategy;

/**
 * packageName : com.company.design.strategy
 * className : NormalStrategy
 * user : jwlee
 * date : 2022/12/18
 */
public class NormalStrategy implements  EncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
