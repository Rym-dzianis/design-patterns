package com.dzianis.patterns.GoF.mediator.canonical.components;

import javax.swing.*;

import com.dzianis.patterns.GoF.mediator.canonical.Mediator;

import java.awt.event.KeyEvent;

/**
 * ���������� ���������� ����� �� ������� ����� �����. � ��� ���� ������ ����
 * ����� ������� � ����� �������� ����������� ����������.
 */
public class Title extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }
}
