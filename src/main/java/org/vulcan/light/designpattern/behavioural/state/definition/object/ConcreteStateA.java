package org.vulcan.light.designpattern.behavioural.state.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/1
 */
public class ConcreteStateA implements State {

    @Override
    public void handle() {
        System.out.println("Current state is A");
    }

}
