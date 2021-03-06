package org.vulcan.light.designpattern.creational.factorymethod.example1;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("Write log to database.");
    }

}
