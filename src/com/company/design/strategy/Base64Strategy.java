package com.company.design.strategy;

import java.util.Base64;

/**
 * packageName : com.company.design.strategy
 * className : Base64Strategy
 * user : jwlee
 * date : 2022/12/18
 */
public class Base64Strategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
