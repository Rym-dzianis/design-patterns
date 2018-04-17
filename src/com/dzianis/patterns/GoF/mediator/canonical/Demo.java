package com.dzianis.patterns.GoF.mediator.canonical;

import javax.swing.*;

import com.dzianis.patterns.GoF.mediator.canonical.components.AddButton;
import com.dzianis.patterns.GoF.mediator.canonical.components.DeleteButton;
import com.dzianis.patterns.GoF.mediator.canonical.components.Filter;
import com.dzianis.patterns.GoF.mediator.canonical.components.List;
import com.dzianis.patterns.GoF.mediator.canonical.components.SaveButton;
import com.dzianis.patterns.GoF.mediator.canonical.components.TextBox;
import com.dzianis.patterns.GoF.mediator.canonical.components.Title;

/**
 * ����-�����. ����� �� �������� �������.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        // �� ����� ���� �� ������� ��� �� Editor ��� ��������� ��������� �����������!!!!!!!!!!!!!!!!
        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
