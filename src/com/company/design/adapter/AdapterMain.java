package com.company.design.adapter;

/**
 * packageName : com.company.design.adapter
 * className : AdapterMain
 * user : jwlee
 * date : 2022/12/18
 */
public class AdapterMain {

    public static void main(String[] args) {
        // adapter
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);
//        connect(cleaner);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

    }

    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
