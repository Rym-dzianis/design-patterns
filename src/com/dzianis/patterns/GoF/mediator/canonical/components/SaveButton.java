package com.dzianis.patterns.GoF.mediator.canonical.components;

import javax.swing.*;

import com.dzianis.patterns.GoF.mediator.canonical.Mediator;

import java.awt.event.ActionEvent;

/**
 * ���������� ���������� ����� �� ������� ����� �����. � ��� ���� ������ ����
 * ����� ������� � ����� �������� ����������� ����������.
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
}
