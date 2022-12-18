package com.company.design.strategy;

/**
 * packageName : com.company.design.strategy
 * className : AppendStrategy
 * user : jwlee
 * date : 2022/12/18
 */
public class AppendStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return "ABCD" + text;
    }
}
