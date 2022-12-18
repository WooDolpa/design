package com.company.design.facade;

/**
 * packageName : com.company.design.facade
 * className : Writer
 * user : jwlee
 * date : 2022/12/18
 */
public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s 로 연결 합니다.", fileName);
        System.out.printf(msg);
    }
    public void fileDisconnect(){
        String msg = String.format("Writer %s 로 연결 종료 합니다.", fileName);
        System.out.printf(msg);
    }
    public void write() {
        String msg = String.format("Writer %s 로 파일쓰기를 합니다.", fileName);
        System.out.printf(msg);
    }
}
