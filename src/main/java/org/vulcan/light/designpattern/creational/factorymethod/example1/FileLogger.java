package org.vulcan.light.designpattern.creational.factorymethod.example1;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("Write log to file.");
    }

}
