package org.vulcan.light.designpattern.behavioural.mediator.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Sam Lu
 * @date 2021/7/5
 */
public class SaveButton extends JButton implements Component {

    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }

}
