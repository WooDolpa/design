package com.company.design.proxy;

import com.company.design.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

/**
 * packageName : com.company.design.proxy
 * className : ProxyMain
 * user : jwlee
 * date : 2022/12/18
 */
public class ProxyMain {

    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();

//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com", ()->{
            System.out.println("before");
            start.set(System.currentTimeMillis());
        }, ()->{
            long now = System.currentTimeMillis();
            end.set(now - start.get());
        });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }
}
