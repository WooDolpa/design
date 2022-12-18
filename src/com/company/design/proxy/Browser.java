package com.company.design.proxy;

/**
 * packageName : com.company.design.proxy
 * className : Browser
 * user : jwlee
 * date : 2022/12/18
 */
public class Browser implements IBrowser{

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url);
    }
}
