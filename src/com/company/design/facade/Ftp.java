package com.company.design.facade;

/**
 * packageName : com.company.design.facade
 * className : Ftp
 * user : jwlee
 * date : 2022/12/18
 */
public class Ftp {

    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect() {
        System.out.println("FTP Host : " + host + " Port : " + port + " 로 연결합니다.");
    }
    public void moveDirectory(){
        System.out.println("FTP path : "+path+"로 이동 합니다.");
    }
    public void disConnect(){
        System.out.println("FTP 연결을 종료합니다.");
    }
}
