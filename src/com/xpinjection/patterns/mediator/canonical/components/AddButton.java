package com.xpinjection.patterns.mediator.canonical.components;

import javax.swing.*;

import com.xpinjection.patterns.mediator.canonical.Mediator;
import com.xpinjection.patterns.mediator.canonical.Note;

import java.awt.event.ActionEvent;

/**
 * ���������� ���������� ����� �� ������� ����� �����. � ��� ���� ������ ����
 * ����� ������� � ����� �������� ����������� ����������.
 */
public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }
}
