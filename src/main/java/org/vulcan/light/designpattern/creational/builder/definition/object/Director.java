package org.vulcan.light.designpattern.creational.builder.definition.object;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class Director {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        System.out.println(builder.buildPart().getResult().getPart());
    }

}