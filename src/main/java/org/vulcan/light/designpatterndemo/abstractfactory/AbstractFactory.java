package org.vulcan.light.designpatterndemo.abstractfactory;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public interface AbstractFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();

}
