package com.dzianis.patterns.GoF.mediator.canonical.components;

import javax.swing.*;

import com.dzianis.patterns.GoF.mediator.canonical.Mediator;

import java.awt.event.ActionEvent;

/**
 * ���������� ���������� ����� �� ������� ����� �����. � ��� ���� ������ ����
 * ����� ������� � ����� �������� ����������� ����������.
 */
public class DeleteButton extends JButton  implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }
}
