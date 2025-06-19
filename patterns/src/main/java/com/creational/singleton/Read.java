package com.creational.singleton;

public class Read {

    public void doRead() {
        var logger = Logger.getInstance();
        logger.log("doing read");
    }
}
