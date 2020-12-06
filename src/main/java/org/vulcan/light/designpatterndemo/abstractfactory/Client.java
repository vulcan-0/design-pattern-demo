package org.vulcan.light.designpatterndemo.abstractfactory;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        productA1.use();
        AbstractProductB productB1 = factory1.createProductB();
        productB1.eat();

        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        productA2.use();
        AbstractProductB productB2 = factory2.createProductB();
        productB2.eat();
    }

}
