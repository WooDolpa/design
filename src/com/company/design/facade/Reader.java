package com.company.design.facade;

/**
 * packageName : com.company.design.facade
 * className : Reader
 * user : jwlee
 * date : 2022/12/18
 */
public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Reader %s 로 연결 합니다.", fileName);
        System.out.printf(msg);
    }
    public void fileRead(){
        String msg = String.format("Reader %s 의 내용을 읽어 옵니다.", fileName);
        System.out.printf(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Reader %s 로 연결 종료 합니다.", fileName);
        System.out.printf(msg);
    }
}
