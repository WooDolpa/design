package com.company.design.facade;

/**
 * packageName : com.company.design.facade
 * className : FacadeMain
 * user : jwlee
 * date : 2022/12/18
 */
public class FacadeMain {
    public static void main(String[] args) {

        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");

        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();


        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "home/etc/", "text.tmp");
        sftpClient.connect();
        sftpClient.writer();
        sftpClient.read();
        sftpClient.disconnect();

    }
}
