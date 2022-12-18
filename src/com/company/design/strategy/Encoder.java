package com.company.design.strategy;

/**
 * packageName : com.company.design.strategy
 * className : Encoder
 * user : jwlee
 * date : 2022/12/18
 */
public class Encoder {

    private EncodingStrategy encodingStrategy;

    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
