package com.xpinjection.patterns.mediator.canonical.components;

import javax.swing.*;

import com.xpinjection.patterns.mediator.canonical.Mediator;

import java.awt.event.KeyEvent;

/**
 * ���������� ���������� ����� �� ������� ����� �����. � ��� ���� ������ ����
 * ����� ������� � ����� �������� ����������� ����������.
 */
public class TextBox extends JTextArea implements Component {
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
