package org.vulcan.light.designpattern.creational.factorymethod.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.anOperation();
        System.out.println(product.getName());
    }

}
