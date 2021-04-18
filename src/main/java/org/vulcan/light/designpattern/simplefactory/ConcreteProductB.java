package org.vulcan.light.designpattern.simplefactory;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public class ConcreteProductB implements Product {

    public static String NAME = "B";

    @Override
    public void use() {
        System.out.println("Use Product B.");
    }

}